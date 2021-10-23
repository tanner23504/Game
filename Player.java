import java.util.*;
public class Player{
   
   public static ArrayList<String> correctAnswers = new ArrayList<String>();

   public static int score;

   public Player(){
     score =0;
   }

  public void correct(int value){
     score += value;
     
   }

  

   public int getScore(){
     return score;
   }

  public void addScoreText(){
    correctAnswers.add("Questions that are correct: ");
  }

   public void correctAnswers(String answer) {
    correctAnswers.add(answer);
   }
   public int getcorrectAnswerslength(){
     return correctAnswers.size();
   }
   public String getValues(){
     String stringMessage = ""; 
     for (String value: correctAnswers ){
       stringMessage+=value+",";
     }

     return stringMessage;
   }
   public void clear_array(){
     correctAnswers.clear();
   }

   public void resetScore(){
    score=0;
  }

  public void resetArray(){
    correctAnswers.removeAll(correctAnswers);
  }
   
}