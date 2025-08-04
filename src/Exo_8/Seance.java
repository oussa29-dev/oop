package src.Exo_8;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Seance {
    private LocalDateTime creneau ;
    private Module module ;
    private Groupe groupe;
    private ArrayList<Etudiant> absents = new ArrayList<>();

    public Seance(LocalDateTime creneau, Module module, Groupe groupe, ArrayList<Etudiant> absents) {
        this.creneau = creneau;
        this.module = module;
        this.groupe = groupe;
        this.absents = absents;
    }

    public Seance(LocalDateTime creneau, Module module, Groupe groupe) {
        this.creneau = creneau;
        this.module = module;
        this.groupe = groupe;
    }
    public void addAbsent (ArrayList<Etudiant> absents) {
        this.absents.addAll(absents);

    }
    public void addAbsent(Etudiant etudiant) {
        this.absents.add(etudiant);
    }

    public ArrayList<Etudiant> getAbsents() {
        return absents;
    }

    public void setAbsents(ArrayList<Etudiant> absents) {
        this.absents = absents;
    }
}
