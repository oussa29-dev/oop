public class Operandes {

    private int i=0,j=0;

    public Operandes(int i,int j){this.i=i;this.j=j;}

    public Operandes() {}

    public void setI(int i) { this.i = i; }
    public void setJ(int j) { this.j = j; }

    public void somme(){System.out.println("La somme des deux nombres est "+
            Operation.somme(i,j));}

    public void difference(){System.out.println("La diffirence des deux nombres est "+
            Operation.difference(i, j));}

    public void produit(){System.out.println("Le produit des deux nombres est "+
            Operation.produit(i, j));}

    public void moyenne(){System.out.println("La moyenne des deux nombres est "+
            Operation.moyenne(i, j));}

    public void NombreLePlusGrand(){System.out.println("Le nombre le plus grand est "+
            Operation.plusGrand(i, j));}


}
