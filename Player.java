//import java utilities//
import java.util.*;

// PLAYER CLASS //
public class Player{
   
   //create an array list //
   public static ArrayList<String> correctAnswers = new ArrayList<String>();

  //score variable initialized //
   public static int score;

  //score set to 0//
   public Player(){
     score =0;
   }

  // adds value from the specific question to the score
  public void correct(int value){
     score += value;
   }

  // returns the score
   public int getScore(){
     return score;
   }

  //add correct answer to the array list
   public void correctAnswers(String answer) {
    correctAnswers.add(answer);
   }

   //get the array list size
   public int getcorrectAnswerslength(){
     return correctAnswers.size();
   }

  // add commas between the values in the array list
   public String getValues(){
     String stringMessage = ""; 
     for (String value: correctAnswers ){
       stringMessage+=value+",";
     }
     return stringMessage;
   }

   //clears the array list
   public void clear_array(){
     correctAnswers.clear();
   }

  //resets the score to 0
   public void resetScore(){
    score=0;
  }

  //resets the array
  public void resetArray(){
    correctAnswers.removeAll(correctAnswers);
  }
   
}