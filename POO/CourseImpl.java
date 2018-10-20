import javax.swing.*;
public class CourseImpl {
	/** Main method */
	public static void main(String[] args) {

int opc = 0;
Course curso1 = null;
    do{
         opc = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU"
        + "\n1: Crear curso"
        + "\n2: Agregar estudiante"
        + "\n3: Eliminar estudiante"
        + "\n4: Mostrar estudiantes"
        + "\n5: Mostrar numero de estudiantes "));


        switch(opc){
          case 1:
          //Crear el curso
					curso1 = new Course(JOptionPane.showInputDialog(null,"Ingrese el nombre de la materia"));
          break;
          case 2:
          //Agrregar estudiantes
					curso1.addStudent(JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno"));
          break;
          case 3:
          //Eliminar estudiantes
					curso1.dropStudent(JOptionPane.showInputDialog(null,"Ingrese el alumno a eliminar"));
          break;
          case 4:
          //Mostrar estudiantes
					String[] studentsIngles = curso1.getStudents();
					JOptionPane.showMessageDialog(null,"\nThe students in the course " + curso1.getCourseName() + ":");
					JOptionPane.showMessageDialog(null,studentsIngles);
          break;
          case 5:
          //Mostrar el numero de estudiantes
					JOptionPane.showMessageDialog(null,"Number of students in " + curso1.getCourseName() + ": " + curso1.getNumberOfStudents());
				//	System.out.println("Number of students in course1: "
				//		+ course1.getNumberOfStudents());
					studentsIngles = curso1.getStudents();
				
          break;
          default:
          //Opcion incorrecta
					JOptionPane.showMessageDialog(null,"Opcion invalida elige del 1 al 5!");
          break;
        }
			}while (opc <= 5);

		}
}
