package es.curso.java.ejercios;

import java.util.Scanner;

public class EjercicioIf 
{
	public static void main(String []args) {
		System.out.print("Introduce un mes: ");
	
	Scanner scan = new Scanner(System.in);
	String mes= scan.nextLine();
	scan.close();
	
	
	String estacion = "";
	
	//System.out.println("prueba "+mes);
	
	if (mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("febrero") || mes.equalsIgnoreCase("marzo")) 
	{
		estacion = "Invierno";
	}			
	else if (mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("junio")) 
	{			
		estacion = "Primavera";
	}
	else if (mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("septiembre")) 
	{			
		estacion = "verano";	
	}
	else if (mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("enero")) 
	{			
		estacion = "Invierno";
	}	
		if (estacion == "") {System.out.println("Error de mes");}
		else {System.out.println("Esta en "+estacion);}
	

}}
