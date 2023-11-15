import javax.swing.*;
public class poo {
	public static void main(String args[]) {
		
		///-- Sistema de verificación IF ---///
		
		String key = "Steven", inputpass ="";
		while (key.equals(inputpass)==false) {
			inputpass = JOptionPane.showInputDialog("Ingrese su key de acceso.");
			if (key.equals(inputpass)==false) {
				System.out.println("Key de acceso a la aplicación denegado.");
			}
		}
		System.out.println("El key de acceso ha sido validado! :). ");
		System.out.println();
		
		//// --- Interfaz ingreso ---///
		String abord="=", bbord="|";
		int a,b,c;
		a=0;
		System.out.print(bbord);
		while (a<=50) {
			System.out.print(abord);
			a++;
		}
		System.out.print(bbord);
		System.out.println();
		//////////////////////////////////
		if(a==51) {
			System.out.println("|===== Bienvenido al verificador de notas 0.1 ======|");
		}
		a=0;
		System.out.print(bbord);
		while (a<=50) {
			System.out.print(abord);
			a++;
		}
		System.out.print(bbord);
		System.out.println();
		System.out.println();
		String estudiante ="";
		estudiante = JOptionPane.showInputDialog("Porfavor ingrese su nombre.");
		System.out.println("Bienvenido " + estudiante + " al verificador de notas! \n a continuación, ingrese la nota"
				+ " del trimestre 1 ");
		int tri_1= Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la nota del primer trimestre"));
		int tri_2= Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la nota del segundo trimestre"));
		System.out.println();
		
		int f = (tri_1+tri_2);
		if(f<=7) {
			System.out.println(estudiante + " no lograste aprobar la materia, :(.");
		} else if ((f>=5)&&(f<7)) {
				System.out.println(estudiante + " tiene posibilidad de presentar el supletorio, suerte!");
			} else {
			System.out.println(estudiante + " lograste aprobar la materia, felicidades!");
		} 
		
				
	}
}