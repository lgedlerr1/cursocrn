package es.curso.java.Bucles;



import java.util.Scanner;

public class VelocidaCoches {
	
	public static void main(String[]args) {
		
		System.out.println("Indicar la cantidad de Coches" );
		Scanner scan= new Scanner(System.in);
		int cant = scan.nextInt();
		
		double minima = 5000;
		for(int num= 1; num<=cant ; num++ ) {
			
			System.out.println("Velocidad del coche "+num);
			scan= new Scanner(System.in);
			double speed = scan.nextDouble();
			//System.out.println("alumno"+ num +" "+nota+"       "+sumNota+"\n\n");	
			if (speed<minima) {minima=speed;}
			
			if (num==cant) {System.out.println("El coche con menor velocidad va a " + minima);
			
			}
		}
		
		
		scan.close();		
	}
	
	

}

