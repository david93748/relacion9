package ejercicio3;

import java.util.Arrays;

public class FlotaVehiculos {
	
	private Vehiculo vehiculos[];

	/**
	 *  Variable que guarda donde se insertará el siguiente vehiculo
	 *  Empieza con 0 y si vale vehiculos.length el almacen esta lleno
	 */
	private int numeroRealDeVehiculos;

	public FlotaVehiculos(int capacidadAlmacen) throws VehiculoException {
		if (capacidadAlmacen <= 0)
			throw new VehiculoException("Numero de vehiculos no puede ser negativo o cero");
		vehiculos = new Vehiculo[capacidadAlmacen];
		numeroRealDeVehiculos = 0;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder mostrarTodo=new StringBuilder();
		
		for (int i = 0; i < numeroRealDeVehiculos; i++) {
			mostrarTodo.append(vehiculos[i].toString()+"\n");
		}
		
		return mostrarTodo.toString();
	}



	public void introducirVehiculo(Vehiculo vehiculo) throws VehiculoException {
		if(numeroRealDeVehiculos>=vehiculos.length) {
			throw new VehiculoException("El almacen esta lleno");
		}
		
		comprobarMatriculaRepetida(vehiculo);
		
		vehiculos[numeroRealDeVehiculos]=vehiculo;
		numeroRealDeVehiculos++;
		
	}
	
	public void comprobarMatriculaRepetida(Vehiculo vehiculo) throws VehiculoException {
		
		for (int i = 0; i < numeroRealDeVehiculos; i++) {
			if(vehiculo.getMatricula().equals(vehiculos[i].getMatricula())) {
				throw new VehiculoException("Esa matricula ya esta registrada");
			}
		}
	}
	
	public double precioAlquiler(String matricula, int dias) throws VehiculoException {	
		Vehiculo vehiculoEncontrado = null;
		boolean encontrado=false;
		double precio;
		
		for (int i = 0; i < numeroRealDeVehiculos&&encontrado==false; i++) {
			if(vehiculos[i].getMatricula().equals(matricula)) {
				vehiculoEncontrado=vehiculos[i];
				encontrado=true;
			}
		}
		
		if(encontrado==false) {
			throw new VehiculoException("El vehiculo no existe");
		}
		
		precio=vehiculoEncontrado.calcularPrecio(dias);
		
		return precio;
		
	}

}