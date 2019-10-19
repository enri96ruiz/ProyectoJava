import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Leendo{
	public void lee() {
		try {
			FileReader entrada = new FileReader("src/ficheros_directorios/edad.txt");
			BufferedReader mibuffer=new BufferedReader(entrada);
			String linea="";
			
			while(linea!=null) {
				linea=mibuffer.readLine();
				if (linea!=null) 
					
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println("No se ha encontrado el archivo");
		}
	}
   
}