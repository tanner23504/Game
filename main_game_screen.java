import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class main_game_screen extends JFrame implements ActionListener{

  CardLayout layout = new CardLayout();
  Container base = getContentPane();
 JPanel panel;
 public main_game_screen(){
   
base.setLayout(layout);
JPanel landing = landing();
JPanel question1 = question1();
JPanel question2 = question2();
base.add(question1, "question1");
base.add(question2, "question2");
base.add(landing,"landing");
layout.show(base,"landing");

  
 }
 public JPanel question1(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Click any button below to play!");
    label.setBounds(150,80, 225,25);
    panel.add(label);

    JButton button_1 = new JButton("Question 1");
    button_1.setBounds(180,250, 150,25);
    button_1.setActionCommand("Question 1");
    button_1.addActionListener(this);
    panel.add(button_1);


    return panel;
 }

 public JPanel landing(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Click any button below to play!");
    label.setBounds(150,80, 225,25);
    panel.add(label);

    JButton button_1 = new JButton("Question 1");
    button_1.setBounds(180,250, 150,25);
    button_1.setActionCommand("Question 1");
    button_1.addActionListener(this);
    panel.add(button_1);

    JButton button_2 = new JButton("Question 2");
    button_2.setBounds(180,350, 150,25);
    button_2.setActionCommand("Question 2");
    button_2.addActionListener(this);
    panel.add(button_2);


    return panel;
 }

 public JPanel question2(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Click any button below to play!");
    label.setBounds(150,80, 225,25);
    panel.add(label);

    JButton button_2 = new JButton("hello");
    button_2.setBounds(180,250, 150,25);
    button_2.setActionCommand("Question 2");
    button_2.addActionListener(this);
    panel.add(button_2);

    return panel;
 }


 @Override
  public void actionPerformed(ActionEvent e){
    switch(e.getActionCommand()){
      case "Question 1":
        layout.show(base,"question1");
        break;

      case "Question 2":
        layout.show(base,"question2");
    }
    


  }

    
}