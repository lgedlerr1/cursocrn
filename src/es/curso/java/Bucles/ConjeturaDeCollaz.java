package es.curso.java.Bucles;

import java.util.Scanner;

public class ConjeturaDeCollaz {
	public static void main(String[]args) {
		System.out.println("Indicar la cantidad." );
		Scanner scan = new Scanner(System.in);
		int resp = scan.nextInt();
		scan.close();
		int num = resp;
		for (  ;num > 1; ) {
			if (num %2==0) {
				num=(num/2);}
			else {num=(num*3)+1;}
			System.out.println(num);
			
			}
			}
		}


