package ejercicio4;

import java.util.Arrays;

public class Mago extends Personaje {

	private static final int SPELL_DAMAGE = 10;
	private static final int INTELIGENCIA_MIN_MAGO = 17;
	private static final int FUERZA_MAX_MAGO = 15;
	private static final int NUMERO_MAXIMO_HECHIZOS = 4;
	private String hechizos[];

	public Mago(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		hechizos = new String[NUMERO_MAXIMO_HECHIZOS];
	}

	public void setFuerza(int fuerza) throws PersonajeException {
		if (fuerza > FUERZA_MAX_MAGO) {
			throw new PersonajeException("La fuerza del mago no puede ser mayor a " + FUERZA_MAX_MAGO);
		}
		super.setFuerza(fuerza);
	}

	public void setInteligencia(int inteligencia) throws PersonajeException {
		if (inteligencia < INTELIGENCIA_MIN_MAGO) {
			throw new PersonajeException("La inteligencia no puede ser menor a " + INTELIGENCIA_MIN_MAGO);
		}
		super.setInteligencia(inteligencia);
		;
	}

	@Override
	public String toString() {
		StringBuilder mostrarTodo=new StringBuilder();
		
		mostrarTodo.append("Mago "+ super.toString()+"\n Hechizos: ");
		
		for (int i = 0; i < hechizos.length; i++) {
			if(hechizos[i]==null) {
				mostrarTodo.append("-\t\t\t");
			}else {
				mostrarTodo.append("-"+hechizos[i]+"\t");
			}
		}
		
		
		return mostrarTodo.toString();
	}

	public void aprenderHechizo(String nombre) throws PersonajeException {
		boolean encontrado = false;

		for (int i = 0; i < hechizos.length && encontrado == false; i++) {
			if (hechizos[i] == null) {
				hechizos[i] = nombre;
				encontrado = true;
			}
		}

		if (encontrado == false) {
			throw new PersonajeException("No se pueden aprender mas hechizos");
		}

	}

	public void lanzarHechizo(Personaje personaje1, String nombreHechizo) throws PersonajeException {
		int posicionHechizo = buscarHechizo(nombreHechizo);

		if (posicionHechizo == -1) {
			throw new PersonajeException("Ese hechizo no esta aprendido");
		}
		
		hechizos[posicionHechizo]=null;
		personaje1.setVidaActual(personaje1.getVidaActual()-SPELL_DAMAGE);
		
		
	}

	public int buscarHechizo(String nombreHechizo) {
		int posicionHechizo = -1;

		for (int i = 0; i < hechizos.length && posicionHechizo == -1; i++) {
			if (nombreHechizo.equals(hechizos[i])) {
				posicionHechizo = i;
			}
		}

		return posicionHechizo;
	}

}
