package BestGym;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readClass {

    public static List<Person> listPerson(String reader) {
        String firstLine;
        String secondLine;
        Path inFilePath;
        List<Person> personData = new ArrayList<>();
        inFilePath = Paths.get(reader);

        try (Scanner fileScanner = new Scanner(inFilePath)) {
            while (fileScanner.hasNextLine()) {
                firstLine = fileScanner.nextLine();
                String[] personDataFirstLine = firstLine.split(",");

                if (fileScanner.hasNextLine()) {
                    secondLine = fileScanner.nextLine();
                    String memberShipDate = secondLine.trim();

                    Person p = new Person(memberShipDate, personDataFirstLine[1].trim(), personDataFirstLine[0].trim());
                    personData.add(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Kunde inte läsa filen");
        }

        return personData;
    }

    public static void writeDataToFile(String writeToFile, List<Person> activeMemberList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime today = LocalDateTime.now();
        Path outFilePath = Paths.get(writeToFile);
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath, StandardOpenOption.CREATE, StandardOpenOption.APPEND))) {
            for (Person p : activeMemberList) {
                w.println(p.getSocialSecurityNumber() + " " + p.getName());
                w.println(today.format(formatter));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hittade inte filen");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Gick inte att skriva till fil");
            System.exit(0);
        } catch (Exception e){
            System.out.println("Något gick fel");
        }

    }
}
