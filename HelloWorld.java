import java.util.Scanner;

public class HelloWorld
{
  private static Scanner in = new Scanner(System.in);
  public static void main(String args[])
  {
    System.out.println("Ayo what's your name, homie?");
    String name = in.nextLine();
    System.out.println("Goodbye, " + name + "!");
  }
}
