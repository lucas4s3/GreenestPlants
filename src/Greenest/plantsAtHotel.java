package Greenest;

public class plantsAtHotel implements IVäxter {
    protected String name;
    protected double length;

    plantsAtHotel(double length, String name) {
        this.length = length;
        this.name = name;
    }

    @Override
    public void utSkrift() {

    }
}

enum nutritionPlan {
    W("Kranvatten"), M("Mineralvatten"), P("Proteindryck");
    public final String nutrition;

    nutritionPlan(String nutrition) {
        this.nutrition = nutrition;
    }
}

enum Plantor {
    PALM("Palm"), CAC("Kaktus"), EATING("Köttätande växt");
    public final String plantorGreenest;

    Plantor(String plantorGreenest) {
        this.plantorGreenest = plantorGreenest;
    }
}



