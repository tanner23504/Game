import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Font;
import java.awt.font.*;

public class GUI extends JFrame implements ActionListener{
  JPanel panel;
  public GUI(){
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Jeopardy: Survival Games!");
    label.setBounds(100,80, 500,100);
    label.setFont(new Font("Serif", Font.BOLD,30)); 
    panel.add(label);

    JButton button = new JButton("Start");
    button.setBounds(230,250, 150,50);
    button.addActionListener(this);
    panel.add(button);
    
    button.setLayout(null);
    button.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e){

    new_window myGui = new new_window();
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myGui.setSize(775, 500);
    myGui.setVisible(true);
    this.dispose();
  } 

}



    

    












  

