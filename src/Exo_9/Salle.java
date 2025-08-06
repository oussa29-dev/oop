package src.Exo_9;

import java.util.ArrayList;

public class Salle {

    private int numéro;
    private int capacité=0;
    private final int capacitéMax;
    private ArrayList<Séance> Séances;

    public Salle( int capacitéMax, ArrayList<Séance> séances) {
        this.capacitéMax = capacitéMax;
        Séances = séances;
    }

    public ArrayList<Séance> getSéances() {
        return Séances;
    }

    public int getCapacité() {
        return capacité;
    }

    public int getCapacitéMax() {
        return capacitéMax;
    }

    public void incrémenterCapacité(){
        capacité++;
    }
}
