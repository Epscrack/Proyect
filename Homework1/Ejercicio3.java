import java.util.Scanner;
public class Ejercicio3{
  public static void main(String[] args) {
    double area, ACT, AT, AR;
          Scanner ingreso = new Scanner(System.in);
          System.out.println("*****Terrenos*****");
          System.out.println("Ingrese la altura mayor");
          double alturaTotal = ingreso.nextDouble();
          System.out.println("Ingrese base del terreno");
          double baseTotal = ingreso.nextDouble();
          System.out.println("Ingrese la altura menor");
          double alturaRec = ingreso.nextDouble();

          ACT = (alturaTotal - alturaRec);
          AT = (baseTotal * ACT)/2;
          AR = (baseTotal * alturaRec);
          area = AT + AR;

          System.out.println("El area total es: " + area);

  }
}
