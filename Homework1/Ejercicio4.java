import java.util.Scanner;
public class Ejercicio4{
  public static void main(String[] args) {
    double catFal, SQRT, trianTotal;
      Scanner datos = new Scanner(System.in);
      System.out.println("*****Terrenos*****");
      System.out.println("Ingrese radio");
      double radioRec = datos.nextFloat();
      System.out.println("Ingrese hipotenusa");
      double hipo = datos.nextDouble();

      catFal = ((hipo*hipo)-(radioRec*radioRec));
      SQRT = Math.sqrt(catFal);
      trianTotal = SQRT * 2;

      System.out.println("El total es de: " + trianTotal);

  }
}
