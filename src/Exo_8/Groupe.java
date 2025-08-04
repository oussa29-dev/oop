package src.Exo_8;

import java.util.ArrayList;

public class Groupe {

    private String groupe;
    private ArrayList<Etudiant> etudiants = new ArrayList<>();


    public Groupe(String groupe, ArrayList<Etudiant> etudiants) {
        this.groupe = groupe;
        this.etudiants = etudiants;
    }

    public Groupe(String groupe) {
        this.groupe = groupe;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    @Override
    public String toString() {
        return "groupe= " + groupe ;
    }
}
