package src.Exo_10;
import java.util.Arrays;

public class Etudiant extends Personne implements Comparable<Etudiant> {
    private int matricule;
    private double[] notes = new double[3];

    public Etudiant(String nom, String prénom, int âge, int matricule, double[] notes) {
        super(nom, prénom, âge);
        this.matricule = matricule;
        this.notes = notes;
    }
    public double claculMoyenne() {
        double somme=0;
        for (int i = 0; i < notes.length; i++) {
            somme=somme+notes[i];
        }
        return somme/notes.length;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Etudiant{" +
                "matricule=" + matricule +
                ", notes=" + Arrays.toString(notes) +
                '}');
    }

    public void afficherType(){
        System.out.println("Ceci est un etudiant");
    }

    @Override
    public int compareTo(Etudiant autre) {
        // Tri décroissant → on inverse la soustraction
        return Double.compare(autre.claculMoyenne(), this.claculMoyenne());
    }

}
