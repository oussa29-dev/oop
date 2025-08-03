package src.Exo_7;

public class Test {
    public static void main(String[] args) {
        Etudiant etd1 = new Etudiant("n1","p1","a1", 10,10,10);
        Etudiant etd2 = new Etudiant("n2","p2","a", 11,11,11);
        Etudiant etd3 = new Etudiant("n3","p3","a", 12,12,12);
        Etudiant etd4 = new Etudiant("n4","p4","a4", 13,13,13);
        Scolarite scolarite = new Scolarite();
        scolarite.ajouterEtudiant(etd1);
        scolarite.ajouterEtudiant(etd2);
        scolarite.ajouterEtudiant(etd3);
        scolarite.ajouterEtudiant(etd4);
        scolarite.afficher();
        scolarite.afficher(12);
    }
}