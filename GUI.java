// import java swing components, action listeners and fonts //
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Font;
import java.awt.font.*;

// GUI CLASS //
public class GUI extends JFrame implements ActionListener{
  
  JPanel panel; //panel defined
  //GUI METHOD creates a panel for the title screen//
  public GUI(){
    panel = new JPanel(); //panel created
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Jeopardy: Survival Games!"); //title added to panel
    label.setBounds(150,80, 500,100);
    label.setFont(new Font("Serif", Font.BOLD,30)); 
    panel.add(label);

    JButton button = new JButton("Start"); //start button added to panel
    button.setBounds(290,250, 150,50);
    button.addActionListener(this);
    panel.add(button);
    button.setLayout(null);
    button.setVisible(true);

  }

  @Override
  //ACTION PERFORMED METHOD called if start button is clicked
  public void actionPerformed(ActionEvent e){

    new_window myGui = new new_window(); //instruction screen created
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myGui.setSize(775, 500);
    myGui.setVisible(true);
    
    this.dispose(); //this window is destroyed
  } 

}



    

    












  

