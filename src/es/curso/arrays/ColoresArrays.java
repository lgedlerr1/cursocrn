package es.curso.arrays;

import java.util.Scanner;

public class ColoresArrays {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Indique la cantidad de colores");
		int cant =scan.nextInt();
		String[] color= new String[cant];
		String[] aColor=new String[cant];
		int aNum= 0;

		for(int nom=1;nom<=cant;nom++){
			System.out.println("Indique el color "+nom);
			scan= new Scanner(System.in); 
			color[nom-1]=scan.nextLine();
			String val =color[nom-1].toUpperCase();
			if(val.startsWith("A")&& val.contains("O")) {
				aColor[aNum]=color[nom-1];
				aNum++;
			}
		}
		System.out.println("\n");
		for(int nom=0;nom<cant;nom++){
			System.out.println(color[nom]);}
		if (aNum!=0) {
			System.out.println("\nY los colores que comienzan con A y contienen O son:\n");
			for(int imp=0;imp<aNum;imp++){
				System.out.println(aColor[imp]);}
		} 

		scan.close();}



}
