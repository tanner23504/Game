import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class new_window extends JFrame implements ActionListener{
 
 JPanel panel;
 public new_window(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("<html>Instructions.<br> Welcome to Jeopardy: Survival Games! <br> In this game, you will be asked different <br> questions from different categories.");
    label.setBounds(200,60, 500,100);
    panel.add(label);

    
    JButton button = new JButton("Begin Game");
    button.setBounds(200,250, 125,25);
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
