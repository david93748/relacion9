package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		Operario operario1=null;
		Informatico informatico1=null;
		Directivo directivo1=null;
		
		try {
			operario1=new Operario("123", "Juan", 1200, 3);
			informatico1=new Informatico("456","Manuel",2500,EspecialidadInformatico.SISTEMAS);
			directivo1= new Directivo("789","Aitor",3500,"I+D");
			
			System.out.println(operario1);
			System.out.println(informatico1);
			System.out.println(directivo1);
			
		}catch(EmpleadoException e) {
			System.out.println(e.getMessage());
		}

	}

}
