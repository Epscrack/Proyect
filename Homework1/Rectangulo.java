import java.util.Scanner;

public class Rectangulo{
  public static void main(String[] args) {
    //leer de consola
    double area;
          Scanner datos =new Scanner(System.in);
          System.out.println("Ingrese base del rectangulo");
          double b=datos.nextDouble();
          System.out.println("Ingrese altura del rectangulo");
          double a=datos.nextDouble();
          area=b*a;
          System.out.println("El area del rectangulo es: " + area);
       }
  }
