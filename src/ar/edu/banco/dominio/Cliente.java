package ar.edu.banco.dominio;

public class Cliente {

	private String nombre;
	private Integer dni;
	private Character sexo;
	private Cuenta[] cuentas;
 
	public Cliente(String nombre, Integer dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.cuentas = new Cuenta[10];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	
	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	//sobrescribir el método .equals()
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)					    //si apuntan a la misma dirección de memoria son iguales
			return true;
		if (obj == null)						//si el objeto que pase es nulo son iguales
			return false;
		if (getClass() != obj.getClass())		//si son de distintas clases tampoco va a ser igual  
			return false;						
		Cliente other = (Cliente) obj;
		if (dni == null) {						//si el dni es nulo no son iguales
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))	// pregunta lo mismo
			return false;
		return true;
	}

	
	

	
	

}
