package models;

public class Persona {

	// Caracteristicas
	private String nombre, apellidos, dni;
	private double sueldo;
	private CuentaCorriente cuenta;

	// Constructores
	public Persona(String nombre, String apellidos, String dni, double sueldo, CuentaCorriente cuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuenta = cuenta;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public CuentaCorriente getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}

	//Métodos
	public void cobrarSueldo() {
		cuenta.sumarCantidad(sueldo);
	}
	public void sacarPasta(double sueldo) {
		cuenta.restarCantidad(sueldo);
	}
	public void subirSueldo(double nuevoSaldo) {
		sueldo = sueldo+200;
	}
	// toString()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sueldo=" + sueldo +", saldo=" + cuenta.getSaldo()
				+ "]";
	}

}
