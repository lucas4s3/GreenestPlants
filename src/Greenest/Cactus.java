package Greenest;

import javax.swing.*;

public class Cactus extends plantsAtHotel {
    private double amountOfMineralWater = 0.2;

    public Cactus(double length, String name) {
        super(length, name);
    }

    @Override
    public void utSkrift() {
        super.utSkrift();
        JOptionPane.showMessageDialog(null, Plantor.CAC.plantorGreenest + ": " + this.name + "\nNäring per dag: " + this.amountOfMineralWater + "L " + nutritionPlan.M.nutrition);
    }
}
