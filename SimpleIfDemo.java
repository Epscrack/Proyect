import java.util.Scanner;
public class SimpleIfDemo{
  public static void main(String[] args) {

    Scanner imput = new Scanner(System.in);

    System.out.println("Enter an Integer: ");
    int number = imput.nextInt();
    if (number % 2 == 0) {
      System.out.println("It's an even number");
    }
    else {
      System.out.println("It's an odd number");
    }

    }
}
