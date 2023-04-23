import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main(){
        super("Pola wyboru");
        this.setBounds(800,400,1000,500);
        this.setDefaultCloseOperation(3);
        initComponents();

    }

    public void initComponents(){
        ActionListener sluchacz = new Check();

        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);
        label.setFont(new Font("Monospaced", Font.PLAIN, 20));
        panel2.add(label);
        panel1.add(pochylony);
        panel1.add(pogrubiony);
        pogrubiony.addActionListener(sluchacz);
        pochylony.addActionListener(sluchacz);
    }

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel label = new JLabel("Piękny napis");

    JCheckBox pogrubiony= new JCheckBox("Pogrubiony");
    JCheckBox pochylony= new JCheckBox("Pochylony");


    public class Check implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int style = Font.PLAIN;
            if (pogrubiony.isSelected()){
                style += Font.BOLD;
            }
            if (pochylony.isSelected()){
                style += Font.ITALIC;
            }
            label.setFont(new Font(label.getFont().getFamily(), style, label.getFont().getSize()));
        }
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}