package Ramka;

import javax.swing.*;
import java.awt.*;

public class Main {

    public Main(){
        JFrame frame = new JFrame("Pierwsza ramka :)");
        frame.pack();
        // frame.setTitle("Pierwsza ramka :)");
        frame.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE -> W WindowsComponents wartość 3 oznacza zamknięcie po wciśnięciu krzyżyka
        //frame.setSize(new Dimension(1000, 500));
        //frame.setLocation(300, 400);
        frame.setBounds(300, 400, 1000, 500);
        frame.setResizable(true); // -> możliwość poruszania
        frame.setVisible(true); // -> widoczność
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Serducho.png"));
    }
    public static void main(String[] args) {
        new Main();


    }
}