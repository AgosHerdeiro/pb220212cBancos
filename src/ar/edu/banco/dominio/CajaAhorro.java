package ar.edu.banco.dominio;

public class CajaAhorro extends Cuenta {

	private Integer contadorExtracciones;

	public CajaAhorro(Integer cbu, double saldo) {
		super(cbu, saldo, null);
		setTipoCuenta(TipoCuenta.CAJA_AHORRO);
		this.contadorExtracciones = 0;
	}

	@Override
	public boolean extraerDinero(double monto) {
		boolean sePudoExtraer = false;
		double maximoMontoAExtraer = 0;
		if (this.contadorExtracciones >= 5) {
			maximoMontoAExtraer = getSaldo() - 6;
		}
		if (monto <= maximoMontoAExtraer) {
			if (contadorExtracciones < 5) {
				setSaldo(getSaldo() - monto);
			} else {
				setSaldo(getSaldo() - monto - 6);
			}
			contadorExtracciones++;
			sePudoExtraer = true;
		}
		return sePudoExtraer;
	}

}
