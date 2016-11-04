package game1;

import javax.swing.JFrame;

public class Game1 {

    public static void main(String[] args) {
        
        GrafickeRozhrani okno = new GrafickeRozhrani ();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setLocationRelativeTo(null);
        okno.pack();
        okno.setSize(300, 100);
        
        NahodnaCisla generator = new NahodnaCisla();
        
        Integer[] pole = generator.getPoleNahodnychCisel();
        System.out.println("Vyslede je: " + generator.getPocetGenerace());
        System.out.println("Vygenerovana cisla: ");
        for (Integer cislo : pole) {
            System.out.println(cislo + " ");
        }
        System.out.println(" ");
    }
    
}
