package act4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean continuar = true;
		int opcion;
		Scanner sc = new Scanner(System.in);
		while (continuar) {
			opcion = solicitarOpcionCalculadora(sc);
			
			switch (opcion) {
			case 1:
				// suma
				//(sc);
				break;
			case 2:
				// resta
				//(sc);
				break;
			case 3:
				// producto
				Multiplicaciones.multiplicaciones(sc);
				break;
			case 4:
				// division
				Divisiones.divisiones(sc);
				break;
			default:
				//salir de esta parte de la app
				continuar = false;
				System.out.println("Hasta luego :)");
				break;
				}
			}
			
		sc.close();
		}
	
	private static int solicitarOpcionCalculadora(Scanner sc) {
		int opcion = -1;

		do {
			try {
				System.out.println("\nIntroduce la acción que desea realizar");
				System.out.println("1 - para sumar\n" + "2 - para restar\n"
						+ "3 - para multiplicar\n" + "4 - para dividir\n"
						+ "5 - para finalizar ");
				opcion = Integer.parseInt(sc.nextLine());

				if (opcion < 0 || opcion > 5) {
					System.out.println("El valor introducido no es válido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numérico");
			}

		} while (opcion < 0 || opcion > 5);

		return opcion;
	}
}
