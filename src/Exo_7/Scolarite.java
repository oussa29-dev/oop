package src.Exo_7;

public class Scolarite {

   private Etudiant[] etudiants ;
   private int compteur;

    public Scolarite() {
        etudiants = new Etudiant[500];
        compteur = 0;
    }

    public void ajouterEtudiant(Etudiant etudiant) {

       if (compteur<etudiants.length) {
           etudiants[compteur] = etudiant;
           compteur++;
       }else{
           System.out.println("Les etudiant sont max");
       }

    }

    public int nbEtudiants() {
        return compteur;
    }

    public void afficher(){
        for (int i = 0; i < compteur; i++) {
            System.out.println(etudiants[i].toString());
        }
    }

    public void afficher(double seuil){
        for (int i = 0; i < compteur; i++) {
            if (etudiants[i].calculerMoyenne()<seuil) continue ;
            System.out.println(etudiants[i].toString());
        }
    }

}
