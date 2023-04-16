package Teoria.Lekcja7;

public class Lekcja7Dziedziczenie {
    public static void main(String[] args) {
        Potwor p = new Potwor(10, 100);
        Szkielet s = new Szkielet(20, 50, "łuk");
        Zombie z = new Zombie();
        System.out.println(s.bron);
        s.atakuj();
        Potwor dziwny = new Szkielet(20, 30, "łańcuch");
        dziwny.atakuj();
    }
}
class Potwor{
    protected double predkosc = 10; // żeby rozszerzyć i operować
    double HP;
    void atakuj(){
        System.out.println("Metoda atakuj!");
    }
    public Potwor(){

    }
    public Potwor(double predkosc, double HP){
        this.predkosc = predkosc;
        this.HP = HP;

    }
}
class Szkielet extends Potwor{
    String bron;

    public Szkielet(double predkosc, double HP, String bron){
        super(predkosc, HP);
        this.bron = bron;
    }

    @Override
    public void atakuj(){
        super.atakuj();
        System.out.println("Pew pew");
    }
}

class Zombie extends Potwor{
    public Zombie(){

    }
}