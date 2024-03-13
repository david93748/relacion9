package ejercicio6;

public class Oficinas implements Edificio{
	
	private int numeroOficinas;
	private double superficieEdificio;
	
	public Oficinas(int numeroOficinas, int superficieEdificio) {
		this.numeroOficinas = numeroOficinas;
		this.superficieEdificio = superficieEdificio;
	}

	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	public void setSuperficieEdificio(int superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	@Override
	public String toString() {
		return "EdificioOficinas [numeroOficinas=" + numeroOficinas + ", superficieEdificio=" + superficieEdificio
				+ "]";
	}
	
	
	

}
