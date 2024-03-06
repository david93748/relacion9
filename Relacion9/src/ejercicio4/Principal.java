package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		Mago magoA = null;
		Mago magoB = null;
		Clerigo clerigoC = null;

		try {
			magoA=new Mago("Gandalf", TRaza.HUMANO, 14, 20, 50);
			magoB=new Mago("Griggs", TRaza.ORCO, 15, 17, 40);
			clerigoC=new Clerigo("Godwyn", TRaza.ELFO, 19, 15, 40,"Tyr");
			
			magoA.aprenderHechizo("Pistola Agua");
			magoA.aprenderHechizo("Onda Vital");
			magoB.aprenderHechizo("Lanza Helada");
			
			System.out.println(magoA);
			System.out.println(magoB);
			
			magoA.lanzarHechizo(magoB, "Pistola Agua");
			magoB.lanzarHechizo(magoB, "Lanza Helada");
			clerigoC.curar(magoB);
			magoA.lanzarHechizo(magoB, "Onda Vital");
			
			System.out.println(magoA);
			System.out.println(magoB);
			System.out.println(clerigoC);


		} catch (PersonajeException e) {
			System.out.println(e.getMessage());
		}

	}

}
