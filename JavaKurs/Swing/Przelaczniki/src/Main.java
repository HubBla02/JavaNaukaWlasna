import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main(){
        super("Przełączniki");
        this.setBounds(800,400,1000,500);
        this.setDefaultCloseOperation(3);
        initComponents();

    }

    public void initComponents(){
        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(pk, BorderLayout.CENTER);
        this.getContentPane().add(main,BorderLayout.PAGE_END);
        main.add(cos);
        zbudujPrzelacznik("Numer 1", "Kliknięto 1", 50);
        zbudujPrzelacznik("Numer 2", "Kliknięto 2", 80);
        zbudujPrzelacznik("Z funkcji", "FUNKCJAAAAAAAA", 120);
        zbudujPrzelacznikK("Czerwony", Color.red);
        zbudujPrzelacznikK("Zielony", Color.green);
        zbudujPrzelacznikK("Niebieski", Color.blue);
    }

    JPanel panel = new JPanel();
    JPanel pk = new JPanel();
    JPanel main = new JPanel();
    JLabel cos = new JLabel("Coś");
    ButtonGroup grRadio = new ButtonGroup();
    ButtonGroup grKolor = new ButtonGroup();

    public void zbudujPrzelacznik(String nazwa, String text, final int rozmiar){
        JRadioButton b = new JRadioButton(nazwa);
        panel.add(b);
        grRadio.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cos.setText(text);
                cos.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, rozmiar));
            }
        });
    }

    public void zbudujPrzelacznikK(String nazwa, final Color k){
        JRadioButton b = new JRadioButton(nazwa);
        pk.add(b);
        grKolor.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cos.setForeground(k);
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}