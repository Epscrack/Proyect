import java.util.Scanner;
public class PuebloDesconocido{
  public static void main(String[] args) {
    double NC, AC;

    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese su limite de credito");
    double LA = datos.nextDouble();

    System.out.println("Ingrese el tipo de tarjeta con el que cuenta");
    int TT = datos.nextInt();

    if (TT == 1)
    NC = LA + (LA * .25);

    else if (TT == 2)
    NC = LA + (LA * .35);

    else if (TT == 3)
    NC = LA + (LA * .40);

    else
    NC = LA + (LA * .50);

    AC = NC - LA;

    System.out.println("Su nuevo limite de credito es: " + NC);
    System.out.println("Su aumento de credito es de: " + AC);



  }
}
