package src.Exo_8;

public class Module {
    private String module;
    private Niveau niveau;

    public Module(String module) {
        this.module = module;
    }
    public Module(String module,Niveau niveau){
        this.module = module;
        this.niveau = niveau;
        niveau.addModule(this);
    }
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
        niveau.addModule(this);
    }
}
