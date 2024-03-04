package ejercicio3;

public class PrincipalPrueba {

	public static void main(String[] args) {
		Vehiculo coche1;
		Vehiculo furgoneta1;
		Vehiculo microbus1;

		try {
			coche1 = new Coche("2284CFM", TipoGama.MEDIA, TipoCombustible.DIESEL);
			furgoneta1 = new Furgoneta("2284CFM", TipoGama.ALTA, 300.5);
			microbus1 = new Microbus("2284CFM", TipoGama.MEDIA, 9);

			System.out.println(coche1);
			System.out.println(furgoneta1);
			System.out.println(microbus1);
			
			System.out.println(coche1.calcularPrecio(3));
			System.out.println(furgoneta1.calcularPrecio(3));
			System.out.println(microbus1.calcularPrecio(3));
			
		} catch (VehiculoException e) {
			System.out.println(e.getMessage());
		}

	}

}
