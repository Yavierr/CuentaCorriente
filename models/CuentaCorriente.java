package models;

public class CuentaCorriente {

	// Caracteristicas
	private String númeroCuenta;
	private double saldo;
	private Persona titular;

	// Constructores
	public CuentaCorriente(String númeroCuenta, double saldo, Persona titular) {
		super();
		this.númeroCuenta = númeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	// Getters y setters
	public String getNúmeroCuenta() {
		return númeroCuenta;
	}

	public void setNúmeroCuenta(String númeroCuenta) {
		this.númeroCuenta = númeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	// Métodos
	public void sumarCantidad(double cantidad) {
		saldo = saldo + cantidad;
	}

	public void restarCantidad(double cantidad) {
		saldo = saldo - cantidad;
	}

	// toString()
	@Override
	public String toString() {
		return "CuentaCorriente [númeroCuenta=" + númeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

}
