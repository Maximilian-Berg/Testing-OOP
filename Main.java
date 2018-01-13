public class Main {
  public static void main(String[] Args) {
      Dog mine = new Dog("Sparkie");
      String named = mine.getName();
      System.out.println(named);
      mine.rename("Spiky");
      named = mine.getName();
      System.out.println(named);
  }
}
