package isc125gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package isc125gui;
/**
 *
 * @author c0502724
 */
public class ICS125GUI {
    JPanel p;
    JFrame f;
    JButton b;
    JLabel label;
    JTextField text;
    JTextField text2;
    JButton b2;
    JLabel label2;
    
    public ICS125GUI(){
        
        f = new JFrame("Basic Test!");
        p = new JPanel();
        b = new JButton("Click Me");
        b2 = new JButton("Click Me");
        label = new JLabel("Hello World");
        label2 = new JLabel("Enter number: ");
        text = new JTextField("0");
        
        text2 = new JTextField("1");
        
        b.addActionListener(new ButtonListener());
        p.add(label);
        p.add(label2);
        p.add(text);
        p.add(b);
        p.add(text2);
        //p.add(b2);
        f.getContentPane().add(p);
        //quit Java after closing the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200); //set size in pixels
        f.setVisible(true); //show the window
        
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        ICS125GUI gui = new ICS125GUI();
    }

    class ButtonListener implements ActionListener

    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String textf2 = text2.getText();
            
            
            
            
            String textf = text.getText();
            int i;
            i = Integer.parseInt(textf) + Integer.parseInt(textf2);
            label.setText("The sum is: " + i);
        }
    }
}
