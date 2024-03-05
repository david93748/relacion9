package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		Mago magoA = null;
		Mago magoB = null;
		Clerigo clerigoC = null;

		try {
			magoA=new Mago("Gandalf", TRaza.HUMANO, 14, 20, 50);
			magoB=new Mago("Griggs", TRaza.ORCO, 15, 17, 40);
			clerigoC=new Clerigo("Godwyn", TRaza.ELFO, 15, 19, 40,"Tyr");
			
			magoA.aprenderHechizo("Pistola Agua");
			magoA.aprenderHechizo("Onda Vital");
			magoB.aprenderHechizo("Lanza");
			
			System.out.println(magoA);
			System.out.println(magoB);


		} catch (PersonajeException e) {
			System.out.println(e.getMessage());
		}

	}

}
