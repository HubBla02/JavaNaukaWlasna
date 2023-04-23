import javax.swing.*;
import java.awt.*;


public class Main extends JFrame{
    public Main(){
        this.setTitle("Wycentrowana ramka :)");
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(new Dimension(szer/2, wys/2));
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setDefaultCloseOperation(3);
        this.setLocation((szer - szerRamki)/2, (wys - wysRamki)/2); // centrowanie
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}