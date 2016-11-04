package game1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NahodnaCisla {
    int velikostPole = 10;
    Random random = new Random ();
    int generace = 0;
    
    private int getNahodneCislo(){
        int cislo = 0;
        while (cislo <= 0) {
            cislo = random.nextInt(10);
            generace++;
        }
        return cislo;
    }
    
    public int getPocetGenerace(){
        return generace;
    }
    
    public int getVelikostPole(){
        return velikostPole;
    }
    
    public void setVelikostPole(int velikostPole) {
        this.velikostPole = velikostPole;
    }
    
    public Integer[] getPoleNahodnychCisel(){
        Set<Integer> nahodnaCisla = new HashSet<> ();
        while (nahodnaCisla.size() < getVelikostPole()){
            int noveCislo = getNahodneCislo ();
            nahodnaCisla.add(noveCislo);
        }
        return new ArrayList<>(nahodnaCisla).toArray(new Integer[nahodnaCisla.size()]);
    }
}
