package es.curso.java.strings;

import java.util.Scanner;

public class ValidarEmail {

	public static void main(String[]args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Introduce correo electronico");

		String correo= scan.nextLine();
		String dato= correo.trim();
		int tamano =dato.length();
		int posPunto = dato.lastIndexOf(".");
	
		if(dato.contains(" ")) {
			
		}
		if(dato.isEmpty()) {
			
		}
		if(dato.contains("@")) {
			int a1=dato.lastIndexOf("@");
			int a2=dato.indexOf("@");
			String a3=dato.substring(a1);
			int a4=a3.lastIndexOf(".")
			if(a1==a2 || a1>1 ) {}
		}
		




	}

}
