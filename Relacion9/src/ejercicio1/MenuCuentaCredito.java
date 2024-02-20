package ejercicio1;

import java.util.Scanner;

public class MenuCuentaCredito {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		CuentaCredito cuentaCredito1 = null;
		boolean salir = false;

		cuentaCredito1 = crearCuentaCredito();

		do {
			mostrarMenu();

			salir = tratarMenu(cuentaCredito1);
		} while (salir == false);

	}

	public static boolean tratarMenu(CuentaCredito cuentacredito1) {
		boolean salir = false;
		int opcion;
		double cantidad;

		opcion = Integer.parseInt(teclado.nextLine());

		switch (opcion) {
		case 1:
			try {
			cantidad = solicitarNumero("¿Cuanto quieres ingresar?");
			cuentacredito1.realizarIngreso(cantidad);
			}catch(CuentaException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
				cantidad = solicitarNumero("¿Cuanto quieres sacar?");
				cuentacredito1.realizarReintegro(cantidad);
				}catch(CuentaException e) {
					System.out.println(e.getMessage());
				}

			break;
		case 3:
			System.out.println(
					"Su saldo es " + cuentacredito1.getSaldo() + "€ y su credito es " + cuentacredito1.getCredito()+"€");
			break;
		case 4:
			System.out.println("Gracias por confiar en nosotros.");
			salir = true;
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;
		}

		return salir;
	}

	public static void mostrarMenu() {
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Sacar dinero");
		System.out.println("3. Mostrar saldo y crédito");
		System.out.println("4. Salir");
		System.out.println("Elije una opcion:");
	}

	public static CuentaCredito crearCuentaCredito() {
		CuentaCredito cuentaCredito1 = null;
		double saldo, credito;
		String titular;
		boolean estaCorrecto = false;

		do {
			try {

				System.out.println("Bienvenido al BMA (Banco Monroy Alcalá)");
				System.out.println("Indique su nombre:");
				titular = teclado.nextLine();
				saldo = solicitarNumero("Indique su saldo:");
				credito = solicitarNumero("Indique su credito:");

				cuentaCredito1 = new CuentaCredito(saldo, titular, credito);
				estaCorrecto = true;
			} catch (CuentaException e) {
				System.out.println(e.getMessage());
			}
		} while (estaCorrecto == false);

		return cuentaCredito1;
	}

	public static double solicitarNumero(String msg) {
		double numero;

		System.out.println(msg);
		numero = Double.parseDouble(teclado.nextLine());

		return numero;
	}

}
