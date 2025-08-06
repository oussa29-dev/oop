package src.Exo_9;

import java.time.LocalDate;
import java.time.LocalTime;

public class Séance {
    private int numéro;
    private LocalDate date;
    private LocalTime heureDébut;
    private LocalTime heureFin;
    private Float tarif;
    private Film filmProjeté;

    public Séance(int numéro,LocalDate date, LocalTime heureDébut, LocalTime heureFin, Float tarif, Film filmProjeté) {
        this.numéro = numéro;
        this.date = date;
        this.heureDébut = heureDébut;
        this.heureFin = heureFin;
        this.tarif = tarif;
        this.filmProjeté = filmProjeté;
    }

    @Override
    public String toString() {
        return "Séance{" +
                "numéro=" + numéro +
                ", date=" + date +
                ", heureDébut=" + heureDébut +
                ", heureFin=" + heureFin +
                ", tarif=" + tarif +
                ", filmProjeté=" + filmProjeté +
                '}';
    }

    public Film getFilmProjeté() {
        return filmProjeté;
    }

    public int getNuméro() {
        return numéro;
    }

    public float getTarif() {
        return tarif;
    }
}
