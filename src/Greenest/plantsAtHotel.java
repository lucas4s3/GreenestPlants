package Greenest;

public class plantsAtHotel implements IPlants {
    //inkaplsing
    protected String name;
    protected double length;

    plantsAtHotel(double length, String name) {
        this.length = length;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void plantPrint() {

    }
}

enum nutritionPlan {
    W("Kranvatten"), M("Mineralvatten"), P("Proteindryck");
    public final String nutrition;

    nutritionPlan(String nutrition) {
        this.nutrition = nutrition;
    }
}



