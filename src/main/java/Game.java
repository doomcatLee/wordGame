import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Game{
  private String[] wordArray;
  private String[] gameAnswers = {"cobalt","zinc","ice","damn","adult","region","dogfart","gamble","capsule"};
  List<String> output = new ArrayList<String>();

  public String[] returnWordArray() {
    Random random = new Random();
    int rand = random.nextInt(10);
    wordArray = gameAnswers[rand].split("");
    for (int i=0;i<wordArray.length ;i++ ) {
      output.add(" ");
    }
    return wordArray;
  }

  public List<String> checkLetter(String input) {
    List<String> list = new ArrayList<String>(Arrays.asList(wordArray));

    if(list.contains(input)){
      int index = list.indexOf(input);
      output.set(index, input);
      System.out.println("-------------------");
      System.out.println(output);
      System.out.println("-------------------");
      return output;
    }else{
      System.out.println("-------------------");
      System.out.println("Incorrect, try again");
      System.out.println("-------------------");
      return output;
    }
  }

  public boolean isDone(){
    if (!output.contains(" ")){
      System.out.println("Congratz! You are a boss!");
      return true;
  }else{
    return false;
    }
  }
}//End of Game
