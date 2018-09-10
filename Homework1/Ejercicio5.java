import java.util.Scanner;
public class Ejercicio5{
  public static void main(String[] args) {
    double TG, GA;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("****Venta de Leche****");
        System.out.println("Ingrese la cantidad de litros producidos");
        int litVen = ingreso.nextInt();
        System.out.println("Ingrese el precio del galon");
        double PG = ingreso.nextDouble();

        TG = litVen / 3.785;
        GA = TG * PG;

        System.out.println("La ganancia de la produccion es: " + GA);




  }
}
