package ejercicio3;

public class Furgoneta extends Vehiculo {
	
	private static final double PRECIO_PMA = 0.5;
	private double pma;

	public Furgoneta(String matricula, TipoGama gama, double pma) throws VehiculoException {
		super(matricula, gama);
		setPma(pma);
	}

	public double getPma() {
		return pma;
	}

	private void setPma(double pma) throws VehiculoException {
		if(pma<0||pma>3500) {
			throw new VehiculoException("El PMA debe ser un valor positivo menor que 3500");
		}
		this.pma = pma;
	}

	@Override
	public String toString() {
		return "Furgoneta pma=" + pma + super.toString();
	}

	@Override
	public double calcularPrecio(int dias) throws VehiculoException {
		double precio;
		
		precio=calcularPrecioBase(dias)+(pma*PRECIO_PMA)*dias;
		
		return precio;
	}
	
	
	

}
