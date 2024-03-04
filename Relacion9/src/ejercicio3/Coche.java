package ejercicio3;

public class Coche extends Vehiculo {

	private static final double PRECIO_GASOLINA = 3.5;
	private static final double PRECIO_DIESEL = 2;



	private TipoCombustible combustible;

	public Coche(String matricula, TipoGama gama, TipoCombustible combustible) {
		super(matricula, gama);
		this.combustible = combustible;
	}

	public TipoCombustible getCombustible() {
		return combustible;
	}
	
	

	@Override
	public String toString() {
		return "Coche combustible=" + combustible + super.toString();
	}

	@Override
	public double calcularPrecio(int dias) throws VehiculoException {
		
		double precio = 0;
		
		switch (combustible) {
		case GASOLINA:
			precio=calcularPrecioBase(dias)+PRECIO_GASOLINA*dias;
			break;
		case DIESEL:
			precio=calcularPrecioBase(dias)+PRECIO_DIESEL*dias;
			break;
			}

		

		return precio;
	}

}
