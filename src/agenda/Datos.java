package agenda;

public class Datos {
	private String nombre;
	private int telefono;
	private String rfc;
	private int edad;

	public Datos(String nombre, int telefono, String rfc, int edad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.rfc = rfc;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "\nNombre = " + nombre + "\nTelefono = " + telefono + "\nrfc = " + rfc + "\nEdad = " + edad;
	}
}