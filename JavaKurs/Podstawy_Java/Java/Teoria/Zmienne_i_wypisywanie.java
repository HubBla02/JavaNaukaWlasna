package Java.Teoria;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zmienne_i_wypisywanie{
    public static void main(String[] args) {
        //Nie jest to mój pierwszy kod w tym języku :)
        //Zmienne i wypisywanie
        //short 16 bitów
        //int 32 bity
        int a = 10;
        int b = 6;
        int c = a + b;
        System.out.println(c);
        //long 64 bity
        long aa = 123456789L;
        long bb = aa + a;
        System.out.println(bb);
        //double 64 bity
        double d = 3.5;
        double e =  21.37;
        System.out.println(d+e);
        //Zmienne tekstowe
        char znak = '+';
        String imie = "Hubert";
        String nazwisko = "Błaszkiewicz";
        System.out.println("Imię: " + imie + "\nNaziwsko: " + nazwisko);
        // 1. Małe litery 2. Nie używamy nazw keywordów 3. Brak liczby 4. Zmienne samoopisujące się 5. Brak spacji!
        // 6. Stałe zapisujemy wielką literą (powiedzcie to Prologowi!)
        // Rzutowanie:
        int l1 = 5;
        int l2 = 2;
        System.out.println((double)l1 / l2);
    }
}