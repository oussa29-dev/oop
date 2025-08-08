package src.Exo_10;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrez votre nom : ");
//        String nom = scanner.nextLine();
//
//        System.out.print("Entrez votre prénom : ");
//        String prénom = scanner.nextLine();
//
//        System.out.print("Entrez votre âge : ");
//        int âge = scanner.nextInt();

//        Personne[] Employés = new Personne[5];
//
//        String[] modules1 = {"Mathématiques", "Informatique"};
//        Enseignant enseignant1 = new Enseignant("Dupont", "Jean", 45, 1234567890123L, modules1);
//        Employés[0]=enseignant1;
//
//        String[] modules2 = {"Physique", "Chimie", "Biologie"};
//        Enseignant enseignant2 = new Enseignant("Lemoine", "Sophie", 38, 9876543210987L, modules2);
//        Employés[1]=enseignant2;
//
//        double[] notes1 = {15.5, 13.0, 17.2};
//        Etudiant etudiant1 = new Etudiant("Benkhaoua", "Oussama", 21, 1001, notes1);
//        Employés[2]=etudiant1;
//
//        double[] notes2 = {12.0, 14.5, 11.0};
//        Etudiant etudiant2 = new Etudiant("Lounis", "Sara", 20, 1002, notes2);
//        Employés[3]=etudiant2;
//
//        double[] notes3 = {18.0, 19.5, 17.0};
//        Etudiant etudiant3 = new Etudiant("Khelifi", "Yacine", 22, 1003, notes3);
//        Employés[4]=etudiant3;
//
//        for (Personne p:Employés){
//            p.afficher();
//        }
//        double[] notes3 = {18.0, 19.5, 17.0};
//        Etudiant etudiant3 = new Etudiant("Khelifi", "Yacine", 22, 1003, notes3);
//        etudiant3.afficherType();


        // Création des étudiants
        double[] notes1 = {15.5, 13.0, 17.2};
        Etudiant etudiant1 = new Etudiant("Benkhaoua", "Oussama", 21, 1001, notes1);

        double[] notes2 = {12.0, 14.5, 11.0};
        Etudiant etudiant2 = new Etudiant("Lounis", "Sara", 20, 1002, notes2);

        double[] notes3 = {18.0, 19.5, 17.0};
        Etudiant etudiant3 = new Etudiant("Khelifi", "Yacine", 22, 1003, notes3);

        // Tableau d'étudiants
        Etudiant[] etudiants = {etudiant1, etudiant2, etudiant3};

        // Tri du tableau d'étudiants (par moyenne décroissante)
        Arrays.sort(etudiants);

        System.out.println("== Étudiants triés ==");
        for (Etudiant e : etudiants) {
            e.afficher();
        }

        // Création des enseignants
        String[] modules1 = {"Mathématiques", "Informatique"};
        Enseignant enseignant1 = new Enseignant("Dupont", "Jean", 45, 1234567890123L, modules1);

        String[] modules2 = {"Physique", "Chimie", "Biologie"};
        Enseignant enseignant2 = new Enseignant("Lemoine", "Sophie", 38, 9876543210987L, modules2);

        // Tableau d'enseignants
        Enseignant[] enseignants = {enseignant1, enseignant2};

        // Tri du tableau d'enseignants (par nom)
        Arrays.sort(enseignants);

        System.out.println("\n== Enseignants triés ==");
        for (Enseignant ens : enseignants) {
            ens.afficher();

        }
    }
}
