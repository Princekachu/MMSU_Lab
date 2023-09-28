/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedev;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prince Tagalicud
 */
public class Main {
    
    JFrame frame = new JFrame("Area Calculator: Circle");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Area Calculator");
    JButton button = new JButton("Start");
    
    Main() {
        
       
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set panel layout to null
        panel.setLayout(null);
        
        // Change label properties
        label.setBounds(135, 40, 250, 100);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(label);
        
        // Set button location
        button.setBounds(185, 155, 100, 30);
        panel.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Code to execute when button is clicked
                String diameterStr = JOptionPane.showInputDialog(null, "Input Diameter", "Diameter", JOptionPane.QUESTION_MESSAGE);
                
                double diameter = Double.parseDouble(diameterStr);
                double radius = diameter / 2;
                double area = Math.PI * radius * radius;
                
                JOptionPane.showMessageDialog(null, "Diameter: " + area, "Diameter", JOptionPane.INFORMATION_MESSAGE);
            } 
        });
        
        // Add the JPanel to the JFrame
        frame.add(panel);

        // Set the JFrame to visible
        frame.setVisible(true);
    }    
    public static void main(String[] args) {
        
        new Main();
    }
}
