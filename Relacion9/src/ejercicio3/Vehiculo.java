package ejercicio3;

public abstract class Vehiculo {
	private static final double PRECIO_GAMA_BAJA = 30;
	private static final double PRECIO_GAMA_MEDIA = 40;
	private static final double PRECIO_GAMA_ALTA = 50;

	private String matricula;
	private TipoGama gama;

	public Vehiculo(String matricula, TipoGama gama) {
		this.matricula=matricula;
		this.gama=gama;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public TipoGama getGama() {
		return gama;
	}

	@Override
	public String toString() {
		return " matricula=" + matricula + ", gama=" + gama;
	}
	
	public abstract double calcularPrecio(int dias) throws VehiculoException;
	
	protected double calcularPrecioBase(int dias) throws VehiculoException {
		if(dias<=0) {
			throw new VehiculoException("Los dias tienen que ser mayor a 0");
		}
		
		double precio = 0;
		
		switch (gama) {
		case BAJA:
			precio=PRECIO_GAMA_BAJA*dias;
			break;
		case MEDIA:
			precio=PRECIO_GAMA_MEDIA*dias;
			break;
		case ALTA:
			precio=PRECIO_GAMA_ALTA*dias;
			break;

		}
		return precio;
	}
	
}
