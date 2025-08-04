package src.Exo_8;

import java.util.ArrayList;

public class Niveau {
    private String niveau;
    private ArrayList<Module> modules =new ArrayList<>();

    public Niveau(String niveau, ArrayList<Module> modules) {
        this.niveau = niveau;
        this.modules = modules;
    }

    public Niveau(String niveau) {
        this.niveau = niveau;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public void addModule(Module module) {
        this.modules.add(module);
    }

    @Override
    public String toString() {
        return "niveau= " + niveau;
    }
}
