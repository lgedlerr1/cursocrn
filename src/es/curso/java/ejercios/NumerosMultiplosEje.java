package es.curso.java.ejercios;

import java.util.Scanner;

public class NumerosMultiplosEje {
		public static void main(String[]args) {
			Scanner scan= new Scanner(System.in);
			int cont3=0;
			int cont5=0;

			
			for (int num=1;num<=10;num++) {
				System.out.println("Introduce mumero "+num);
				int ent= scan.nextInt();
				
				if(ent%3==0) {cont3++;}
				if(ent%5==0) {cont5++;}}
			System.out.println("res"+ cont3+" "+cont5);
				
			scan.close();

			
			
			
			
			
			
			
		}		
}
			
			
			
