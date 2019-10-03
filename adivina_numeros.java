import java.util.Scanner;

import javax.swing.JOptionPane;

public class adivina_numeros {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
		System.out.println("Elige una opción:\n1:Adivinar la contraseña"
				+ "\n2Adivinar el número que estoy pensando"
				+ "\n3¿Cuántos años tendré en... ?"
				+ "\n4:Salir"
				+ "");

		opcion=teclado.nextInt();
		
		switch(opcion) {
		
		case 1:
			String clave="enrique";
			String pass="";
			int intentos1=0;
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("introduce contraseña");
			if(clave.equals(pass)==false) {
				intentos1++;
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("");
			System.out.println("Contraseña correcta!!!");
			System.out.println("enhorabuena has conseguido descifrar la contraseña"
					+ " en "+intentos1+ " intentos !!!");
			System.out.println("");
			break;
		case 2:
		
		int aleatorio=(int)(Math.random()*100);
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		//mientras numero sea diferente de aleatorio
		while (numero!=aleatorio) {
			intentos++;
			System.out.println("¿Podrías averiguar el número que estoy pensando? Introduce "
					+ "un número por favor");
			numero=entrada.nextInt();
			if (aleatorio<numero) {
				System.out.println("numero más bajo ");
				}
				else if (aleatorio>numero) {
					System.out.println("numero más alto");
				}
			
		}
		System.out.println("correcto lo has conseguido en "+intentos+ " intentos");
		break;
		case 3:
			String nombre=JOptionPane.showInputDialog("Introduzca su nombre, por favor");
			String edad=JOptionPane.showInputDialog("Introduce año nacimiento");
			int edadEntero=Integer.parseInt(edad);
			String anio=JOptionPane.showInputDialog("Introduce año");
			int anioEntero=Integer.parseInt(anio);
			int edadTotal=anioEntero-edadEntero;
			System.out.println("Tu nombre es "+nombre+" en el año "+anioEntero+" tendrás "+edadTotal+ " años");
			break;
		case 4:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("La opción no es correcta");
		}
		}while(opcion!=4);
		
	}

}
