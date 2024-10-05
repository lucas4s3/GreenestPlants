package Greenest;

import javax.swing.*;

public class Palm extends plantsAtHotel {
    //inkapsling
    private double tapWaterPerMeter = 0.5;


    public Palm(double length, String name) {
        super(length, name);
    }

    @Override
    public void plantPrint() {
        JOptionPane.showMessageDialog(null, "Palm: " + this.name + "\nNäring per dag: " + (this.tapWaterPerMeter * this.length) + "L " + nutritionPlan.W.nutrition);
    }
}
