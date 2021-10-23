import javax.swing.JFrame; 
import javax.swing.JLabel; 
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.*;
import java.awt.font.*;
import java.awt.Font;
public class main_game_screen extends JFrame implements ActionListener {
  public int score = 0;
  
  CardLayout layout = new CardLayout();
  Container base = getContentPane();
  JPanel panel;
  JTextField userText;
  JTextField userText2;
  JTextField userText3;
  JTextField userText4;
  JTextField userText5;
  JTextField userText6;
  JTextField userText7;
  JTextField userText8;
  JTextField userText9;
  JTextField userText10;
  JTextField userText11;
  JTextField userText12;
  JLabel label_1;
  JLabel label_2;
  public static Player player = new Player();
  JButton button_1;
  JButton button_2;
  JButton button_3;
  JButton button_4;
  JButton button_5;
  JButton button_6;
  JButton button_7;
  JButton button_8;
  JButton button_9;
  JButton button_10;
  JButton button_11;
  JButton button_12;
  JButton category_1;
  JButton category_2;
  JButton category_3;
  JButton category_4;
  JLabel label_score;
  JLabel label_score1;
  
  public main_game_screen() {

    base.setLayout(layout);
    JPanel landing = landing();
    JPanel question1 = question1();
    JPanel question2 = question2();
    JPanel question3 = question3();
    JPanel question4 = question4();
    JPanel question5 = question5();  
    JPanel question6 = question6();
    JPanel question7 = question7();
    JPanel question8 = question8();
    JPanel question9 = question9();  
    JPanel question10 = question10();
    JPanel question11 = question11();
    JPanel question12 = question12();
    JPanel endGame = endGame();
    JPanel incorrect = incorrect();
    base.add(question1, "question1");
    base.add(question2, "question2");
    base.add(question3, "question3");
    base.add(question4, "question4");
    base.add(question5, "question5");
    base.add(question6, "question6");
    base.add(question7, "question7");
    base.add(question8, "question8");
    base.add(question9, "question9");
    base.add(question10, "question10");
    base.add(question11, "question11");
    base.add(question12, "question12");
    base.add(endGame, "endGame");
    base.add(incorrect, "incorrect");
    JPanel correct = correct();
    base.add(correct, "correct");

    base.add(landing, "landing");
    layout.show(base, "landing"); 
    
  }

  

  public JPanel landing() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("Choose a question from the four categories");
    label.setBounds(180, 10, 400, 25);
    panel.add(label);
    
    
///////////////////////////
   /* label_score = new JLabel(String.valueOf(player.getScore()));
    label_score.setBounds(200, 250, 400, 25);
    panel.add(label_score); */

    category_1 = new JButton(new ImageIcon("Jeopardy Project Images/Sports.png"));
    category_1.setBounds(10, 50, 150, 70);
    panel.add(category_1);

    category_2 = new JButton(new ImageIcon("Jeopardy Project Images/VideoGames.png"));
    category_2.setBounds(175, 50, 150, 70);
    panel.add(category_2);

    category_3 = new JButton(new ImageIcon("Jeopardy Project Images/ComputerScience.png"));
    category_3.setBounds(340, 50, 150, 70);
    panel.add(category_3);

    category_4 = new JButton(new ImageIcon("Jeopardy Project Images/Random.png"));
    category_4.setBounds(505, 50, 150, 70);
    panel.add(category_4);

    
    button_1 = new JButton(new ImageIcon("Jeopardy Project Images/Question1.png"));
    button_1.setBounds(10, 150, 150, 70);
    button_1.setActionCommand("Question 1");
    button_1.addActionListener(this);
    panel.add(button_1);

    button_2 = new JButton(new ImageIcon("Jeopardy Project Images/Question2.png"));
    button_2.setBounds(175, 150, 150, 70);
    button_2.setActionCommand("Question 2");
    button_2.addActionListener(this);
    panel.add(button_2);

    button_3 = new JButton(new ImageIcon("Jeopardy Project Images/Question3.png"));
    button_3.setBounds(340, 150, 150, 70);
    button_3.setActionCommand("Question 3");
    button_3.addActionListener(this);
    panel.add(button_3);

    button_4 = new JButton(new ImageIcon("Jeopardy Project Images/Question4.png"));
    button_4.setBounds(505, 150, 150, 70);
    button_4.setActionCommand("Question 4");
    button_4.addActionListener(this);
    panel.add(button_4);

    button_5 = new JButton(new ImageIcon("Jeopardy Project Images/Question5.png"));
    button_5.setBounds(10, 225, 150, 70);
    button_5.setActionCommand("Question 5");
    button_5.addActionListener(this);
    panel.add(button_5); 

    button_6 = new JButton(new ImageIcon("Jeopardy Project Images/Question6.png"));
    button_6.setBounds(175, 225, 150, 70);
    button_6.setActionCommand("Question 6");
    button_6.addActionListener(this);
    panel.add(button_6); 

    button_7 = new JButton(new ImageIcon("Jeopardy Project Images/Question7.png"));
    button_7.setBounds(340, 225, 150, 70);
    button_7.setActionCommand("Question 7");
    button_7.addActionListener(this);
    panel.add(button_7);

    button_8 = new JButton(new ImageIcon("Jeopardy Project Images/Question8.png"));
    button_8.setBounds(505, 225, 150, 70);
    button_8.setActionCommand("Question 8");
    button_8.addActionListener(this);
    panel.add(button_8);

    button_9 = new JButton(new ImageIcon("Jeopardy Project Images/Question9.png"));
    button_9.setBounds(10, 300, 150, 70);
    button_9.setActionCommand("Question 9");
    button_9.addActionListener(this);
    panel.add(button_9); 

    button_10 = new JButton(new ImageIcon("Jeopardy Project Images/Question10.png"));
    button_10.setBounds(175, 300, 150, 70);
    button_10.setActionCommand("Question 10");
    button_10.addActionListener(this);
    panel.add(button_10); 

    button_11 = new JButton(new ImageIcon("Jeopardy Project Images/Question11.png"));
    button_11.setBounds(340, 300, 150, 70);
    button_11.setActionCommand("Question 11");
    button_11.addActionListener(this);
    panel.add(button_11);

    button_12 = new JButton(new ImageIcon("Jeopardy Project Images/Question12.png"));
    button_12.setBounds(505, 300, 150, 70);
    button_12.setActionCommand("Question 12");
    button_12.addActionListener(this);
    panel.add(button_12);

    JButton endGame = new JButton("End Game");
    endGame.setBounds(260, 400, 150, 25);
    endGame.setActionCommand("endGame");
    endGame.addActionListener(this);
    panel.add(endGame);

    

    return panel;
  }

  public JPanel question1() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What is the most popular sport in the world?");
    label.setBounds(80, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText = new JTextField(20);
    userText.setBounds(230, 200, 150, 25);
    panel.add(userText);

    JButton button_1 = new JButton("Submit");
    button_1.setBounds(230, 250, 150, 50);
    button_1.setActionCommand("Submit");
    button_1.addActionListener(this);
    panel.add(button_1);

    return panel;
  }

  public JPanel question2() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    
    JLabel label = new JLabel("<html>What is the most popular free to play game?<html>");
    label.setBounds(100, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    
    label.setVerticalAlignment(SwingConstants.CENTER);
    panel.add(label);

    userText2 = new JTextField(20);
    userText2.setBounds(230, 200, 150, 25);
    panel.add(userText2);

    JButton button_2 = new JButton("Submit");
    button_2.setBounds(230, 250, 150, 50);
    button_2.setActionCommand("Submit_2");
    button_2.addActionListener(this);
    panel.add(button_2);

    return panel;
  }

  public JPanel question3() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What is the opposite of the term 'output'? ");
    label.setBounds(100, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText3 = new JTextField(20);
    userText3.setBounds(230, 200, 150, 25);
    panel.add(userText3);

    JButton button_3 = new JButton("Submit");
    button_3.setBounds(230, 250, 150, 50);
    button_3.setActionCommand("Submit_3");
    button_3.addActionListener(this);
    panel.add(button_3);

    return panel;
  }

  public JPanel question4() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What is 1+1?");
    label.setBounds(230, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText4 = new JTextField(20);
    userText4.setBounds(230, 200, 150, 25);
    panel.add(userText4);

    JButton button_4 = new JButton("Submit");
    button_4.setBounds(230, 250, 150, 50);
    button_4.setActionCommand("Submit_4");
    button_4.addActionListener(this);
    panel.add(button_4);

    return panel;
  }

  public JPanel question5() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("Who won the Stanley Cup in 2021");
    label.setBounds(150, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText5 = new JTextField(20);
    userText5.setBounds(230, 200, 150, 25);
    panel.add(userText5);

    JButton button_5 = new JButton("Submit");
    button_5.setBounds(230, 250, 150, 50);
    button_5.setActionCommand("Submit_5");
    button_5.addActionListener(this);
    panel.add(button_5);

    return panel;
  }

  public JPanel question6() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What was the first main stream Nintendo console called?");
    label.setBounds(35, 80, 600, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText6 = new JTextField(20);
    userText6.setBounds(230, 200, 150, 25);
    panel.add(userText6);

    JButton button_6 = new JButton("Submit");
    button_6.setBounds(230, 250, 150, 50);
    button_6.setActionCommand("Submit_6");
    button_6.addActionListener(this);
    panel.add(button_6);

    return panel;
  }

  public JPanel question7() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What does the term 'GPU' mean?");
    label.setBounds(150, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText7 = new JTextField(20);
    userText7.setBounds(230, 200, 150, 25);
    panel.add(userText7);

    JButton button_7 = new JButton("Submit");
    button_7.setBounds(230, 250, 150, 50);
    button_7.setActionCommand("Submit_7");
    button_7.addActionListener(this);
    panel.add(button_7);

    return panel;
  }

  public JPanel question8() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What is the fastest land animal in the world?");
    label.setBounds(100, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText8 = new JTextField(20);
    userText8.setBounds(240, 200, 150, 25);
    panel.add(userText8);

    JButton button_8 = new JButton("Submit");
    button_8.setBounds(240, 250, 150, 50);
    button_8.setActionCommand("Submit_8");
    button_8.addActionListener(this);
    panel.add(button_8);

    return panel;
  }

  public JPanel question9() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What country eliminated Brazil in the 2014 Fifa World Cup?");
    label.setBounds(35, 80, 700, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText9 = new JTextField(20);
    userText9.setBounds(230, 200, 150, 25);
    panel.add(userText9);

    JButton button_9 = new JButton("Submit");
    button_9.setBounds(230, 250, 150, 50);
    button_9.setActionCommand("Submit_9");
    button_9.addActionListener(this);
    panel.add(button_9);

    return panel;
  }

  public JPanel question10() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("<html>What competitive video game had a <br> tournament hosted in Iceland and Berlin?<html>");
    label.setBounds(110, 80, 500, 50);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText10 = new JTextField(20);
    userText10.setBounds(230, 200, 150, 25);
    panel.add(userText10);

    JButton button_10 = new JButton("Submit");
    button_10.setBounds(230, 250, 150, 50);
    button_10.setActionCommand("Submit_10");
    button_10.addActionListener(this);
    panel.add(button_10);

    return panel;
  }

  public JPanel question11() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What are the different types of loops in java?");
    label.setBounds(110, 80, 500, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    userText11 = new JTextField(20);
    userText11.setBounds(230, 200, 150, 25);
    panel.add(userText11);

    JButton button_11 = new JButton("Submit");
    button_11.setBounds(230, 250, 150, 50);
    button_11.setActionCommand("Submit_11");
    button_11.addActionListener(this);
    panel.add(button_11);

    return panel;
  }

  public JPanel question12() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("<html>What computer course in University does not <br> require you to take any sciences in highschool?<html>");
    label.setBounds(110, 80, 500, 50);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);



    

    userText12 = new JTextField(20);
    userText12.setBounds(230, 200, 150, 25);
    panel.add(userText12);

    JButton button_12 = new JButton("Submit");
    button_12.setBounds(230, 250, 150, 50);
    button_12.setActionCommand("Submit_12");
    button_12.addActionListener(this);
    panel.add(button_12);

    return panel;
  }

  public JPanel endGame() {
    
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    
    JLabel label = new JLabel("Game Over!");
    label.setBounds(275, 35, 225, 25);
    label.setFont(new Font("Serif", Font.BOLD, 18)); 
    panel.add(label);

    label_1 = new JLabel(player.getValues());
    label_1.setBounds(390, 200, 500, 25);
    panel.add(label_1);
    player.getcorrectAnswerslength();
    ////////////////////////////////////////////////////////
    label_2 = new JLabel(String.valueOf(player.score));
    System.out.println(player.score);
    label_2.setBounds(340,272, 225, 25);
    label_2.setFont(new Font("Serif", Font.BOLD, 18)); ;
    panel.add(label_2);
    
    
    
    System.out.println(player.getValues());
    
    JButton endGame = new JButton("Main Screen");
    endGame.setBounds(265, 380, 150, 40);
    endGame.setActionCommand("endGame_1");
    endGame.addActionListener(this);
    panel.add(endGame);

   

    return panel;
  }

  public JPanel correct() {
    //player.addScoreText();
    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    player.correct(100);
    
   
    label_score = new JLabel(String.valueOf(player.getScore()));
    panel.setBackground(Color.green);
    label_score.setBounds(490, 150, 150, 25);
    label_score.setFont(new Font("Serif", Font.BOLD,18)); 
    panel.add(label_score);

    label_score1 = new JLabel("Correct Answer! Your score is now: ");
    panel.setBackground(Color.green);
    label_score1.setBounds(125, 150, 500, 25);
    label_score1.setFont(new Font("Serif", Font.BOLD,18)); 
    panel.add(label_score1);

    JButton button_1 = new JButton("Continue");
    button_1.setBounds(240, 250, 150, 30);
    button_1.setActionCommand("continue game");
    button_1.addActionListener(this);
    panel.add(button_1);

    return panel;
  }

  public JPanel incorrect() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    panel.setBackground(Color.red);
    
     

    
    JLabel label = new JLabel("You lost the game");
    label.setBounds(225, 200, 225, 25);
    label.setFont(new Font("", Font.BOLD, 18)); 
    panel.add(label);

    JLabel label2 = new JLabel("Game Over!");
    label2.setBounds(220, 150, 225, 25);
    label2.setFont(new Font("", Font.BOLD, 30)); 
    panel.add(label2);

    
    ////////////////////////////////////////////////////////
   

    JButton button_1 = new JButton("Main Screen");
    button_1.setBounds(245, 250, 150, 30);
    button_1.setActionCommand("game reset");
    button_1.addActionListener(this);
    panel.add(button_1);

    

    return panel;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
    case "Question 1":
      layout.show(base, "question1");
      button_1.setVisible(false);
      button_1.invalidate();
      break;

    case "Question 2":
      layout.show(base, "question2");
      button_2.setVisible(false);
      button_2.invalidate();
      break;

    case "Question 3":
      layout.show(base, "question3");
      button_3.setVisible(false);
      button_3.invalidate();
      break;

    case "Question 4":
      layout.show(base, "question4");
      button_4.setVisible(false);
      button_4.invalidate();
      break;

    case "Question 5":
      layout.show(base, "question5");
      button_5.setVisible(false);
      button_5.invalidate();
      break;

    case "Question 6":
      layout.show(base, "question6");
      button_6.setVisible(false);
      button_6.invalidate();
      break;

    case "Question 7":
      layout.show(base, "question7");
      button_7.setVisible(false);
      button_7.invalidate();
      break;

    case "Question 8":
      layout.show(base, "question8");
      button_8.setVisible(false);
      button_8.invalidate();
      break;

    case "Question 9":
      layout.show(base, "question9");
      button_9.setVisible(false);
      button_9.invalidate();
      break;

    case "Question 10":
      layout.show(base, "question10");
      button_10.setVisible(false);
      button_10.invalidate();
      break;

    case "Question 11":
      layout.show(base, "question11");
      button_11.setVisible(false);
      button_11.invalidate();
      break;

    case "Question 12":
      layout.show(base, "question12");
      button_12.setVisible(false);
      button_12.invalidate();
      break;

    case "Submit":
      
      if (userText.getText().toLowerCase().equals("soccer")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("1");
        


      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_2":

      if (userText2.getText().toLowerCase().equals("fortnite")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("2");
      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_3":

      if (userText3.getText().toLowerCase().equals("input")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("3");
      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_4":

      if (userText4.getText().toLowerCase().equals("2")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("4" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_5":

      if (userText5.getText().toLowerCase().equals("tampa bay lightning")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("5" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_6":

      if (userText6.getText().toLowerCase().equals("nintendo entertainment system")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("6" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_7":

      if (userText7.getText().toLowerCase().equals("graphics processing unit")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("7" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;


    case "Submit_8":

      if (userText8.getText().toLowerCase().equals("cheetah")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("8" + " \r\n");

      } else {
        layout.show(base, "incorrect");
      }


      break;

    case "Submit_9":

      if (userText9.getText().toLowerCase().equals("germany")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("9" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_10":

      if (userText10.getText().toLowerCase().equals("valorant")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("10" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_11":

      if (userText11.getText().toLowerCase().equals("for loop, while loop, do-while loop")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("11" + " \r\n");
      }
      else if (userText11.getText().toLowerCase().equals("while loop, for loop, do-while loop")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("11" + " \r\n");
      }

      else if (userText11.getText().toLowerCase().equals("do-while loop, for loop, while loop")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("11" + " \r\n");
      }
      else if (userText11.getText().toLowerCase().equals("do-while loop, while loop, for loop")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("11" + " \r\n");
      }

       else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_12":

      if (userText12.getText().toLowerCase().equals("computer science")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("12" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "endGame_1":

      dispose();
      
      
      GUI myGui1 = new GUI();
      myGui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Player_Stats.writeSomething();
      myGui1.setSize(775, 500);
      myGui1.setVisible(true);
       player.resetScore();
       player.clear_array();

       

      System.out.println(player.getValues());
      
      break;

    case "endGame":
      JPanel endGame = endGame();
      base.add(endGame,"endGame");
      
      
      JLabel label = new JLabel("Questions that were answered correctly: ");
      label.setBounds(60, 200, 500, 25);
      label.setFont(new Font("", Font.BOLD, 14)); 
      panel.add(label);
      
      
      JLabel labelScore = new JLabel("Score: ");
      labelScore.setBounds(280, 270, 150, 30);
      labelScore.setFont(new Font("", Font.BOLD, 14)); 
      panel.add(labelScore);
      

      layout.show(base, "endGame");
      
      
      break;

    case "game reset":
      dispose();
      
      player.resetScore();
      GUI myGui = new GUI();
      myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      myGui.setSize(775, 500);
      myGui.setVisible(true);


      break;

    case "continue game":
      
      layout.show(base, "landing");
      
      break;
    
    default:
      break;
    }

  }

}