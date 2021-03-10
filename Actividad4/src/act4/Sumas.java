package act4;

import java.util.Scanner;

public class Sumas {
	
	public static double VALOR_ACUM = 0;
	
	Scanner sc = new Scanner(System.in);
	
	static void sumas(Scanner sc) {
		boolean continuar = true;
		int opcion;
		
		while (continuar){
			opcion = solicitarOpcionSuma(sc);

			switch (opcion) {
			case 1:
				//suma dos reales
				sumaReales(sc);
				break;
	
			case 2:
				//suma dos enteros
				sumaEnteros(sc);
				break;
			
			case 3:
				//suma tres reales
				sumaTresReales(sc);
				break;
	
			case 4:
				//suma acumulada
				sumaAcumulada(sc);
				break;
	
			default:
				//salir
				continuar = false;
				break;
				}
			}

		}

	private static void sumaAcumulada(Scanner sc) {
		System.out.println("\nEste es el valor acumulado " + VALOR_ACUM);
		System.out.println("Intruce el numero a sumar al  valor acumulado");
		double n1 = Double.parseDouble(sc.nextLine());
		
		double resultado4 = VALOR_ACUM + n1;
		
		System.out.println("El resultado es: " + resultado4);
		VALOR_ACUM += resultado4;
	}

	private static void sumaTresReales(Scanner sc) {
		System.out.println("Introduce el primer numero real");
		double realUno = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el segundo numero real");
		double realDos = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el tercer numero real");
		double realTres = Double.parseDouble(sc.nextLine());
		
		double resultado3 = realUno + realDos + realTres;
		System.out.println("El resultado de la suma de dos reales es " + resultado3);
		
		VALOR_ACUM += resultado3;
	}

	
	private static void sumaEnteros(Scanner sc) {
		System.out.println("Introduce el primer numero entero");
		int enteroUno = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero entero");
		int enteroDos = Integer.parseInt(sc.nextLine());
		
		int resultado2 = enteroUno + enteroDos;
		System.out.println("El resultado de la suma de dos enteros es " + resultado2);
		
		VALOR_ACUM += (double)resultado2;
	}

	
	private static void sumaReales(Scanner sc) {
		System.out.println("Introduce el primer numero real");
		double realUno = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el segundo numero real");
		double realDos = Double.parseDouble(sc.nextLine());
		
		double resultado = realUno + realDos;
		System.out.println("El resultado de la suma de dos reales es " + resultado);
		
		VALOR_ACUM += resultado;
	}

	private static int solicitarOpcionSuma(Scanner sc) {
		int opcion = -1;

		do {
			try {
				System.out.println("\nIntroduce la accion que desea realizar");
				System.out.println("1 - para sumar dos numeros reales\n" + "2 - para sumar dos numeros enteros\n"
						+ "3 - para sumar tres numeros reales\n" + "4 - para hacer una suma acumulativa\n"
						+ "5 - para finalizar");
				opcion = Integer.parseInt(sc.nextLine());

				if (opcion < 0 || opcion > 5) {
					System.out.println("El valor introducido no es valido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numerico");
			}

		} while (opcion < 0 || opcion > 5);

		return opcion;
	}

}
