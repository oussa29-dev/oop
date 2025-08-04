package src.Exo_8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Etudiant etudiant1= new Etudiant

    Groupe groupe1=new Groupe("1");
    Groupe groupe2=new Groupe("2");

    Niveau  niveau1=new Niveau("1");
    Niveau  niveau2=new Niveau("2");


    Etudiant etudiant1= new Etudiant("Benkhaoua","Oussama","123",niveau1,groupe1);
    Etudiant etudiant2= new Etudiant("John","Clever","456",niveau2,groupe2);
    Etudiant etudiant3= new Etudiant("steeve","sohn","789",niveau2,groupe2);
    Etudiant etudiant4= new Etudiant("sandra","tomson","321",niveau1,groupe1);
    Etudiant etudiant5= new Etudiant("tony","bradly","654",niveau1,groupe1);

    Module module1=new Module("1");
    niveau1.addModule(module1);

    Module module2=new Module("1");
    niveau1.addModule(module2);

    Seance seance1 = new Seance(LocalDateTime.parse("2025-08-02T14:30:00") , module1,groupe1);
    Seance seance2 = new Seance(LocalDateTime.parse("2025-08-03T08:30:00") , module2,groupe2);
    Seance seance3 = new Seance(LocalDateTime.parse("2025-08-04T10:30:00") , module1,groupe1);

    Assiduite assiduite1=new Assiduite("2025");
    assiduite1.addSeance(seance1);
    assiduite1.addSeance(seance2);
    assiduite1.addSeance(seance3);

    assiduite1.addGroup(groupe1);
    assiduite1.addGroup(groupe2);

    seance1.addAbsent(new ArrayList<>(Arrays.asList(etudiant1, etudiant4, etudiant5)));
    seance2.addAbsent(etudiant2);
    seance3.addAbsent(etudiant1);

    for (Groupe g:assiduite1.getGroupes()) {
        for (Etudiant e:g.getEtudiants()) {
             int nbr = 0;
            System.out.println(e.toString());
            for(Seance s: assiduite1.getSeances()){
                for (Etudiant et:s.getAbsents()){
                if (et.getMatricule().equals(e.getMatricule())) nbr++;
                }
            }
            System.out.println("nombre d'absence est "+nbr);
        }
    }


    }
}
