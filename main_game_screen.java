import javax.swing.JFrame; 
import javax.swing.JLabel; 
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.*;
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
  JLabel label_score;
  
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

  public JPanel question1() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What is the most popular sport in the world?");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText = new JTextField(20);
    userText.setBounds(180, 250, 150, 25);
    panel.add(userText);

    JButton button_1 = new JButton("Submit");
    button_1.setBounds(180, 300, 150, 25);
    button_1.setActionCommand("Submit");
    button_1.addActionListener(this);
    panel.add(button_1);

    return panel;
  }

  public JPanel landing() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("Choose a question of your choice");
    label.setBounds(200, 80, 400, 25);
    panel.add(label);
    
    
///////////////////////////
   /* label_score = new JLabel(String.valueOf(player.getScore()));
    label_score.setBounds(200, 250, 400, 25);
    panel.add(label_score); */

    button_1 = new JButton(new ImageIcon("Jeopardy Project Images/test.png"));
    button_1.setBounds(10, 150, 150, 70);
    button_1.setActionCommand("Question 1");
    button_1.addActionListener(this);
    panel.add(button_1);

    button_2 = new JButton("Question 2");
    button_2.setBounds(175, 150, 150, 25);
    button_2.setActionCommand("Question 2");
    button_2.addActionListener(this);
    panel.add(button_2);

    button_3 = new JButton("Question 3");
    button_3.setBounds(340, 150, 150, 25);
    button_3.setActionCommand("Question 3");
    button_3.addActionListener(this);
    panel.add(button_3);

    button_4 = new JButton("Question 4");
    button_4.setBounds(505, 150, 150, 25);
    button_4.setActionCommand("Question 4");
    button_4.addActionListener(this);
    panel.add(button_4);

    button_5 = new JButton("Question 5");
    button_5.setBounds(10, 225, 150, 25);
    button_5.setActionCommand("Question 5");
    button_5.addActionListener(this);
    panel.add(button_5); 

    button_6 = new JButton("Question 6");
    button_6.setBounds(175, 225, 150, 25);
    button_6.setActionCommand("Question 6");
    button_6.addActionListener(this);
    panel.add(button_6); 

    button_7 = new JButton("Question 7");
    button_7.setBounds(340, 225, 150, 25);
    button_7.setActionCommand("Question 7");
    button_7.addActionListener(this);
    panel.add(button_7);

    button_8 = new JButton("Question 8");
    button_8.setBounds(505, 225, 150, 25);
    button_8.setActionCommand("Question 8");
    button_8.addActionListener(this);
    panel.add(button_8);

    button_9 = new JButton("Question 9");
    button_9.setBounds(10, 300, 150, 25);
    button_9.setActionCommand("Question 9");
    button_9.addActionListener(this);
    panel.add(button_9); 

    button_10 = new JButton("Question 10");
    button_10.setBounds(175, 300, 150, 25);
    button_10.setActionCommand("Question 10");
    button_10.addActionListener(this);
    panel.add(button_10); 

    button_11 = new JButton("Question 11");
    button_11.setBounds(340, 300, 150, 25);
    button_11.setActionCommand("Question 11");
    button_11.addActionListener(this);
    panel.add(button_11);

    button_12 = new JButton("Question 12");
    button_12.setBounds(505, 300, 150, 25);
    button_12.setActionCommand("Question 12");
    button_12.addActionListener(this);
    panel.add(button_12);

    JButton endGame = new JButton("End Game");
    endGame.setBounds(260, 350, 150, 25);
    endGame.setActionCommand("endGame");
    endGame.addActionListener(this);
    panel.add(endGame);

    

    return panel;
  }

  public JPanel question2() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("What is the most popular free to play game?");
    label.setBounds(150, 80, 400, 25);
    panel.add(label);

    userText2 = new JTextField(20);
    userText2.setBounds(180, 250, 150, 25);
    panel.add(userText2);

    JButton button_2 = new JButton("Submit");
    button_2.setBounds(180, 300, 150, 25);
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
    label.setBounds(150, 80, 400, 25);
    panel.add(label);

    userText3 = new JTextField(20);
    userText3.setBounds(180, 250, 150, 25);
    panel.add(userText3);

    JButton button_3 = new JButton("Submit");
    button_3.setBounds(180, 300, 150, 25);
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
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText4 = new JTextField(20);
    userText4.setBounds(180, 250, 150, 25);
    panel.add(userText4);

    JButton button_4 = new JButton("Submit");
    button_4.setBounds(180, 300, 150, 25);
    button_4.setActionCommand("Submit_4");
    button_4.addActionListener(this);
    panel.add(button_4);

    return panel;
  }

  public JPanel question5() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_______");
    label.setBounds(150, 80, 400, 25);
    panel.add(label);

    userText5 = new JTextField(20);
    userText5.setBounds(180, 250, 150, 25);
    panel.add(userText2);

    JButton button_5 = new JButton("Submit");
    button_5.setBounds(180, 300, 150, 25);
    button_5.setActionCommand("Submit_5");
    button_5.addActionListener(this);
    panel.add(button_5);

    return panel;
  }

  public JPanel question6() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("________");
    label.setBounds(150, 80, 400, 25);
    panel.add(label);

    userText6 = new JTextField(20);
    userText6.setBounds(180, 250, 150, 25);
    panel.add(userText6);

    JButton button_6 = new JButton("Submit");
    button_6.setBounds(180, 300, 150, 25);
    button_6.setActionCommand("Submit_6");
    button_6.addActionListener(this);
    panel.add(button_6);

    return panel;
  }

  public JPanel question7() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_________");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText7 = new JTextField(20);
    userText7.setBounds(180, 250, 150, 25);
    panel.add(userText7);

    JButton button_7 = new JButton("Submit");
    button_7.setBounds(180, 300, 150, 25);
    button_7.setActionCommand("Submit_7");
    button_7.addActionListener(this);
    panel.add(button_7);

    return panel;
  }

  public JPanel question8() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_________");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText8 = new JTextField(20);
    userText8.setBounds(180, 250, 150, 25);
    panel.add(userText8);

    JButton button_8 = new JButton("Submit");
    button_8.setBounds(180, 300, 150, 25);
    button_8.setActionCommand("Submit_8");
    button_8.addActionListener(this);
    panel.add(button_8);

    return panel;
  }

  public JPanel question9() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_________");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText9 = new JTextField(20);
    userText9.setBounds(180, 250, 150, 25);
    panel.add(userText8);

    JButton button_9 = new JButton("Submit");
    button_9.setBounds(180, 300, 150, 25);
    button_9.setActionCommand("Submit_9");
    button_9.addActionListener(this);
    panel.add(button_9);

    return panel;
  }

  public JPanel question10() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_________");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText10 = new JTextField(20);
    userText10.setBounds(180, 250, 150, 25);
    panel.add(userText10);

    JButton button_10 = new JButton("Submit");
    button_10.setBounds(180, 300, 150, 25);
    button_10.setActionCommand("Submit_10");
    button_10.addActionListener(this);
    panel.add(button_10);

    return panel;
  }

  public JPanel question11() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_________");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText11 = new JTextField(20);
    userText11.setBounds(180, 250, 150, 25);
    panel.add(userText11);

    JButton button_11 = new JButton("Submit");
    button_11.setBounds(180, 300, 150, 25);
    button_11.setActionCommand("Submit_11");
    button_11.addActionListener(this);
    panel.add(button_11);

    return panel;
  }

  public JPanel question12() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("_________");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    userText12 = new JTextField(20);
    userText12.setBounds(180, 250, 150, 25);
    panel.add(userText12);

    JButton button_12 = new JButton("Submit");
    button_12.setBounds(180, 300, 150, 25);
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
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    label_1 = new JLabel(player.getValues());
    label_1.setBounds(150, 150, 225, 25);
    panel.add(label_1);

    JLabel label_2 = new JLabel(String.valueOf(player.getcorrectAnswerslength()));
    label_2.setBounds(150, 250, 225, 25);
    panel.add(label_2);

    label_score = new JLabel(String.valueOf(player.getScore()));
    label_score.setBounds(200, 250, 400, 25);
    panel.add(label_score);

    JButton endGame = new JButton("Main Screen");
    endGame.setBounds(180, 300, 150, 25);
    endGame.setActionCommand("endGame_1");
    endGame.addActionListener(this);
    panel.add(endGame);

   

    return panel;
  }

  public JPanel correct() {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    player.correct(100);
    String.valueOf(player.getScore());
    label_score = new JLabel(String.valueOf(player.getScore()));
    label_score.setBounds(200, 350, 150, 25);
    panel.add(label_score);

    JButton button_1 = new JButton("Continue");
    button_1.setBounds(180, 250, 150, 25);
    button_1.setActionCommand("continue game");
    button_1.addActionListener(this);
    panel.add(button_1);

    return panel;
  }

  public JPanel incorrect() {
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel label = new JLabel("You lost the game");
    label.setBounds(150, 80, 225, 25);
    panel.add(label);

    JButton button_1 = new JButton("Continue");
    button_1.setBounds(180, 250, 150, 25);
    button_1.setActionCommand("game reset");
    button_1.addActionListener(this);
    panel.add(button_1);

    /*
     * JButton button_2 = new JButton("Question 2"); button_2.setBounds(180,350,
     * 150,25); button_2.setActionCommand("Question 2");
     * button_2.addActionListener(this); panel.add(button_2);
     */

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
        player.correctAnswers("Question 1 was Correct!");
        


      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_2":

      if (userText2.getText().toLowerCase().equals("fortnite")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 2 was Correct!");
      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_3":

      if (userText3.getText().toLowerCase().equals("input")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 3 was Correct!");
      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_4":

      if (userText4.getText().toLowerCase().equals("2")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 4 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_5":

      if (userText5.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 5 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_6":

      if (userText6.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 6 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_7":

      if (userText7.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 7 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;


    case "Submit_8":

      if (userText8.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 8 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");
      }


      break;

    case "Submit_9":

      if (userText9.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 9 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_10":

      if (userText10.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 10 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_11":

      if (userText11.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 11 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "Submit_12":

      if (userText12.getText().toLowerCase().equals("_______")) {
        layout.show(base, "correct");
        JPanel correct = correct();
        base.add(correct, "correct");
        player.correctAnswers("Question 12 was Correct!" + " \r\n");

      } else {
        layout.show(base, "incorrect");

      }

      break;

    case "endGame_1":

      dispose();
      
      // panel = new JPanel();
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
      // panel = new JPanel();
      label_score.setText(String.valueOf(player.getScore()));
      label_1.setText(player.getValues());
      layout.show(base, "endGame");
      
      
      break;

    case "game reset":
      dispose();
      // panel = new JPanel();
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