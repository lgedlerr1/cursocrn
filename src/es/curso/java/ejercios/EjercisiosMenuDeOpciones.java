package es.curso.java.ejercios;

import java.util.Scanner;

public class EjercisiosMenuDeOpciones {
	public static void main(String[] args) {
		 System.out.println(
				"Seleccione entre las siguientes opciones.\n\t1. opcion 1\n\t2. opcion 2\n\t3. opcion 3\n\t4. opcion 4\n\t5. Salir");
		Scanner scan = new Scanner(System.in);

		int res = scan.nextInt();

		switch (res) { 
		case 1: 
			System.out.println("Indicar estacion del año");
			scan = new Scanner(System.in);
			String estacion = scan.nextLine();
			String resEst = estacion.toLowerCase();
			
			switch (resEst) 
			{
			case "invierno":
				System.out.print("Enero; Febrero y Marzo");
				break;
			case "primavera":
				System.out.print("Abril, Mayo yJunio");
				break;
			case "verano":
				System.out.print("Julio, Agosto y Septiembre");
				break;
			case "otoño":
				System.out.print("Octubre, Noviembre y Diciembre");
				break;
			default:
				System.err.println("Error al indicar estacion.");
			}
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Respuesta opcion " + res);
			break;
		case 5:
			System.out.println("Adios");
			break;
		default:
			System.err.println("Error de selccion. opcion no disponible");
			scan.close();	
		}
			
	}
}
