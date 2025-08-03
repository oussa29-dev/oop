package src.Exo_7;

public class Etudiant {

    private String nom, prenom,matricule;
    private double[] mod;

    public Etudiant(String nom, String prenom, String matricule, double mod1, double mod2, double mod3) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        mod = new double[3];
        mod[0] = mod1;
        mod[1] = mod2;
        mod[2] = mod3;
    }

    public Etudiant(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", mod1=" + mod[0] +
                ", mod2=" + mod[1] +
                ", mod3=" + mod[2] +
                '}';
    }

    public double calculerMoyenne (){

        return  (mod[0] + mod[1] + mod[2]) /3;

    }


}
