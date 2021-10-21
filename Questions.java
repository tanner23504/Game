import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Questions extends JFrame implements ActionListener{
 
 JPanel panel;
 public Questions(){
   
   JPanel panel1  = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("What is the most popular sport in the world?");
    label.setBounds(100,80, 350,25);
    panel.add(label);

    JButton button_4 = new JButton("Answer Here");
    button_4.setBounds(175,250, 150,30);
    button_4.addActionListener(this);
    panel.add(button_4);

  JPanel panel2 = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label_1 = new JLabel("question 2");
    label_1.setBounds(100,80, 350,25);
    panel.add(label_1);

    JButton button_5 = new JButton("Answer Here");
    button_5.setBounds(175,250, 150,30);
    button_5.addActionListener(this);
    panel.add(button_5);
    

    
 }
 @Override
  public void actionPerformed(ActionEvent e){

    Answers myGui = new Answers();
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myGui.setSize(500, 500);
    myGui.setVisible(true);
    this.dispose();

  
  }

    
}