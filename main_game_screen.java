
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class main_game_screen extends JFrame implements ActionListener{
// public static int score=500;

  CardLayout layout = new CardLayout();
  Container base = getContentPane();
 JPanel panel;
 JTextField userText;
 JTextField userText2;
 JTextField userText3;
 JTextField userText4;
  Player player = new Player();

 public main_game_screen(){
   
base.setLayout(layout);
JPanel landing = landing();
JPanel question1 = question1();
JPanel question2 = question2();
JPanel question3 = question3();
JPanel question4 = question4();
JPanel endGame = endGame();
JPanel correct = correct();
JPanel incorrect = incorrect();
base.add(question1, "question1");
base.add(question2, "question2");
base.add(question3, "question3");
base.add(question4, "question4");
base.add(endGame, "endGame");
base.add(incorrect, "incorrect");
base.add(correct, "correct");

base.add(landing,"landing");
layout.show(base,"landing");

  
 }
 public JPanel question1(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("What is the most popular sport in the world?");
    label.setBounds(150,80, 225,25);
    panel.add(label);

     userText = new JTextField(20);
    userText.setBounds(180,250, 150,25);
    panel.add(userText);         
    

    JButton button_1 = new JButton("Submit");
    button_1.setBounds(180,300, 150,25);
    button_1.setActionCommand("Submit");
    button_1.addActionListener(this);
    panel.add(button_1);

    
    return panel;
 }

 public JPanel landing(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Choose a question of your choice");
    label.setBounds(200,80, 400,25);
    panel.add(label);

    JButton button_1 = new JButton("Question 1");
    button_1.setBounds(10,150, 150,25);
    button_1.setActionCommand("Question 1");
    button_1.addActionListener(this);
    panel.add(button_1);

    JButton button_2 = new JButton("Question 2");
    button_2.setBounds(175,150, 150,25);
    button_2.setActionCommand("Question 2");
    button_2.addActionListener(this);
    panel.add(button_2);
    
    JButton button_3 = new JButton("Question 3");
    button_3.setBounds(340,150, 150,25);
    button_3.setActionCommand("Question 3");
    button_3.addActionListener(this);
    panel.add(button_3);

    JButton button_4 = new JButton("Question 4");
    button_4.setBounds(505,150, 150,25);
    button_4.setActionCommand("Question 4");
    button_4.addActionListener(this);
    panel.add(button_4);

    JButton endGame = new JButton("End Game");
    endGame.setBounds(200,350, 150,25);
    endGame.setActionCommand("endGame");
    endGame.addActionListener(this);
    panel.add(endGame);

    

    return panel;
 }

 public JPanel question2(){
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("What is the most popular free to play game?");
    label.setBounds(150,80, 400,25);
    panel.add(label);

    userText2 = new JTextField(20);
    userText2.setBounds(180,250, 150,25);
    panel.add(userText2);         
    

    JButton button_2 = new JButton("Submit");
    button_2.setBounds(180,300, 150,25);
    button_2.setActionCommand("Submit_2");
    button_2.addActionListener(this);
    panel.add(button_2);

    
    return panel;
 }

 public JPanel question3(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("What is the opposite of the term 'output'? ");
    label.setBounds(150,80, 400,25);
    panel.add(label);

    userText3 = new JTextField(20);
    userText3.setBounds(180,250, 150,25);
    panel.add(userText3);         
    

    JButton button_3 = new JButton("Submit");
    button_3.setBounds(180,300, 150,25);
    button_3.setActionCommand("Submit_3");
    button_3.addActionListener(this);
    panel.add(button_3);

    
    return panel;
 }

  public JPanel question4(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("What is 1+1?");
    label.setBounds(150,80, 225,25);
    panel.add(label);

    userText4 = new JTextField(20);
    userText4.setBounds(180,250, 150,25);
    panel.add(userText4);         
    

    JButton button_4 = new JButton("Submit");
    button_4.setBounds(180,300, 150,25);
    button_4.setActionCommand("Submit_4");
    button_4.addActionListener(this);
    panel.add(button_4);

    
    return panel;
 } 

  public JPanel endGame(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Game Over!");
    label.setBounds(150,80, 225,25);
    panel.add(label);

    JButton endGame = new JButton("Main Screen");
    endGame.setBounds(180,300, 150,25);
    endGame.setActionCommand("endGame_1");
    endGame.addActionListener(this);
    panel.add(endGame);

    
    return panel;
 } 

 public JPanel correct(){
   JPanel panel= new JPanel();
   panel.setLayout(null);
    add(panel);
   JLabel label = new JLabel(String.valueOf(player.correct(100)));
    label.setBounds(200,350, 150,25);
    panel.add(label);
    
  JButton button_1 = new JButton("Continue");
    button_1.setBounds(180,250, 150,25);
    button_1.setActionCommand("continue game");
    button_1.addActionListener(this);
    panel.add(button_1);

    return panel;
 }

 public JPanel incorrect(){
   panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("You lost the game");
    label.setBounds(150,80, 225,25);
    panel.add(label);
    
    

    
   
    JButton button_1 = new JButton("Continue");
    button_1.setBounds(180,250, 150,25);
    button_1.setActionCommand("game reset");
    button_1.addActionListener(this);
    panel.add(button_1);

    /* JButton button_2 = new JButton("Question 2");
    button_2.setBounds(180,350, 150,25);
    button_2.setActionCommand("Question 2");
    button_2.addActionListener(this);
    panel.add(button_2); */


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
        break;

      case "Question 3":
        layout.show(base,"question3");
        break;

      case "Question 4":
        layout.show(base,"question4");
        break;

      

      case "Submit":
        
        if (userText.getText().toLowerCase().equals("soccer")) {
            layout.show(base,"correct");
            
            
        }
        else {
          layout.show(base,"incorrect");

        }
       
        break;
      
      case "Submit_2":
        
        if (userText2.getText().toLowerCase().equals("fortnite")) {
            layout.show(base,"correct");
            
            
        }
        else {
          layout.show(base,"incorrect");

        }
       
        break;

      case "Submit_3":
        
        if (userText3.getText().toLowerCase().equals("input")) {
            layout.show(base,"correct");
            
            
        }
        else {
          layout.show(base,"incorrect");

        }
       
        break;

      case "Submit_4":
        
        if (userText4.getText().toLowerCase().equals("2")) {
            layout.show(base,"correct");
            
            
        }
        else {
          layout.show(base,"incorrect");

        }
        
        break;

      case "endGame_1":
        
        dispose();
         //panel = new JPanel();
         GUI myGui1 = new GUI();
        myGui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myGui1.setSize(775, 500);
        myGui1.setVisible(true);
        
        break;

      case "endGame":
         //panel = new JPanel();
         layout.show(base,"endGame");
      break;
    
      case "game reset":
        dispose();
         //panel = new JPanel();
         GUI myGui = new GUI();
        myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myGui.setSize(775, 500);
        myGui.setVisible(true);
      break;

      case "continue game":
        layout.show(base,"landing");
      break;

      default:
        break;
    }
    


  }

    
}