
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class adivina_numeros {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
		System.out.println("Elige una opci�n:\n1:Adivinar la contrase�a"
				+ "\n2:Adivina el n�mero aleatorio"
				+ "\n3:�Cu�ntos a�os tendr� en... ?"
				+ "\n4:Suma n�meros aleatorios "
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
			System.out.println("Introduce contrase�a");
			pass=entrada1.nextLine();
			if(clave.equals(pass)==false) {
				intentos1++;
				System.out.println("Contrase�a incorrecta");
			}
		}
		System.out.println("");
			System.out.println("Contrase�a correcta!!!");
			System.out.println("enhorabuena has conseguido descifrar la contrase�a"
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
			System.out.println("�Podr�as averiguar el n�mero aleatorio? Introduce "
					+ "un n�mero por favor");
			numero=entrada.nextInt();
			if (aleatorio<numero) {
				System.out.println("numero m�s bajo ");
				}
				else if (aleatorio>numero) {
					System.out.println("numero m�s alto");
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
			System.out.println("Introduzca su a�o de nacimiento");
			edad=entrada2.nextInt();
			
			System.out.println("Introduce a�o");
			anio=entrada2.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("no introduciste un n�mero positivo\n");
			}
			edadTotal=anio-edad;
			if(edad!=0 && anio!=0) {
			System.out.println("Tu nombre es "+nombre+" en el a�o "+anio+" tendr�s "+edadTotal+ " a�os\n");
			String edadT="Tu nombre es "+nombre+" en el a�o "+anio+" tendr�s "+edadTotal+ " a�os\n";
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
				System.out.println("La suma es "+suma+ " y est� en el intervalo de 11 y 20");
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
			System.out.println("La opci�n no es correcta");
		}
		}while(opcion!=6);
		

		
	}
}




