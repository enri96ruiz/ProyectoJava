
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class adivina_numeros {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
		System.out.println("Elige una opción:\n1:Adivinar la contraseña"
				+ "\n2:Adivina el número aleatorio"
				+ "\n3:¿Cuántos años tendré en... ?"
				+ "\n4:Suma números aleatorios "
				+ "\n5: Leer Edades introducidas"
				+ "\n6:Salir"
				+ "");

		opcion=teclado.nextInt();
		
		switch(opcion) {
		
		case 1:
			Scanner entrada1=new Scanner(System.in);
			String clave="enrique";
			String pass="";
			int intentos1=1;
		while(clave.equals(pass)==false) {
			System.out.println("Introduce contraseña");
			pass=entrada1.nextLine();
			if(clave.equals(pass)==false) {
				intentos1++;
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("");
			System.out.println("Contraseña correcta!!!");
			System.out.println("enhorabuena has conseguido descifrar la contraseña"
					+ " al "+intentos1+ " intento !!!");
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
			System.out.println("¿Podrías averiguar el número aleatorio? Introduce "
					+ "un número por favor");
			numero=entrada.nextInt();
			if (aleatorio<numero) {
				System.out.println("numero más bajo ");
				}
				else if (aleatorio>numero) {
					System.out.println("numero más alto");
				}
			
		}
		System.out.println("correcto lo has conseguido al "+intentos+ " intento");
		break;
		case 3:
			Scanner entrada2=new Scanner(System.in);
			String nombre = null;
			int edad = 0;
			int anio = 0;
			int edadTotal;
			System.out.println("Introduzca su nombre, por favor");
			
			nombre=entrada2.nextLine();
			try {
			System.out.println("Introduzca su año de nacimiento");
			edad=entrada2.nextInt();
			
			System.out.println("Introduce año");
			anio=entrada2.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("no introduciste un número positivo\n");
			}
			edadTotal=anio-edad;
			if(edad!=0 && anio!=0) {
			System.out.println("Tu nombre es "+nombre+" en el año "+anio+" tendrás "+edadTotal+ " años\n");
			String edadT="Tu nombre es "+nombre+" en el año "+anio+" tendrás "+edadTotal+ " años\n";
			File resumenEdad = new File("src/ficheros_directorios/edad.txt");
			Escribiendo accede = new Escribiendo();
			accede.escribir(resumenEdad, edadT);
			}
			break;
		case 4:
			int primerEntero = (int)(Math.random()*10+1);
			int segundoEntero = (int)(Math.random()*10+1);
			int suma = primerEntero+segundoEntero;
			if(suma <=10) {
				throw new IllegalArgumentException("Suma fuera del intervalo, siendo"
						+ " la suma "+suma);
			}else {
				System.out.println("La suma es "+suma+ " y está en el intervalo de 11 y 20");
			}
			break;
		case 5:
			Leendo leerEdad= new Leendo();
			leerEdad.lee();
			break;
		case 6:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("La opción no es correcta");
		}
		}while(opcion!=6);
		

		
	}
}




