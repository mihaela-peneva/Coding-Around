import java.util.Scanner;
public class Input {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Sum to add: ");
      double age = input.nextDouble();
      System.out.print("Name: ");
      String username = input.next();
      Name inputName = new Name(username);
      System.out.println(inputName.getName());

  }

}
