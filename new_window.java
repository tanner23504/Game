// importing java swing, action listener and fonts //
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Font;

// INSTRUCTION SCREEN CLASS//
public class new_window extends JFrame implements ActionListener{
 
    JPanel panel; //creates new panel
    public new_window(){
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
     JLabel label = new JLabel("INSTRUCTIONS"); //display instruction title
    label.setFont(new Font("Serif", Font.BOLD,20)); 
    label.setBounds(200,10, 250,30);
    panel.add(label);
    
    // displays instructions //
    JLabel label1 = new JLabel("<html> Welcome to Jeopardy: Survival Games! <br><br> Within the game, you will be asked several questions from 4 different categories.<br><br> The 4 categories are Sports, Video Games, Computer Science and Random! <br><br> Getting the question wrong will cause you to lose the game... so ensure you are prepared to beat the survival games.<br><br> Every question you get correct, you will be awarded with 100 points!<br><br> Check the 'output.txt' file after completing the game to view your score and previous user score history before hand.<br><br> While clicking 'Endgame' to end the game, you will be sent to the end screen  and will gain an extra 100 points! <html>");
    label1.setBounds(200,20, 400,400);
    panel.add(label1);

    
    JButton button = new JButton("Begin Game"); // begin game button
    button.setBounds(200,400, 125,25);
    button.addActionListener(this);
    panel.add(button);

 }
@Override
  //ACTION PERFORMED METHOD called if 'begin game' button is clicked //
  public void actionPerformed(ActionEvent e){

    main_game_screen myGui = new main_game_screen(); //main game screen is created
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myGui.setSize(670, 500);
    myGui.setVisible(true);
    this.dispose(); //instruction screen is disposed
  }

}
