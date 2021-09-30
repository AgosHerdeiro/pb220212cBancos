package ar.edu.banco.dominio;

public class Banco {

	private Cliente[] clientes;
	private Cuenta[] cuentas;

	public Banco() {
		super();
		this.clientes = new Cliente[1000];
		this.cuentas = new Cuenta[5000];
	}

	public boolean agregarCliente(Cliente cliente) {
		return true;
	}

	public boolean agregarCuenta(Cuenta cuenta) {
		return true;
	}

	public Cuenta[] buscarCuentaDeUnCliente(Integer dni) {
		Cuenta[] cuentasCliente = new Cuenta[10];
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null)
				if (clientes[i].getDni().equals(dni)) {
					cuentasCliente = clientes[i].getCuentas();
					break;
				}
		}
		return cuentasCliente;
	}

	public double consultarSaldoCuenta(Integer numeroCuenta) { // primero busca al cliente y después la cuenta
		double saldoCuenta = 0.0;
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null)
				for (int j = 0; j < clientes[i].getCuentas().length; j++) {
					if (clientes[i].getCuentas() != null)
						if (clientes[i].getCuentas()[j].getNumeroCuenta().equals(numeroCuenta)) {
							saldoCuenta = clientes[i].getCuentas()[j].getSaldo();
							break;
						}
				}
		}
		return saldoCuenta;
	}

	public double consultarSaldoCuentaConMapeo(Integer numeroCuenta) { // poner en la cuenta un cliente --> composición
		double saldoCuenta = 0.0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getNumeroCuenta().equals(numeroCuenta)) {
					saldoCuenta = cuentas[i].getSaldo();
					break;
				}
		}
		return saldoCuenta;
	}

	public Cuenta[] buscarCuentas(Cliente cliente) {
		Cuenta[] cuentasClientes = new Cuenta[100];
		Integer cantidadDeCuentasEncontradas = 0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getCliente().equals(cliente)) {                    // 1.opción, si escribo equals me alcanza solo con eso
					/*
					 * if (cuentas[i].getCliente().getDni().equals(cliente.getDni()) &&
					 * cuentas[i].getSexo().equals(cliente.getSexo())) {             2.opción
					 */
					cuentasClientes[cantidadDeCuentasEncontradas] = cuentas[i];
					cantidadDeCuentasEncontradas++;
				}
		}
		return cuentasClientes;
	}

	/*
	 * public Cuenta[] ejemploSobrescrituraEquals() { 
	 * Cliente c1 = new Cliente (1, f, juana); 
	 * Cliente c2 = new Cliente (1, f, ana); 
	 * c1.equals(c2); --> da true,puedo comparar con objetos }
	 */
}
