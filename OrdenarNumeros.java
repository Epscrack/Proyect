import java.util.Scanner;
public class OrdenarNumeros{
  public static void main(String[] args) {

    Scanner numeros = new Scanner(System.in);

    System.out.println("Ingrese el primer numero: ");
    int num1 = numeros.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int num2 = numeros.nextInt();
    System.out.println("Ingrese el tercer numero: ");
    int num3 = numeros.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println(+ num1);
    }



  }
}
