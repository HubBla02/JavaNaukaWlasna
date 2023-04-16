package Java.Teoria;

public class Operatory {
    public static void main(String[] args) {
        // Operatory arytmetyczne
        int a = 5;
        a += 2; // -= *= /=
        System.out.println(a);
        int b = a % 2;
        System.out.println(b);
        a++;
        b--;
        System.out.println(a+b);
        // Operatory relacyjne
        System.out.println(a == b);
        boolean isTrue = 4 != 5;
        System.out.println(isTrue);
        System.out.println(4 <= 6);
        /* Operatory logiczne:
        Koniunkcja: &&
        Alternatywa: ||
        Negacja: !
         */
        if (!(a == b) || a > 3){
            System.out.println("True");
        }
        // Operatory bitowe
        /* & - koniunkcja
           | - alternatywa
           ^ - XOR
           <<, >> - przesunięcia
           ~ - negacja
         */
        System.out.println(14&11);
        System.out.println(14|10);
        System.out.println(10<<2);
    }
}
