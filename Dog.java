public class Dog{
  String name;

  public Dog(String dogName) {
    name = dogName;
  }

  public void rename(String newName) {
    name = newName;
    System.out.println("Congratulations, you dog has been renamed to: " + name);
  }

  public String getName() {
    return name;
  }
}
