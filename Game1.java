package game1;

import javax.swing.JFrame;

public class Game1 {

    public static void main(String[] args) {
        GrafickeRozhrani okno = new GrafickeRozhrani ();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setLocationRelativeTo(null);
    }
    
}
