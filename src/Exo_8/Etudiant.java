package src.Exo_8;

import java.util.ArrayList;

public class Etudiant {

    private String nom,prenom,matricule;
    private Niveau niveau;
    private Groupe groupe;

    public Etudiant(String nom, String prenom, String matricule, Niveau niveau, Groupe groupe) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.niveau = niveau;
        this.groupe = groupe;
        groupe.addEtudiant(this);
    }

    public Etudiant(String nom, String prenom, String matricule, Niveau niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.niveau = niveau;
    }

    public Etudiant(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
        groupe.addEtudiant(this);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", niveau=" + niveau +
                ", groupe=" + groupe +
                '}';
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
