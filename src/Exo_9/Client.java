package src.Exo_9;

public class Client {

    private int numéro;
    private int séancesAssisté;

    public int getNuméroClient() {
        return numéro;
    }

    public void incrémenterSéancesAssisté(){
        séancesAssisté++;
    }

    public int getSéancesAssisté() {
        return séancesAssisté;
    }
}
