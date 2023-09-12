package es.curso.java.introduccion;

public class EjercicoUno 
{
	public static void main(String[] args) 
	{
		String name = "Cliente 1";
		
		int año = 1989;
		int edad = (2023 - año);
		boolean esPar = (año%2==0);
		System.out.println("Cliente:\n\t" + name);
		System.out.println("Edad: " + edad);
		System.out.println("Año de nacimiento: "+ año);
		
		if (esPar) 
		{
			System.out.println("Es año par");
		}
		else 
		{
		System.out.println("No es año par");
		}
	}
}

