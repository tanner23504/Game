import java.io.*;

public class Player_Stats{
 static Player player = main_game_screen.player;
  public static void writeSomething(){
  
  try {
    
    FileWriter fw = new FileWriter("output.txt",true);
    player.correct(-100);
    fw.write("***********************************" +  " \r\n");
    fw.write("New Game Trial" +  " \r\n");
    fw.write(String.valueOf("Player Score: " + player.getScore())+ " \r\n");
    fw.write("***********************************" +  " \r\n");
    fw.close();
  
  }
  
  catch (Exception e){

  }
  }
}