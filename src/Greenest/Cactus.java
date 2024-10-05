package Greenest;

import javax.swing.*;

public class Cactus extends plantsAtHotel {
    //inkapsling
    private double amountOfMineralWater = 0.02;

    public Cactus(double length, String name) {
        super(length, name);
        this.length = length;
        this.name = name;
    }

    @Override
    public void plantPrint() {
        JOptionPane.showMessageDialog(null, "Kaktus: " + this.name + "\nNäring per dag: " + this.amountOfMineralWater + "L " + nutritionPlan.M.nutrition);
    }
}
