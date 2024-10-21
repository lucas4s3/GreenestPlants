package BestGym;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String filepath = "src/BestGym/GymInläsning.txt";
            List<Person> personlist = readClass.listPerson(filepath);
            List<Person> activeMembers = LogicReader.getActiveMember(personlist);
            readClass.writeDataToFile("src/BestGym/aktivamedlemmar.txt", activeMembers);

            while (true) {
                System.out.print("Vill du kontrollera fler kunder? (Y/N): ");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    sc.close();
                    return;
                } else
                    System.out.println("Fel inmatning");
            }

        }

    }
}