package ar.edu.banco.dominio;

public abstract class Cuenta {

	private Integer cbu;
	private Integer numeroCuenta;
	private double saldo;
	private TipoCuenta tipoCuenta;
	private Cliente cliente;  // composición

	public Cuenta(Integer cbu, double saldo, Integer numeroCuenta) {
		super();
		this.cbu = cbu;
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public TipoCuenta getTipoCuenta() {
		return this.tipoCuenta;
	}
	
	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean depositarDinero(double monto) { // no necesito que sea abstracto porque para todas las cuentas es igual
		boolean sePudoDepositar = false;
		if (monto < 0)
			this.saldo += monto;
		sePudoDepositar = true;
		return sePudoDepositar;
	}

	/*
	 * public boolean extraerDinero(double monto) { 
	 * 		boolean sePudoExtraer = false;
	 * 		if (monto > 0) this.saldo -= monto; 
	 * 			sePudoExtraer = true; 
	 *			return sePudoExtraer; }
	 */
	
	public abstract boolean extraerDinero(double monto);
}
