package es.curso.java.strings;

import java.util.Scanner;

public class NotasArrays {

	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Indique la cantidad de alumnos");
		int cant =scan.nextInt();
		String[] nombre= new String[cant];
		String[] def= new String[cant];
		int [] notas= new int[cant];
		int [] minimas= new int[cant];
		int [] maximas= new int[cant];
		int [] prov= new int[cant];

		int notmax=0;
		int notmin=10;
		int notmed=0;
		//		int pnotmax=0;
		//		int pnotmin=0;
		int min=0;
		int max=0;


		for(int nom=1;nom<=cant;nom++){
			scan= new Scanner(System.in);
			System.out.println("Indique el nombre del alumno "+nom);
			nombre[nom-1]=scan.nextLine();
			System.out.println("Indique la nota del alummno "+nom);
			notas[nom-1]=scan.nextInt();		
			notmed=notmed+notas[nom-1];
			if(notas[nom-1]>notmax) {notmax=notas[nom-1];
			}
			if(notas[nom-1]<notmin) {notmin=notas[nom-1];
			}
		}

		for(int nom=1;nom<=cant;nom++) {
			if(notas[nom-1]==notmax) {maximas[max]=nom-1; max+=1;}
			if(notas[nom-1]==notmin) {minimas[min]=nom-1; min+=1;}

		}
		int pro=0;
		String defS= "";
		for(int nom=0;nom<cant;nom++){
			prov[nom]=notas[nom];
			def[nom]=nombre[nom];}
		for(int nom=0;nom<cant;nom++) {
			for(int var=0;var<cant;var++){
				if(var>=nom && prov[nom]<prov[var] && prov[nom]!=100) {
					pro=prov[nom]; prov[nom]=prov[var]; prov[var]=pro; pro=0;
					defS=def[nom]; def[nom]=def[var]; def[var]=defS; defS="";
				}
			}
		}

		notmed=notmed/cant;
		scan.close();


		for(int imp=0;imp<cant;imp++){
			System.out.println(" "+def[imp]+" con nota "+prov[imp]);}
		System.out.println("la nota media es "+notmed);
		System.out.println("la nota maxima es de ");
		for(int imp=0;imp<max;imp++) {System.out.println(nombre[maximas[imp]]+" "+notmax);}
		System.out.println("la nota minima es de ");
		for(int imp=0;imp<min;imp++) {System.out.println(nombre[minimas[imp]]+" "+notmin);}

	}

}


