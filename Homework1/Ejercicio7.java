import  java.util.Scanner;
public class Ejercicio7{
  public static void main(String[] args) {
    double PG;
      Scanner datos = new Scanner(System.in);
      System.out.println("*****Telas Poncho*****");
      System.out.println("Cantidad de metros que necesita");
      double CM = datos.nextDouble();

      PG = CM / 0.0254;

      System.out.println("LAs pulgadas que debe pedir son: " + PG);
  }
}
