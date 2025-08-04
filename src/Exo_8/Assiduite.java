package src.Exo_8;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Assiduite {
    private String year;
    private ArrayList<Seance> seances = new ArrayList<>();
    private ArrayList<Groupe> groupes = new ArrayList<>();


    public Assiduite(String year) {
        this.year = year;
    }

    public Assiduite(String year, ArrayList<Seance> seances, ArrayList<Groupe> groupes) {
        this.year = year;
        this.seances = seances;
        this.groupes = groupes;
    }

    public Assiduite(String year, ArrayList<Seance> seances) {
        this.year = year;
        this.seances = seances;
    }

    public ArrayList<Seance> getSeances() {
        return seances;
    }

    public void setSeances(ArrayList<Seance> seances) {
        this.seances = seances;
    }
    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    public ArrayList<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(ArrayList<Groupe> groupes) {
        this.groupes = groupes;
    }

    public void addGroup(Groupe groupe) {
        this.groupes.add(groupe);
    }
}
