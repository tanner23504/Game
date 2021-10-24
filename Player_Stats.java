// importing java.io (read and write data files package)//
import java.io.*;

// PLAYER STATS CLASS (Used to display on output.txt file after game is completed) //
public class Player_Stats{
 
  static Player player = main_game_screen.player; //calling upon player
  
  // writing to .txt file method //
  public static void writeSomething(){
  
  try {
    
    FileWriter fw = new FileWriter("output.txt",true); //creats output.txt file
    
    // display user trial score //
    fw.write("***********************************" +  " \r\n");
    fw.write("New Game Trial" +  " \r\n");
    fw.write(String.valueOf("Player Score: " + player.getScore())+ " \r\n");
    fw.write("***********************************" +  " \r\n");
    fw.close();
  
  }
  //catch potential exceptions
  catch (Exception e){

  }
  }
}