package hra;

//@author Adam

import javax.swing.JFrame;


public class Hra extends JFrame {
    
    private Thread thread;
    private boolean beh;
    
    public Hra(){
        new GrafickeRozhrani("Hra", this);
    }
    
    public synchronized void start(){
        thread = new Thread();
        thread.start();
        beh = true;
    }
    
    public synchronized void stop(){
        try {
            thread.join();
            beh = false;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Hra();            
    }
    
}
