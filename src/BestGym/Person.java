package BestGym;

public class Person {
    private String name;
    private String socialSecurityNumber;
    private String memberShipDate;

    public Person(String memberShipDate, String name, String socialSecurityNumber) {
        this.memberShipDate = memberShipDate;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getMemberShipDate() {
        return memberShipDate;
    }
}
