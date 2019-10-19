import java.io.*;

class Escribiendo{
	public void escribir(File ruta_archivo,String sentencia) {
		String frase=sentencia;
		try {
			FileWriter escritura=new FileWriter(ruta_archivo,true);
			for (int i = 0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
