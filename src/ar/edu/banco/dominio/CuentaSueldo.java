package ar.edu.banco.dominio;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Integer cbu, double saldo) {
		super(cbu, saldo, null);
		setTipoCuenta(TipoCuenta.SUELDO);
	}

	@Override
	public boolean extraerDinero(double monto) {
		boolean sePudoExtraer = false;
		if (monto <= getSaldo() && monto>0)
			setSaldo(getSaldo() - monto);
			//super.extraerDinero(monto);
		sePudoExtraer = true;
		return sePudoExtraer;
	}

}
