package src.Exo_10;
abstract public class Personne {

    private String nom;
    private String prénom;
    private int âge;

    public Personne(String nom, String prénom, int âge) {
        this.nom = nom;
        this.prénom = prénom;
        this.âge = âge;
    }

    public void afficher() {
        System.out.println("Personne{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", âge=" + âge +
                '}');
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    abstract public void afficherType();
}
