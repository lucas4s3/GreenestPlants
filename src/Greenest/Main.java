package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Palm Laura = new Palm(5, "Laura");
        Cactus Igge = new Cactus(0.2, "Igge");
        CarnPlant Meatloaf = new CarnPlant(0.7, "Meatloaf");
        // Polymorphism
        plantsAtHotel Olof = new Palm(1.0, "Olof");
        List<plantsAtHotel> plantList = new ArrayList<>();
        plantList.add(Meatloaf);
        plantList.add(Igge);
        plantList.add(Olof);
        plantList.add(Laura);
        while (true) {
            int counter = 0;
            String nameAnswer = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
            if (nameAnswer == null) {
                JOptionPane.showMessageDialog(null, "Du har avbrutit programmet.");
                break;
            } else if (nameAnswer.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Du har inte matat in något");
                continue;
            }
            for (plantsAtHotel p : plantList) {
                if (nameAnswer.equalsIgnoreCase(p.getName())) {
                    p.plantPrint();
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                JOptionPane.showMessageDialog(null, "Du har matat in fel växt.");
                continue;
            }
            int answerContinue = JOptionPane.showConfirmDialog(null,"Vill du kontrollera flera växter?");
            if (answerContinue == 1 || answerContinue == 2 || answerContinue == -1){
                JOptionPane.showMessageDialog(null, "Du har avbrutit programmet.");
                break;
            }
        }
    }
}




