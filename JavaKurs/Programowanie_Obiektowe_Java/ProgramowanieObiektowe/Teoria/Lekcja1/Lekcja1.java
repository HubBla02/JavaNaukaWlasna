package Teoria.Lekcja1;

public class Lekcja1 {
    public static void main(String[] args){
        Monitor m1 = new Monitor();
        Monitor m2 = new Monitor();
        m1.szerokosc = 20;
        m2.wysokosc = 30;
        System.out.println(m1.szerokosc);
        System.out.println(m2.wysokosc);

    }
    static class Monitor{
        int szerokosc;
        int wysokosc;
        void wlacz(){};
        void wylacz(){};

    }

}
