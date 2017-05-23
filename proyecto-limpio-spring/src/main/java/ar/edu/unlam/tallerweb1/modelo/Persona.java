package ar.edu.unlam.tallerweb1.modelo;

public class Persona {
	
	private String nombre;
	public Persona(String nombre) {
	super();
	this.nombre = nombre;
		}
	public Persona(){}
    public String getNombre() {
		return nombre;
	}
   public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
