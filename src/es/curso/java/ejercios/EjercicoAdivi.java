package es.curso.java.ejercios;

import java.util.Scanner;

public class EjercicoAdivi 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\tEstas listo para el reto??\n\n\t\t\tPulsa Enter.");
		String entrada = scan.nextLine();
		System.out.println("\tEn el funral del un soldado lloran tres mujeres\n\t\t\t¿Cual es La-biuda?");
		String res = scan.nextLine();
		
		if (res.equalsIgnoreCase("La de los labios grandes")) {System.out.println("EXCELENTE¡¡ no era tan facil.");}
		
		else if(entrada=="") 
		{
			System.out.println("Quieres saber la respuesta??");
		String resdos = scan.nextLine();;
		
		if(resdos.equalsIgnoreCase("SI")) {System.out.println("\tLa de los labios Grandes..");}
		else {System.out.println("\tMuchas Gracias...\nAdios.");}
		}
		scan.close();
	}
	 
	

}