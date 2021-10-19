import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class main_game_screen extends JFrame implements ActionListener{
 
 JPanel panel;
 public main_game_screen(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Main Screen");
    label.setBounds(150,80, 200,25);
    panel.add(label);

    JButton button = new JButton("Question 1");
    button.setBounds(200,250, 120,30);
    button.addActionListener(this);
    panel.add(button);
    
  
 }
 @Override
  public void actionPerformed(ActionEvent e){

    Questions myGui = new Questions();
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myGui.setSize(500, 500);
    myGui.setVisible(true);
    this.dispose();

  
  }

    
}