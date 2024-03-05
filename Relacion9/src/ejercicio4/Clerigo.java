package ejercicio4;

public class Clerigo extends Personaje {

	private static final int CURACION_CLERIGO = 10;
	private static final int FUERZA_MIN_CLERIGO = 18;
	private static final int INTELIGENCIA_MIN_CLERIGO = 12;
	private static final int INTELIGENCIA_MAX_CLERIGO = 18;
	private String dios;

	public Clerigo(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMaxima, String dios)
			throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		setDios(dios);
	}
	
	
	public void setFuerza(int fuerza) throws PersonajeException {
		if (fuerza < FUERZA_MIN_CLERIGO) {
			throw new PersonajeException("La fuerza del clerigo no puede ser menor a " + FUERZA_MIN_CLERIGO);
		}
		super.setFuerza(fuerza);
	}

	public void setInteligencia(int inteligencia) throws PersonajeException {
		if (inteligencia < INTELIGENCIA_MIN_CLERIGO || inteligencia > INTELIGENCIA_MAX_CLERIGO) {
			throw new PersonajeException("La inteligencia no puede ser menor a " + INTELIGENCIA_MIN_CLERIGO+" ni mayor a "+INTELIGENCIA_MAX_CLERIGO);
		}
		super.setInteligencia(inteligencia);
	}


	public String getDios() {
		return dios;
	}


	public void setDios(String dios) {
		this.dios = dios;
	}
	
	
	
	@Override
	public String toString() {
		return "Clerigo "+super.toString()+" dios= " + dios;
	}


	public void curar(Personaje personaje1) throws PersonajeException {
		
		personaje1.setVidaActual(getVidaActual()+CURACION_CLERIGO);
	}
	

}
