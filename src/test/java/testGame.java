import org.junit.*;
import static org.junit.Assert.*;

public class testGame{

  @Test
  public void makeGameObject(){
    Game newGame = new Game();
    assertEquals(true, newGame instanceof Game);
  }

  @Test
  public void returnArrayList(){
    Game newGame = new Game();
    String[] expected = {"z","i","n","c"};
    assertEquals(expected, newGame.returnWordArray());
  }

  @Test
  public void returnInputIfCorrect(){
    Game newGame = new Game();
    newGame.returnWordArray();
    String expected = "Correct z";
    assertEquals(expected, newGame.checkLetter("z"));
  }
}
