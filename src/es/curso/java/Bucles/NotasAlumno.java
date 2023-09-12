package es.curso.java.Bucles;

import java.util.Scanner;

public class NotasAlumno {

	
	public static void main(String[]args) {
		
		System.out.println("Indicar la cantidad de alumnos" );
		Scanner scan= new Scanner(System.in);
		int cant = scan.nextInt();
		
		double nota = 0;
		
		for(int num= 1 ; num<=cant ; num++ ) {
			
			System.out.println("Notas dl alumno: "+num);
			scan= new Scanner(System.in);
		
			nota = nota + scan.nextDouble();
			System.out.println("alumno"+ num +" "+nota+"\n\n");	
			if (num==cant) {System.err.println("Notas promedio: " + nota/num);
			
			}
		}
		
		
		scan.close();		
	}
	
	

}
