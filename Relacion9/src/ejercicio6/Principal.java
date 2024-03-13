package ejercicio6;

public class Principal {

	public static void main(String[] args) {

		Edificio edificios[]= new Edificio[5];
		edificios[0]= new Polideportivo("Mosquito", 5.8, 2);
		edificios[1]= new Polideportivo("Tarantula", 9.3, 4);
		edificios[2]= new Polideportivo("Araña", 12.5, 1);
		edificios[3]=new Oficinas(20, 10);
		edificios[4]=new Oficinas(100, 50);
		
		for (int i = 0; i < edificios.length; i++) {
			System.out.println(edificios[i]);
		}
	}

}
