import java.util.Scanner;

public class Rectangulo{
  public static void main(String[] args) {
    //leer de consola
    double area;
          Scanner datos =new Scanner(System.in);
          System.out.println("*****Calcular Area de Rectangulo*****");
          System.out.println("Ingrese base del rectangulo");
          double base=datos.nextDouble();
          System.out.println("Ingrese altura del rectangulo");
          double altura=datos.nextDouble();
          area=base*altura;
          System.out.println("El area del rectangulo es: " + area);
       }
  }
