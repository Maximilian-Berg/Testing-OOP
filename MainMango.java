import java.util.Scanner;
public class MainMango {

  public static void main(String[] Args) {
    Scanner inpt = new Scanner(System.in);
    System.out.print("Please enter a Name for your dog: ");
    Dog mine = new Dog(inpt.next());
    String named = mine.getName();
    System.out.println("Your dog is now called " + named);

    boolean renameConsent = false;
    System.out.print("Would you like to rename your dog? true/false: ");
    Boolean rename = inpt.nextBoolean();
    /* if (rename == "Y" || rename == "y") {
      renameConsent = true;
    } else if (rename == "N" || rename == "n") {
    } else {
      System.out.println("I am sorry, but I do not understand that.");
    }
*/
    if (rename == true) {
      System.out.print("Please enter a new name for your dog: ");
      mine.rename(inpt.next());
      named = mine.getName();
      System.out.println("Your dog is now called " + named);
    } else {
      System.out.println("That's fine too.");
    }
  }
}

