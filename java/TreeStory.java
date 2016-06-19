import java.io.Console;

public class TreeStory {

  public static void main(String[] args){
    Console console = System.console();
    int age = Integer.parseInt(console.readLine("How old are you?: "));

    if(age < 13){
      console.printf("You are not old enough to use this program");
      System.exit(0);
    }

    String name = console.readLine("Enter your name: ");
    String adjective = console.readLine("Enter an adjective: ");
    String noun = console.readLine("Enter a noun: ");
    if(noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"  )){
      console.printf("That language is not allowed. Exiting");
      System.exit(0);
    }
    String adverb = console.readLine("Enter a  verb ending in --ing ");
    String verb = console.readLine("Enter a verb ");

    console.printf("Your TreeStory:\n------------------\n");
    console.printf("%s is a %s %s. ",name, adjective, noun);
    console.printf("They are always %s %s\n",adverb,verb);
  }
}
