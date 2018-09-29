import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {
    //for (inicializar var, condicion, incremento){
    //accion
    //accion
  //}
    int tabla = Integer.parseInt(JOptionPane.showInputDialog("Enter numer"));
    String salida ="";
    for(int i = 0; i <= 9; i++){
      salida += tabla + " x " + (i + 1) + " = " + (i + 1)* tabla + "\n";
    }
    JOptionPane.showMessageDialog(null, salida);

  }
}
