package es.curso.arrays;

import java.util.Scanner;

public class TareaArraysEscuela {

	public static void main(String[]arg) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese la cantidad de aulas para el 2º de la eso");
		int nAulas=scan.nextInt();
		String[][]escuela=new String[nAulas][];
		for(int i=0;i<nAulas;i++) {
			scan = new Scanner (System.in);
			System.out.println("Ingrese la cantidad de alumnos que caben en el aula "+(i+1));
			int ca =scan.nextInt();
			escuela[i]= new String [ca];}
		int menu=0;

		do {scan = new Scanner (System.in);
		System.out.println("Menu de opciones.\n\t1. Incertar Alumno 1\n\t2. Mostrar alumnos por aulas \n\t3. Mostrar todos los alumnos aprobados \n\t4. buscar alumno\n\t6. Salir del sitema");
		menu=scan.nextInt();

		if(menu==1) {int [] ff=new int[nAulas];
		
		do {scan = new Scanner (System.in);
		for(int i=0;i<nAulas;i++) {for (int j=0;j<escuela[i].length;j++) {
			if (escuela[i][j]==null) {
				ff[i]+=1;}}}
		System.out.println("Quedan los Siguientes Cupos disponible\n");
		{for(int i=0;i<nAulas;i++) {
			if (ff[i]==0) {System.err.println( "En el aula "+(i+1)+ " No quedan cupos disponibles.");}
			else {System.out.println("en el Aula "+(i+1)+" Quedan "+ff[i]+" cupos disponibes.");}}
		System.out.println("\nSelecciones el aula de su preferencia");
		menu = scan.nextInt();
		if(menu>(nAulas+1) || menu==0) {System.out.println("Aula no existe");}
		else if(ff[menu]==0) {System.out.println("Aula no tiene cupo disponible");}
		else{System.out.println("Introduce el Nombre: ");
		String nombre=scan.nextLine();
		
		}
			
		
		}
		menu=menu+scan.nextInt();

		}while (menu<(nAulas+1)||menu>(nAulas+1))

		else if (menu==2) {
			System.out.println("El sistema 1");
		}
		else if (menu==3) {
			System.out.println("El sistema 2");
		}
		else if (menu==4) {
			System.out.println("El sistema 3");
		}
		else if (menu==5) {
			System.out.println("El sistema 4");
		}
		if (menu>6) {System.err.println("Debe elegir entre las opciones disponibles");
		System.out.println("hasta luego lucas");
		}
		}

		while(menu < 6 || menu > 6);












		System.out.println("El sistema se ha cerrado");
		//		for(int i=0;i<nAulas;i++) {
		//			System.out.println("\n");
		//			for (int j=0;j<cantAl[i];j++) {
		//				System.out.println(escuela[i][j]);
		//			}
		//		}



		scan.close();
	}

}
