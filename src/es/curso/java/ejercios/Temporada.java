package es.curso.java.ejercios;

public class Temporada 
{

	public static void main(String[] args) 
	{
		String mes = "JUNIO"; 
		String mesact = mes.toUpperCase();
		
		
		
		if (mesact == "ENERO" || mesact == "FEBRERO" || mesact == "MARZO" ) 
		{
			System.out.println("Invierno");
		}
		else if (mesact == "ABRIL" || mesact == "MAYO" || mesact == "JUNIO")
		{
			System.out.println("Primavera");
		}
		else if (mesact == "JULIO" || mesact == "AGOSTO" || mesact == "SEPTIEMBRE")
		{
			System.out.println("Verano");
		}
		else if (mesact == "OCTUBRE" || mesact == "NOVIEMBRE" || mesact == "DICIEMBRE")
		{
			System.out.println("Otoño");
		}
		else
		{
			System.out.println("Error en mes");
			
		}
	}
}


