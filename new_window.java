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
    
    JLabel label = new JLabel("Instructions");
    label.setBounds(150,80, 200,25);
    panel.add(label);

    JLabel label1 = new JLabel("Welcome to Jeopardy: Survival Games!");
    label1.setBounds(150,60, 200,25);
    panel.add(label1);
  
   
    JButton button = new JButton("Begin Game");
    button.setBounds(200,250, 120,30);
    button.addActionListener(this);
    panel.add(button);
    
 }
@Override
  public void actionPerformed(ActionEvent e){

    main_game_screen myGui = new main_game_screen();
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myGui.setSize(500, 500);
    myGui.setVisible(true);
    this.dispose();
  }
  
     

}
