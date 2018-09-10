import java.util.Scanner;
public class Ejercicio4{
  public static void main(String[] args) {
    double C, ACC, SQRT, ACT, AT, AC, area;
      Scanner datos = new Scanner(System.in);
      System.out.println("*****Terrenos*****");
      System.out.println("Ingrese radio");
      double R = datos.nextFloat();
      System.out.println("Ingrese Hipotenusa");
      double H = datos.nextDouble();

      //Triangulo
      C = ((H*H)-(R*R));
      SQRT = Math.sqrt(C);
      ACT = SQRT;

      //Circunferencia
      ACC = (3.14159*R*R);


      //Operaciones
      AT = ACT * 2;
      AC = ACC / 2;
      area = AC + AT;




      System.out.println("El total es de: " + area);

  }
}
