import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public Main(){
        super("Własne menu");
        this.setBounds(800,400,1000,500);
        this.setDefaultCloseOperation(3);
        panel.setLayout(new GridLayout(3, 1));
        initComponents();

    }

    public void initComponents(){
        kontener.add(panel);
        panel.add(menu1);
        panel.add(menu2);
        panel.add(menu3);
    }

    private Container kontener = this.getContentPane();
    private JPanel panel = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("2. Usuń");
    private MenuButton menu3 = new MenuButton("3. Zmień");
    private int i = 0;

    private class MenuButton extends JButton implements FocusListener, ActionListener {
        private Color kFocusGained = Color.red;
        private Color kFocusLost = Color.blue;

        private void keyPressedhandler(KeyEvent e){
            int dlMenu = panel.getComponentCount();
            if (i == 0) i = 10*dlMenu;
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                panel.getComponent(++i%dlMenu).requestFocus();
            }
            else if (e.getKeyCode() == KeyEvent.VK_UP){
                panel.getComponent(--i%dlMenu).requestFocus();
            }
            else if (e.getKeyCode() == KeyEvent.VK_ENTER){
                ((MenuButton) e.getSource()).doClick();
            }
        }
        public MenuButton(String text){
            super(text);
            this.setBackground(Color.BLUE);
            this.addFocusListener(this);
            this.addActionListener(this);
            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    keyPressedhandler(e);
                }
            });

        }

        @Override
        public void focusGained(FocusEvent e) {
            this.setBackground(kFocusGained);
        }

        @Override
        public void focusLost(FocusEvent e) {
            this.setBackground(kFocusLost);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}