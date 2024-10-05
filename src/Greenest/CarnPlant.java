package Greenest;

import javax.swing.*;

public class CarnPlant extends plantsAtHotel {
    //inkapsling
    private double baseProtein = 0.1;
    private double contributionProteinPerMeter = 0.2;
    private double contributionCalc = this.contributionProteinPerMeter * this.length;

    public CarnPlant(double length, String name) {
        super(length, name);

    }

    @Override
    public void plantPrint() {
        JOptionPane.showMessageDialog(null, "Köttätande växt: " + this.name + "\nNäring per dag: " + (baseProtein + contributionCalc) + "L " + nutritionPlan.P.nutrition);
    }
}
