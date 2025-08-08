package src.Exo_10;
import java.util.Arrays;

public class Enseignant extends Personne implements Comparable<Enseignant> {
    private long numéroSécuritéSociale;
    String[] modules ;

    public Enseignant(String nom, String prénom, int âge, long numéroSécuritéSociale, String[] modules) {
        super(nom, prénom, âge);
        this.numéroSécuritéSociale = numéroSécuritéSociale;
        this.modules = modules;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Enseignant{" +
                "numéroSécuritéSociale=" + numéroSécuritéSociale +
                ", modules=" + Arrays.toString(modules) +
                '}');
    }

    public void afficherType(){
        System.out.println("Ceci est un enseignant");
    }


    @Override
    public int compareTo(Enseignant other) {
        int compareNom = this.getNom().compareToIgnoreCase(other.getNom());
        if (compareNom != 0) {
            return compareNom;
        } else {
            return this.getPrénom().compareToIgnoreCase(other.getPrénom());
        }
    }


}
