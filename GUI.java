import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
  JPanel panel;
  public GUI(){
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Jeopardy: Survival Games!");
    label.setBounds(150,80, 200,25);
    panel.add(label);

    JButton button = new JButton("Start");
    button.setBounds(200,250, 100,25);
    button.addActionListener(this);
    panel.add(button);
    
    button.setLayout(null);
    button.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e){

    new_window myGui = new new_window();
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myGui.setSize(500, 500);
    myGui.setVisible(true);
    this.dispose();
  } 

}



    

    












  

