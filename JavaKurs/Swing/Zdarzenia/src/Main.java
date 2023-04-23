import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main(){
        super("Menadżer");
        this.setBounds(800,400,1000,500);
        this.setDefaultCloseOperation(3);
        initComponents();

    }

    public void initComponents(){
        this.getContentPane().add(panel);
        Color defc = Color.white;
        panel.setBackground(defc);
        panel.add(red);
        panel.add(black);
        panel.add(def);
        red.addActionListener(new sluchacz(Color.red));
        black.addActionListener(new sluchacz(Color.black));
        def.addActionListener(new sluchacz(defc));
        buildButton("Blue", Color.blue);
    }

    JPanel panel = new JPanel();
    JButton red = new JButton("Red");
    JButton black = new JButton("Black");
    JButton def = new JButton("Default");

    public void buildButton(String nazwa, Color kolor){
        JButton but = new JButton(nazwa);
        but.addActionListener(new sluchacz(kolor));
        panel.add(but);
    }

    private class sluchacz implements ActionListener {
        Color kolor;

        public sluchacz(Color k){
            this.kolor = k;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(kolor);
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}