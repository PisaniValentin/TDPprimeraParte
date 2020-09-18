package PrimeraParte;

public class Persona {
	protected int edad;
	protected String nombre;
	
	public Persona(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
}
