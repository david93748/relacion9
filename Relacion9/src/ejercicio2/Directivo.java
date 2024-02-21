package ejercicio2;

public class Directivo extends Empleado {
	
	private static final int SUELDO_MAXIMO = 3500;
	private String nombreDepartamento;

	public Directivo(String dni, String nombre, int sueldo, String nombreDepartamento) throws EmpleadoException {
		super(dni, nombre, sueldo);
		this.nombreDepartamento = nombreDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo > SUELDO_MAXIMO) {
			throw new EmpleadoException(" Sueldo incorrecto");
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return "Directivo " +super.toString()+ " departamento="+ nombreDepartamento;
	}
	

}
