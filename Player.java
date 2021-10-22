public class Player{
   //ArrayList<String> correctAnswers = new ArrayList<String>();
   public static int score;

   public Player(){
     score =0;
   }

  public int correct(int value){
     score += value;
     return score;
   }

   public int getScore(){
     return score;
   }
   //public void correctAnswers(String answer) {
    //correctAnswers.add(answer);
   //}

}