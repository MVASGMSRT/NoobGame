package game1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GrafickeRozhrani extends JFrame {
    
    JTextField cislo1Field;
    JPanel panel1;
    
    public GrafickeRozhrani(){
        super("Generátor čísel");
        
        panel1 = new JPanel ();
        add(panel1);
        
        cislo1Field = new JTextField(" ", 10);
        panel1.add(cislo1Field);
    }
}
