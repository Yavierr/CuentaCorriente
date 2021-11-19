package models;

public class CuentaCorriente {

	// Caracteristicas
	private String n�meroCuenta;
	private double saldo;
	private Persona titular;

	// Constructores
	public CuentaCorriente(String n�meroCuenta, double saldo, Persona titular) {
		super();
		this.n�meroCuenta = n�meroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	// Getters y setters
	public String getN�meroCuenta() {
		return n�meroCuenta;
	}

	public void setN�meroCuenta(String n�meroCuenta) {
		this.n�meroCuenta = n�meroCuenta;
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

	// M�todos
	public void sumarCantidad(double cantidad) {
		saldo = saldo + cantidad;
	}

	public void restarCantidad(double cantidad) {
		saldo = saldo - cantidad;
	}

	// toString()
	@Override
	public String toString() {
		return "CuentaCorriente [n�meroCuenta=" + n�meroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

}
