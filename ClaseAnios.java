
public class ClaseAnios {
	
	private final String nombre;
	private final int anioNacimiento;
	private int anio;
	private int edadTotal;

	
	public ClaseAnios(String nombre, int anioNacimiento, int anio) {
		this.nombre=nombre;
		this.anioNacimiento=anioNacimiento;
		this.anio=anio;

	}

	public String getNombre() {
		return nombre;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public int getAnio() {
		return anio;
	}
	public int getEdadTotal() {
		return edadTotal;
	}
	public void CalculaEdad(int anio, int anioNacimiento) {
		edadTotal=anio-anioNacimiento;
	}
	@Override
	public String toString() {
		return " tu nombre es " + nombre + ", naciste en el a�o " + anioNacimiento + ", en el a�o " + anio + ""
				+ " tendr�s " +edadTotal+ " a�os\n";
	}
	


	
	
	
}
