package game1;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GrafickeRozhrani extends JFrame {
    private JTextField cislo1Field;
    private JTextField cislo2Field;
    private JTextField cislo3Field;
    private JTextField cislo4Field;
    private JTextField cislo5Field;
    private JTextField cislo6Field;
    
    public GrafickeRozhrani(){
        super("Generátor čísel");
        
        cislo1Field = new JTextField();
        cislo2Field = new JTextField();
        cislo3Field = new JTextField();
        cislo4Field = new JTextField();
        cislo5Field = new JTextField();
        cislo6Field = new JTextField();
        
    }
}
