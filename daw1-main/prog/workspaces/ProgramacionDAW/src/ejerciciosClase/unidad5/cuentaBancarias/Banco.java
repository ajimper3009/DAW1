package ejerciciosClase.unidad5.cuentaBancarias;

public class Banco {

	private CuentaBancaria [] cuentas;
	
	//Constructores
	public Banco () {
		this.cuentas = new CuentaBancaria [100];
	}
	
	/**
	 * @return the cuentas
	 */
	public CuentaBancaria [] listadoCuentas() {
		return cuentas;
	}
	
	
	//Metodos de la clase
	
		//abrirCuenta
	
	
	public boolean abrirCuenta(CuentaBancaria cuenta) {
		for (int i = 0; i < this.cuentas.length; i++) {
			if (this.cuentas[i] == null) {
				this.cuentas[i] = cuenta;
				return true;
			}
		}
		System.out.println("No se permiten mas cuentas bancarias en este banco");
		return false;
		
	}
}
