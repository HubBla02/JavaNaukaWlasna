package Teoria.Lekcja2;

public class Lekcja2Konstruktory {
    public static void main(String[] args){
        Punkt p = new Punkt();
        p.x = 5;
        p.y = 20;
        Punkt p2 = new Punkt(1, 10);

    }
}
class Punkt{
    Punkt(){
        x = 20;
        y = 20;

    }
    Punkt(int a, int b){
        this.x = a;
        this.y = b;
    }
    int x;
    int y;

}