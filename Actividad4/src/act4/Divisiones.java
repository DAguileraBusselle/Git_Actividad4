package act4;

import java.util.Scanner;
import java.lang.Math;

public class Divisiones {
	Scanner sc = new Scanner(System.in);		

	static void divisiones(Scanner sc) {
		boolean continuar = true;
		int opcion;
		while (continuar) {
		opcion = solicitarOpcionDivisiones(sc);
		
		switch (opcion) {
		case 1:
			// division de dos numeros reales
			divisionReales(sc);
			break;
		case 2:
			// division de dos numeros enteros
			divisionEnteros(sc);
			break;
		case 3:
			// inverso de un numero
			inversoNum(sc);
			break;
		case 4:
			// raiz cuadrada
			raizCuadrada(sc);
			break;
		default:
			//salir de esta parte de la app
			continuar = false;
			break;
			}
		}
		
	}



	private static void raizCuadrada(Scanner sc) {
		System.out.println("Introduzca un número");
		double num = Integer.parseInt(sc.nextLine());
				
		double resultado = Math.sqrt(num);
		System.out.println("El resultado es " + Math.round(resultado*1000.0)/1000.0);
		
	}

	private static void inversoNum(Scanner sc) {
		System.out.println("Introduzca un número");
		double num = Integer.parseInt(sc.nextLine());
		
		double resultado = 1 / num;
		System.out.println("El resultado es: 1/" + Math.round(num) + " ó " + resultado);
		
	}

	static void divisionReales(Scanner sc) {
		
		System.out.println("Introduzca un número real a dividir");
		double numReal1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca otro número real para dividir al anterior");
		double numReal2 = Double.parseDouble(sc.nextLine());
		
		double resultado = numReal1 / numReal2;
		System.out.println("El resultado es " + Math.round(resultado*1000.0)/1000.0);
		
	}
	
	static void divisionEnteros(Scanner sc) {
		
		System.out.println("Introduzca un número entero a dividir");
		int numInt1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca otro número entero para dividir al anterior");
		int numInt2 = Integer.parseInt(sc.nextLine());;
		
		int resultado = numInt1 / numInt2;
		System.out.println("El resultado es " + resultado);
		
	}


	private static int solicitarOpcionDivisiones(Scanner sc) {
		int opcion = -1;

		do {
			try {
				System.out.println("\nIntroduce la acción que desea realizar");
				System.out.println("1 - para dividir dos números reales\n" + "2 - para dividir dos números enteros\n"
						+ "3 - para calcular el inverso de un número real\n" + "4 - para calcular la raíz cuadrada de un número\n"
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

