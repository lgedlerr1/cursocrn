package es.curso.java.introduccion.condicionales;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[]args) {
		
		System.out.println("Necesistas la tabla del: " );
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			for(int mult = 0; mult <=10 ;mult++) {
			System.out.print(num+" * "+mult+" = "+num*mult+"\n");	
			}
			scan.close();
			}
				
}
