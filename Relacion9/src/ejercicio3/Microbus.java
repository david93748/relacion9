package ejercicio3;

public class Microbus extends Vehiculo {

	private static final int PRECIO_PLAZA = 5;
	private int plazas;

	public Microbus(String matricula, TipoGama gama, int plazas) throws VehiculoException {
		super(matricula, gama);
		setPlazas(plazas);
	}

	private void setPlazas(int plazas) throws VehiculoException {
		if (plazas <= 0) {
			throw new VehiculoException("Plazas incorrectas");
		}
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}
	
	

	@Override
	public String toString() {
		return "Microbus plazas=" + plazas + super.toString();
	}

	@Override
	public double calcularPrecio(int dias) throws VehiculoException {
		double precio;

		precio = calcularPrecioBase(dias) + (plazas * PRECIO_PLAZA) * dias;

		return precio;
	}

}
