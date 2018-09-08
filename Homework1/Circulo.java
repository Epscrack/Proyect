import java.util.Scanner;
public class Circulo{
public static void main(String[] args) {
  double radio, area;
        Scanner ingreso = new Scanner(System.in);
	      System.out.println("*****Calcular Area de Circulo*****");
        System.out.println("Ingrese el radio del circulo");
        radio = ingreso.nextFloat();
        area = (3.14159*radio*radio);
        System.out.println ("Area del circulo es: "+ area);
      }
}
