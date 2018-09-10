import java.util.Scanner;
public class Ejercicio6{
  public static void main(String[] args) {
    double SS;
      Scanner datos = new Scanner(System.in);
      System.out.println("*****SUELDOS*****");
      System.out.println("Ingrese las horas laboradas");
      double HT = datos.nextDouble();
      System.out.println("Ingrese el pago por hora");
      double PH = datos.nextDouble();

      SS = HT * PH;

      System.out.println("El sueldo semanal es de: " + SS);
  }
}
