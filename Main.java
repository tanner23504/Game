/************************* Tanner Farkas and Bradley Chamberlain *********************************************
                         Mini Game Project: Jeopardy Survival Games
                                     Date: October 23rd, 2021

Game Description:

Welcome to Jeopardy: Survival Games!
Within the game, you will be asked several questions from 4 different categories.
The 4 categories are Sports, Video Games, Computer Science and Random! 
Getting the question wrong will cause you to lose the game...
so ensure you are prepared to beat the survival games.
Every question you get correct, you will be awarded with 100 points!
Check the 'output.txt' file after completing the game to view your score 
and previous user score history before hand.
While clicking 'Endgame' to end the game, you will be sent to the end screen 
and will gain an extra 100 points! 
*/

// importing java swing and fonts
import javax.swing.*;
import java.awt.*;
import java.awt.font.*;

//MAIN CLASS//
public class Main{
  
  //MAIN METHOD//
  public static void main(String[] args){
    
    GUI myGui = new GUI(); // GUI Class (title screen) is now visible
    myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myGui.setSize(775, 500);
    myGui.setVisible(true);
    
  }

}
 
  



   
