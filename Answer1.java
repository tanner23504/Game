import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Answer1 extends JFrame implements ActionListener{

 JPanel panel;
 public Answer1(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Your answer is?");
    label.setBounds(200,80, 350,25);
    panel.add(label);
 
    JButton button = new JButton("");
    button.setBounds(175,250, 150,30);
    button.addActionListener(this);
    panel.add(button); 
   


 }
  @Override
  public void actionPerformed(ActionEvent e){

    main_game_screen myGui = new main_game_screen();
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myGui.setSize(775, 500);
    myGui.setVisible(true);
    this.dispose();

  }


} 

  

    