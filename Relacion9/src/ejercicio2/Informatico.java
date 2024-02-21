package ejercicio2;

public class Informatico extends Empleado {
	
	private static final int SUELDO_MAXIMO = 2500;
	private EspecialidadInformatico especialidad;

	public Informatico(String dni, String nombre, int sueldo, EspecialidadInformatico especialidad)
			throws EmpleadoException {
		super(dni, nombre, sueldo);
		this.especialidad = especialidad;
	}

	public EspecialidadInformatico getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadInformatico especialidad) {
		this.especialidad = especialidad;
	}
	
	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo > SUELDO_MAXIMO) {
			throw new EmpleadoException(" Sueldo incorrecto");
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return "Informatico "+super.toString()+ " especialidad=" + especialidad;
	}
	
	
	

}
