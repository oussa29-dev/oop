package src.Exo_9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

    Film film1 = new Film(
            "Inception",
            LocalDate.of(2010, 7, 16),
            "Christopher Nolan",
            new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page")),
            "A mind-bending thriller about dreams within dreams."
    );

    Film film2 = new Film(
            "The Matrix",
            LocalDate.of(1999, 3, 31),
            "Lana Wachowski & Lilly Wachowski",
            new ArrayList<>(Arrays.asList("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss")),
            "A computer hacker learns about the true nature of his reality."
    );

    Film film3 = new Film(
            "Interstellar",
            LocalDate.of(2014, 11, 7),
            "Christopher Nolan",
            new ArrayList<>(Arrays.asList("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain")),
            "A team of explorers travel through a wormhole in space to ensure humanity's survival."
    );

    LocalDate date = LocalDate.of(2025, 8, 5);
    LocalDate date2 = LocalDate.of(2025, 8, 6);
    LocalDate date3 = LocalDate.of(2025, 8, 7);
    LocalTime heureDebut = LocalTime.of(14, 0);
    LocalTime heureFin = LocalTime.of(16, 0);
    LocalTime heureDebut2 = LocalTime.of(19, 0);
    LocalTime heureFin2 = LocalTime.of(21, 0);
    Float tarif = 1200.0f;

    Séance séance1 = new Séance(1,date, heureDebut, heureFin, tarif, film1);
    Séance séance2 = new Séance(2,date, heureDebut2, heureFin2, tarif, film1);
    Séance séance3 = new Séance(3,date2, heureDebut, heureFin, tarif, film2);
    Séance séance4 = new Séance(4,date2, heureDebut2, heureFin2, tarif, film2);
    Séance séance5 = new Séance(5,date3, heureDebut, heureFin, tarif, film3);
    Séance séance6 = new Séance(6,date3, heureDebut2, heureFin2, tarif, film3);

    ArrayList<Séance> séancesSalle1 = new ArrayList<>();
    ArrayList<Séance> séancesSalle2 = new ArrayList<>();
    ArrayList<Séance> séancesSalle3 = new ArrayList<>();

    séancesSalle1.add(séance1);
    séancesSalle1.add(séance2);
    séancesSalle2.add(séance3);
    séancesSalle2.add(séance4);
    séancesSalle3.add(séance5);
    séancesSalle3.add(séance6);

    Salle salle1 = new Salle(40,séancesSalle1);
    Salle salle2 = new Salle(50,séancesSalle2);
    Salle salle3 = new Salle(60,séancesSalle3);

    ArrayList<Salle> sallesCinéma = new ArrayList<>();
    sallesCinéma.add(salle1);
    sallesCinéma.add(salle2);
    sallesCinéma.add(salle3);

    Cinéma cinéma = new Cinéma(sallesCinéma);

    cinéma.consulter();
//
//        System.out.println("vous n'etes pas un client fidele tu ne pourrais pas " +
//                "réserver une place pour regarder un film.");

    }
}
