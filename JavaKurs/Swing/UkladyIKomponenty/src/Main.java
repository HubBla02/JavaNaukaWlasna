import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    // Edycja całości
    public Main(){
        super("Komponenty itp.");
        this.setBounds(600, 200, 800, 600);
        this.setDefaultCloseOperation(3);
        initComponents();
    }

    // Komponenty
    public void initComponents(){
        centrum = new JButton("Sam środek");
        gora = new JButton("Jestem na górze");
        lewo = new JButton("Lewa strona");
        zartownis = new JButton("Skąd ja się tu wziąłem?");
        Container szybka = this.getContentPane();
        zartownis.setSize(100,50);
        zartownis.setLocation(231, 123);
        szybka.add(centrum, BorderLayout.CENTER);
        szybka.add(gora, BorderLayout.NORTH);
        szybka.add(lewo, BorderLayout.WEST);

    }

    JButton centrum;
    JButton gora;
    JButton lewo;
    JButton zartownis;
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}