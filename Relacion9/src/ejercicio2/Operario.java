package ejercicio2;

public class Operario extends Empleado {

	private static final int ULTIMA_NAVE = 5;
	private static final int SUELDO_MAXIMO = 1200;
	private int nave;

	public Operario(String dni, String nombre, int sueldo, int nave) throws EmpleadoException {
		super(dni, nombre, sueldo);
		setNave(nave);
	}

	public int getNave() {
		return nave;
	}

	public void setNave(int nave) throws EmpleadoException {
		if (nave < 1 || nave > ULTIMA_NAVE) {
			throw new EmpleadoException("La nave tiene que ser entre 1 y " + ULTIMA_NAVE);
		}
		this.nave = nave;
	}

	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo > SUELDO_MAXIMO) {
			throw new EmpleadoException("Sueldo incorrecto");
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return "Operario " + super.toString() + " nave=" + nave;
	}

}
