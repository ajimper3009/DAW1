package ejerciciosClase.unidad5.interfaces;

public class CalculadoraImpl implements Calculadora {
	private String memoria;
	private int bateria;
	public CalculadoraImpl() {
		this.bateria=100;
	}
	public void cambiarPilas() {
		this.bateria=100;
	}
	@Override
	public double suma(double x, double y) throws Exception {
		// TODO Auto-generated method stub
		if (bateria>0) {			
			bateria--;
			return x+y;
		} else {
			throw new Exception();
		}
	}

	@Override
	public double resta(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double producto(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double division(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
