package es.curso.java.ejercios;
import java.util.Scanner;

public class CuadradoAMedida {
	public static void main(String[]args) {
		System.out.println("Indicar los lados del cuadrado:");
		Scanner scan= new Scanner(System.in);
		int lado= scan.nextInt();
		
		for (int x =1; x<= lado; x++) {
			System.out.print("x");	
		}
		System.out.println("");
		
		for(int media =1; media <= lado-2; media++) {
			for (int y= 1 ; y<= lado ; y++) {
				if (y==1 || y==lado) {System.out.print("x");}
				else{System.out.print(" ");}
				
			}System.out.println("");
		
		}
		
		for (int x =1; x<= lado; x++) {
			System.out.print("x");	
		}
		scan.close();
	}

}
