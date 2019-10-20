import java.io.*;

class Escribiendo{
	public void escribir(File ruta_archivo, String string) {
		String frase=string;
		try { 
			FileWriter escritura=new FileWriter(ruta_archivo);
			for (int i = 0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
