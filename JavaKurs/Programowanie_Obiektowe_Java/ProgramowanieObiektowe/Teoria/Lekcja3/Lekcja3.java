package Teoria.Lekcja3;

public class Lekcja3 {
    public static void main(String[] args){
    Test a = new Test();
    a.wypisz();
    a.wypisz2("Dowolny tekst");
    System.out.println(a.dodaj(3, 10));
    int wynik = a.dodaj(21, 37);
    System.out.println(wynik);
    }
}
class Test{
    void wypisz(){
        System.out.println("test!");
    }
    void wypisz2(String text){
        System.out.println(text);
    }

    int dodaj(int a, int b){
        return a + b;
    }
    // Przeciążenie
    double dodaj(double a, double b){return a + b;}
}
