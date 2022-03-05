import Fraction.*;
class CalculModif {
    public static void main (String args[]) {
        Fraction Frac1 = new Fraction(2, 7);
        Fraction Frac2 = new Fraction(5, 13);

        System.out.println("\nLes fractions  : ");
        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println("Fraction N2 : " + Frac2.Affichage());

        Frac1.Addition(Frac1);
        Frac2.Addition(Frac2);

        System.out.println("\nLes addition  : ");
        System.out.println("Addition N1 : " + Frac1.Affichage());
        System.out.println("Addition N2 : " + Frac2.Affichage());

        Frac1.Multiplication(Frac1);
        Frac2.Multiplication(Frac2);

        System.out.println("\nLes multiplication  : ");
        System.out.println("Multiplication N1 : " + Frac1.Affichage());
        System.out.println("Multiplication N2 : " + Frac2.Affichage());

        Frac1.SimplifierFraction();
        Frac2.SimplifierFraction();

        System.out.println("\nLes fraction simplifier  : ");
        System.out.println("Fraction simplifier N1 : " + Frac1.Affichage());
        System.out.println("Fraction simplifier N2 : " + Frac2.Affichage());
    }
}