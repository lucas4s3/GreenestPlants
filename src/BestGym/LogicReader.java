package BestGym;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicReader {

    public static List<Person> getActiveMember(List<Person> allPersons) {
        Scanner scanner = new Scanner(System.in);
        String userinput;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<Person> activeMembers = new ArrayList<>();
        boolean foundUser = false;

        System.out.print("Mata in namnet eller personnummer: ");
        userinput = scanner.nextLine().trim();

        LocalDate today = LocalDate.now();

        for (Person person : allPersons) {
            if (person.getName().equalsIgnoreCase(userinput) || person.getSocialSecurityNumber().equalsIgnoreCase(userinput)) {
                foundUser = true;
                LocalDate memberShipDate = LocalDate.parse(person.getMemberShipDate(),formatter);
                LocalDate dateChecker = memberShipDate.plusYears(1);
                if (!today.isAfter(dateChecker)) {
                    activeMembers.add(person);
                    System.out.println("Medlemskapet är fortfarande aktivt för: " + person.getName());
                } else
                    System.out.println("Medlemskapet har gått ut för: " + person.getName());

            }
        }

        if (!foundUser) {
            System.out.println("Personen hittades inte.");
        }

        return activeMembers;
    }
}
