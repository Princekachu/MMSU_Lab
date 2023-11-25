package gamedev;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Prince Tagalicud
 */
public class DragDrop extends JFrame implements MouseListener, MouseMotionListener {
    
     private Rectangle box;
    
    private int screenWidth;
    private int screenHeight;
    
    private Color baseColor;
    
    DragDrop(String title, int width, int height) {
        
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        
        box = new Rectangle(100, 100, 150, 150);
        addMouseMotionListener(this);
        
        screenWidth = width;
        screenHeight = height;
        
        baseColor = this.getBackground();
    }
    
    public static void main(String[] args) {
        
        DragDrop win = new DragDrop("Drag And Drop", 500, 600);
        
        win.setVisible(true);
    }      
    
     public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(baseColor);
        g2d.fillRect(0, 0, screenWidth, screenHeight);

        g2d.setColor(Color.RED);
        g2d.fillRect((int) box.getX(), (int) box.getY(), (int) box.getWidth(), (int) box.getHeight());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        box.setLocation(e.getX(), e.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
