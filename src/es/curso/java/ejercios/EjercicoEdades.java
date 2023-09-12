package es.curso.java.ejercios;

import java.util.Scanner;

public class EjercicoEdades 
{
	public static void main(String[]args)
	{
		System.out.println("Escriba aqui su Nombre: ");
		Scanner scan = new Scanner(System.in);
		
		String nombre = scan.nextLine();
		System.out.print("escriba aqui se Edad: ");
		int edad = scan.nextInt();
		String res = "";
		scan.close();
		
		if (edad <= 5) {res = "Bebe";}
		else if (edad <= 15) {res = "Niño";}
		else if (edad <= 25) {res ="Adolescente";}
		else if (edad<=40) {res = "Adulto"; }
		else if (edad<= 65) {res ="Adulto Mayor";}
		else if (edad<= 95) {res ="Anciano";}
		else {System.out.println("Esta usted vivo");}
		
		
		
		System.out.println(nombre+" Usted es un "+ res);
		
		
		
		
	}

}
