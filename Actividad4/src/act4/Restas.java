package act4;

import java.util.Scanner;

public class Restas {
	
	public static double VALOR_ACUM = 0;
	

	public static void opcionesResta(Scanner sc2) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		boolean continuar = true;

		while (continuar) {
			opcion = solicitarOpcion(sc);
			switch (opcion) {
			case 1:
				restaDosNumReales(sc);
				break;

			case 2:
				restaDosNumEnteros(sc);
				break;

			case 3:
				restaTresNumReales(sc);
				break;

			case 4:
				restaValorAcum(sc);
				break;

			case 0:
				continuar = false;
				System.out.println("Fin del programa");
				break;
			}
		}
	}

	public static void restaValorAcum(Scanner sc) {
		System.out.println("\nEste es el valor acumulado " + VALOR_ACUM);
		System.out.println("Introduce el numero a restar al valor acumulado");
		double n1 = Double.parseDouble(sc.nextLine());
		
		double result4 = VALOR_ACUM - n1;
		
		System.out.println("El resultado es: " + result4);
		
		VALOR_ACUM -= result4;
	}

	private static void restaTresNumReales(Scanner sc) {
		System.out.println("\nIntroduce el primer numero real a restar");
		double n1 = Double.parseDouble(sc.nextLine());

		System.out.println("Introduce el segundo numero real");
		double n2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce el tercer numero real");
		double n3 = Double.parseDouble(sc.nextLine());
		
		double resul3 = n1 - n2 - n3;
		
		System.out.println("El resultado es: "+ resul3);
		
		VALOR_ACUM -= resul3;

	}

	private static void restaDosNumEnteros(Scanner sc) {
		System.out.println("\nIntroduce el primer numero entero a restar");
		int n1 = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el segundo numero entero");
		int n2 = Integer.parseInt(sc.nextLine());

		int resul2 = n1 - n2;
		
		System.out.println("El resultado es: "+ resul2);
		
		VALOR_ACUM -= (double)resul2;
	}

	private static void restaDosNumReales(Scanner sc) {
		System.out.println("\nIntroduce el primer numero real a restar");
		double n1 = Double.parseDouble(sc.nextLine());

		System.out.println("Introduce el segundo numero real");
		double n2 = Double.parseDouble(sc.nextLine());
		
		double resul1 = n1 - n2;
		
		System.out.println("El resultado es: "+ resul1);
		
		VALOR_ACUM -= resul1;
	}
	private static int solicitarOpcion(Scanner sc) {
		int opcion = -1;

		do {
			try {
				System.out.println("Introduce la opcion que desea utilizar"
						+ "\n1. Restar dos numeros reales"
						+ "\n2. Restar dos numeros enteros"
						+ "\n3. Restar tres numeros reales"
						+ "\n4. Restar el valor acumulado"
						+ "\n0. Terminar el programa");
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

