package es.curso.java.introduccion.condicionales;

import java.util.Scanner;

public class CondicionesSwitch 
{
	public static void main(String[]args) 
	{
		Scanner acan= new Scanner(System.in);
		System.out.println("Indique el mes: ");
		String res= acan.nextLine();
		String color= "";
		color=res.toLowerCase();
		
		switch (color)
		{
		case "enero" :
		case "febrero" :
		case "marzo" : System.out.println("La estacion es Invierno");break;
		case "abril": 
		case "mayo":
		case "Junio" : System.out.println("La estacion es primavera");break;
		case "julio":
		case "agosto" : System.out.println("La estacion es Verano ");break;
		case "septiembre" : System.out.println("Temporada de Vaciones de Verano");break;
		case "octubre":
		case "noviembre" : System.out.println("La estacion es Otoño ");break;
		case "diciembre" : System.out.println("Otoño y epoca de navida");break;
		default : System.out.println("error de mes");
		
		
		
		}
		
		
		
	}
	
	
	

}
