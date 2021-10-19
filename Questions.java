import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Questions extends JFrame implements ActionListener{
 
 JPanel panel;
 public Questions(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("What is 1+1?");
    label.setBounds(150,80, 200,25);
    panel.add(label);

    JButton button = new JButton("Answer Here");
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