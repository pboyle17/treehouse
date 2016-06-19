import com.teamtreehouse.Treet;
import java.util.Date;

public class Example{

  public static void main(String args[]){
    Treet treet = new Treet("craigdennis",
    "Want to be famous? Simply twwet about Java and use the hashtag #treet. I'll use your tweet in a new @teamtreehouse course about data structures.",
    new Date(14218497320000L));
    System.out.printf("This is a new Treet: %s %n",treet);
    System.out.printf("Words are: ");
    for(String word: treet.getWords()){
      System.out.println(word);
    }
  }
}
