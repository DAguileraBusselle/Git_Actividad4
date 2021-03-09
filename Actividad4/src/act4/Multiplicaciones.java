package act4;

import java.util.Scanner;
import java.lang.Math;

public class Multiplicaciones {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);		
	sc.close();
	}

	

	static void multiplicaciones(Scanner sc) {
		boolean continuar = true;
		int opcion;
		while (continuar) {
		opcion = solicitarOpcionMultiplicacion(sc);
		
		switch (opcion) {
		case 1:
			// producto de dos numeros reales
			productoReales(sc);
			break;
		case 2:
			// producto de dos numeros enteros
			productoEnteros(sc);
			break;
		case 3:
			// producto de 3 numeros reales
			producto3Reales(sc);
			break;
		case 4:
			// potencia
			potencia(sc);
			break;
		default:
			//salir de esta parte de la app
			continuar = false;
			break;
			}
		}
		
	}



	private static void potencia(Scanner sc) {
		System.out.println("Introduzca un número a ser base");
		double numBase = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca otro número a ser exponente");
		double numExpo = Integer.parseInt(sc.nextLine());;
		
		double resultado = Math.pow(numBase, numExpo);
		System.out.println("El resultado es " + resultado);
		
	}

	private static void producto3Reales(Scanner sc) {
		System.out.println("Introduzca un número real a multiplicar");
		double numReal1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca otro número real a multiplicar");
		double numReal2 = Double.parseDouble(sc.nextLine());;
		System.out.println("Introduzca un tercer número real a multiplicar");
		double numReal3 = Double.parseDouble(sc.nextLine());;
		
		double resultado = numReal1 * numReal2 * numReal3;
		System.out.println("El resultado es " + resultado);
		
	}

	static void productoReales(Scanner sc) {
		
		System.out.println("Introduzca un número real a multiplicar");
		double numReal1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca otro número real a multiplicar");
		double numReal2 = Double.parseDouble(sc.nextLine());;
		
		double resultado = numReal1 * numReal2;
		System.out.println("El resultado es " + resultado);
		
	}
	
	static void productoEnteros(Scanner sc) {
		
		System.out.println("Introduzca un número entero a multiplicar");
		int numInt1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca otro número entero a multiplicar");
		int numInt2 = Integer.parseInt(sc.nextLine());;
		
		int resultado = numInt1 * numInt2;
		System.out.println("El resultado es " + resultado);
		
	}


	private static int solicitarOpcionMultiplicacion(Scanner sc) {
		int opcion = -1;

		do {
			try {
				System.out.println("\nIntroduce la acción que desea realizar");
				System.out.println("1 - para multiplicar dos números reales\n" + "2 - para multiplicar dos números enteros\n"
						+ "3 - para multiplicar tres números reales\n" + "4 - para calcular una potencia\n"
						+ "5 - para finalizar");
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
