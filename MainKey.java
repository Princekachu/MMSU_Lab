package gamedev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainKey extends JFrame implements KeyListener {

    JPanel container = new JPanel(new BorderLayout());

    JPanel top = new JPanel();
    JPanel bottom = new JPanel();
    JPanel middle = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();

    JLabel topLbl = new JLabel("W Key");
    JLabel bottomLbl = new JLabel("X Key");
    JLabel middleLbl = new JLabel("S Key");
    JLabel leftLbl = new JLabel("A Key");
    JLabel rightLbl = new JLabel("D Key");

    Color bg = this.getBackground();

    MainKey(String title) {

        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addKeyListener(this);

        container.add(top, BorderLayout.NORTH);
        container.add(bottom, BorderLayout.SOUTH);
        container.add(middle, BorderLayout.CENTER);
        container.add(left, BorderLayout.WEST);
        container.add(right, BorderLayout.EAST);

        left.setLayout(new GridBagLayout());
        middle.setLayout(new GridBagLayout());
        right.setLayout(new GridBagLayout());

        top.add(topLbl);
        bottom.add(bottomLbl);
        middle.add(middleLbl);
        left.add(leftLbl);
        right.add(rightLbl);

        this.add(container);
    }

    public static void main(String[] args) {

        new MainKey("Keyboard Controls Demo");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_W){

            top.setBackground(Color.GREEN);
        } else if (e.getKeyCode() == KeyEvent.VK_X) {

            bottom.setBackground(Color.GREEN);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {

            left.setBackground(Color.GREEN);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {

            middle.setBackground(Color.GREEN);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {

            right.setBackground(Color.GREEN);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_W){

            top.setBackground(bg);
        } else if (e.getKeyCode() == KeyEvent.VK_X) {

            bottom.setBackground(bg);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {

            left.setBackground(bg);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {

            middle.setBackground(bg);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {

            right.setBackground(bg);
        }
    }
}
