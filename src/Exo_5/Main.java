//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package src.Exo_5;


public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]) ;
        int b = Integer.parseInt(args[1]) ;

        Operandes operandes= new Operandes(a,b);
//hey there
        operandes.difference();
        operandes.somme();
        operandes.moyenne();
        operandes.NombreLePlusGrand();
        operandes.produit();

    }
}