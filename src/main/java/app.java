import java.io.Console;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class app{
  public static void main(String[] args) {

    Console myConsole = System.console();

    System.out.println("-------------------");
    System.out.println("Let's play hangman!");
    Game game = new Game();
    // game.returnWordArray().join("");
    System.out.println("The word you need to guess is " + game.returnWordArray().length + " letters.");
    System.out.println("-------------------");

    while(game.isDone() == false){
      game.checkLetter(myConsole.readLine());
    }
  }
}
