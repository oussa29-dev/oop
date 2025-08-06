package src.Exo_9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Film {
    private String titre;
    private LocalDate annéeProduction;
    private String réalisateur;
    private ArrayList<String> acteurs;
    private String synopsis;

    public Film(String titre, LocalDate annéeProduction, String réalisateur, ArrayList<String> acteurs, String synopsis) {
        this.titre = titre;
        this.annéeProduction = annéeProduction;
        this.réalisateur = réalisateur;
        this.acteurs = acteurs;
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", annéeProduction=" + annéeProduction +
                ", réalisateur='" + réalisateur + '\'' +
                ", acteurs=" + acteurs +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
