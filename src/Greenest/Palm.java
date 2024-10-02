package Greenest;

import javax.swing.*;

public class Palm extends plantsAtHotel {
    private double tapWaterPerMeter = 0.5;


    public Palm(double length, String name) {
        super(length, name);
    }

    @Override
    public void utSkrift() {
        JOptionPane.showMessageDialog(null, Plantor.PALM.plantorGreenest + ": " + this.name + "\nNäring per dag: " + (this.tapWaterPerMeter * this.length) + "L " + nutritionPlan.W.nutrition);
    }
}
