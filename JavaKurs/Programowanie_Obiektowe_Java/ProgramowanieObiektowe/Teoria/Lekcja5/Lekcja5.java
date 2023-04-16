package Teoria.Lekcja5;

public class Lekcja5 {
    public static void main(String[] args){
        Matematyka test = new Matematyka();
        test.dodaj(10, 20);
        double wynik = Matematyka.dodaj(10, 30);
        System.out.println(wynik);
        System.out.println(Matematyka.PI);
        Klient a = new Klient("Jarek");
        Klient b = new Klient("Dżony");
        System.out.println(b.id);
    }
}
class Matematyka{
    static final double PI = 3.14;
    static double dodaj(double a, double b){return a + b;}
}
class Klient{
    String imie;
    static int id = 0;
    Klient(String imie){
        this.imie = imie;
        this.id += 1;
    }
}