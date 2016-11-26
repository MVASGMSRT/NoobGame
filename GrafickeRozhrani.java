package hra;

import javax.swing.JFrame;

public class GrafickeRozhrani extends JFrame {
    
    public GrafickeRozhrani(String title, Hra hra){

        JFrame frame = new JFrame (title);
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    
        frame.add(hra);
        hra.start();
    }
    
}
