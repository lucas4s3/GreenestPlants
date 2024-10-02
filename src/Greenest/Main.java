package Greenest;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Palm Laura = new Palm(5, "Laura");
        Cactus Igge = new Cactus(0.2, "Igge");
        CarnPlant Meatloaf = new CarnPlant(0.7, "Meatloaf");
        // Polymorphism
        plantsAtHotel Olof = new Palm(1.0, "Olof");


        while (true) {
            String nameAnswer = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
            if (nameAnswer == null) {
                JOptionPane.showMessageDialog(null, "Du har avbrutit programmet.");
                break;
            } else if (nameAnswer.equalsIgnoreCase("Laura")) {
                Laura.utSkrift();
            } else if (nameAnswer.equalsIgnoreCase("Igge")) {
                Igge.utSkrift();
            } else if (nameAnswer.equalsIgnoreCase("Meatloaf")) {
                Meatloaf.utSkrift();
            } else if (nameAnswer.equalsIgnoreCase("Olof")) {
                Olof.utSkrift();
            } else {
                JOptionPane.showMessageDialog(null, "Du har inte matat in korrekt namn.");
                continue;
            }
            int answerContinue = JOptionPane.showConfirmDialog(null, "Vill du kontrollera fler plantor?");
            if (answerContinue == 1 || answerContinue == 2 || answerContinue == -1) {
                JOptionPane.showMessageDialog(null, "Du har avbrutit programmet.");
                break;
            }
        }
    }

}
