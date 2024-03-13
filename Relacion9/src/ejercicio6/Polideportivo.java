package ejercicio6;

public class Polideportivo implements Edificio, InstalacionDeportiva {
	
	private String nombre;
	private double superficieEdificio;
	private int tipoInstalacion;
	
	public Polideportivo(String nombre, double superficieEdificio, int tipoInstalacion) {
		this.nombre = nombre;
		this.superficieEdificio = superficieEdificio;
		this.tipoInstalacion = tipoInstalacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	public int getTipoInstalacion() {
		return tipoInstalacion;
	}

	public void setTipoInstalacion(int tipoInstalacion) {
		this.tipoInstalacion = tipoInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + ", superficieEdificio=" + superficieEdificio + ", tipoInstalacion="
				+ tipoInstalacion + "]";
	}
	
	
	
	

}
