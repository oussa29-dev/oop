package src.Exo_9;

import java.util.ArrayList;

public class Cinéma {
    private String nom;
    private String adresse;
    private ArrayList<Salle> salles;
    private ArrayList<Client> ClientsFidèles = new ArrayList();

    public Cinéma(ArrayList<Salle> salles) {
        this.salles = salles;
    }

    public void consulter(){
        for(Salle s: salles){
            for(Séance si:s.getSéances()){
                System.out.println(si.toString());
                System.out.println(si.getFilmProjeté().toString());
            }
        }
    }

    public boolean clientFidèle(int numéroClient) {
        int i = 0;
        boolean j = false;
        do {
            if (numéroClient == ClientsFidèles.get(i++).getNuméroClient()) {
                j = true;
            }
        } while (!j && i < ClientsFidèles.size());
        if (!j) {
            return false;
        }
        return true;
    }

    public Salle séanceSalle(int numéroSéance) {

        int i1 = 0;
        boolean j = false;
        do {
            int i2 = 0;
            ArrayList<Séance> listeSéances = salles.get(i1).getSéances();
            do {
                if (listeSéances.get(i2++).getNuméro() == numéroSéance) {
                    j = true;
                }
            } while (!j && i2 < listeSéances.size());

        } while (!j && i1 < salles.size());
        if (j) {
            return salles.get(i1);
        }

        return null;
    }

    public Séance filmSéance(Salle salle, int numéroSéance) {
        for (Séance s : salle.getSéances()) {
            if (s.getNuméro() == numéroSéance) {
                return s;
            }
        }
        return null;
    }

    public Client client(int numéroClient) {
        for (Client c : ClientsFidèles) {
            if (c.getNuméroClient() == numéroClient) {
                return c;
            }
        }
        return null;
    }

    public float réserver(int numéroClient, int numéroSéance) {

        boolean fidèle = clientFidèle(numéroClient);

        if (fidèle) {

            Salle salle = séanceSalle(numéroSéance);

            if (salle.getCapacité() < salle.getCapacitéMax()) {

                Client clientVérifié = client(numéroClient);
                clientVérifié.incrémenterSéancesAssisté();
                salle.incrémenterCapacité();
                Séance séance = filmSéance(salle, numéroSéance);

                if (clientVérifié.getSéancesAssisté()>=25) {
                    return séance.getTarif()*0.95f;
                }
                return séance.getTarif();
            }

        }

        return 0;
    }
}
