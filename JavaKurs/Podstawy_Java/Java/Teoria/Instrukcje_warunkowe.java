package Java.Teoria;

public class Instrukcje_warunkowe {
    public static void main(String[] args) {
        // if i operatory
        int a = 5, b = 7, c = 9;
        if (a == b) {
            System.out.println("Równe");
        } else {
            System.out.println("Nierówne");
        }
        if (a > b && b < c) {
            System.out.println(a > b && b < c);
        }
        else if (a < b && b < c){
            System.out.println(a < b && b < c);
        }
        else{
            System.out.println("MAKAO");
        }
        // switch
        int zmienna = 5;
        switch(zmienna){
            case 0:
                System.out.println("Z jest równe 0");
                break;
            case 5:
                System.out.println("Z jest równe 5");
                break;
            default:
                System.out.println("Z nie wynosi ani 0 ani 5");
        }
        // Warunkowe
        boolean czyParzysta = zmienna % 2 == 0 ? true : false;
        System.out.println(czyParzysta);
    }
}
