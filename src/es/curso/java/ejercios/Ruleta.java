package es.curso.java.ejercios;

import java.util.Scanner;

public class Ruleta {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		String usuario1 ="";
		String usuario2="";
		String usuario3="";
		
		System.err.println("**Bienvenidos a la ruleta de la Suerte**\n\n");
		String entreda= scan.next();

		int saldo1 =1000;
		int saldo2 =1000;
		int saldo3 =1000;
		int apuesta1=0;
		int docena =0;
		int color=0;
		
		
		System.out.println("Indicar la cantidad de Jugadores\n\n\trecuerde maximo 3");
		
		
		do{	int giro=(int)(Math.random()*36)+1;
			if (giro>=1 & giro<=12) {docena=1;}
			else if (giro<=24) {docena=2;}
			else if (giro<=36) {docena=3;}
			if(giro==1||giro==3||giro==5||giro==7||giro==9||giro==12||giro==14||giro==16||giro==18||giro==19||giro==21||giro==23||giro==25||giro==27||giro==30||giro==32||giro==34||giro==36) {
			color=1;}else {color=2;}
			int uss= scan.nextInt();
			int menu=0;
			do {
				
				switch (uss) {
					case 1: 
				System.out.println("Nombre de usuario:");
				usuario1=scan.nextLine();
				System.out.println("Haga su apuesa\n\n\t\tSeleccione entre las siguientes ociones\n1. Apostar a un numero\n2. Apostar Color\n3. Apostar docena\n4. Apostar Par o Inpar\n5. Dejar de jugar");
				menu=scan.nextInt();
				switch(menu) {
				case 1:
					System.out.print("Selecciones el numero");
					int numero1 = scan.nextInt();
					System.out.print("haga su apuesta,\n\t\tRecuerde su saldo es: "+saldo1);
					apuesta1=scan.nextInt()+apuesta1;
					if(giro==) {}
					saldo1=saldo1-apuesta1;break;
				
				case 2: 
					System.out.print("Selecciones el color\n\t\t1. Negro\t\t\2. Rojo");
					int color1 = scan.nextInt();
					System.out.print("haga su apuesta,\n\t\tRecuerde su saldo es: "+saldo1);
					apuesta1=scan.nextInt()+apuesta1;
					saldo1=saldo1-apuesta1;break;
				
				case 3: 
					System.out.print("Selecciones el en que rango quiere hacer su apuesta\n\t1. del 1 al 12\t\t 2. del 13 al 24\t\t3. del 25 al 36");
					String docena1 = scan.nextLine();
					System.out.print("haga su apuesta,\n\t\tRecuerde su saldo es: "+saldo1);
					apuesta1=scan.nextInt()+apuesta1;
					saldo1=saldo1-apuesta1;break;
				
				case 4:
					System.out.print("Selecciones el color\n\t\t1. Negro\t\t\2. Rojo");
					int par = scan.nextInt();
					System.out.print("haga su apuesta,\n\t\tRecuerde su saldo es: "+saldo1);
					apuesta1=scan.nextInt()+apuesta1;
					saldo1=saldo1-apuesta1;break;
				default: 	break;
				}
				
				
				
			
				
			
			
			
			
			
			
			
			
			
			
			scan= new Scanner(System.in);
			int dado=(int)(Math.random()*36)+1;
			System.out.println("Quiere hacer un apuesta??");
			String resp = scan.nextLine();
			if (!resp.equalsIgnoreCase("si")) {if(saldo>0) {
				respuesta="salida";
				System.out.println("Gracias por participar, Su saldo disponible es "+saldo+"\n\n\t\t\tPrecione ENTER para cobrar");	
			}else {System.out.println("Gracias por participar, Su saldo es "+saldo);
			respuesta="salida";}
			
			
			}
			System.out.println("Ingrese el monto de su apuesta?? \n\t\tSu saldo es "+saldo);
			int saldoap= scan.nextInt();
			saldo=saldo-saldoap;
			System.out.println("Probemos su suert, Indique el numer:\n\tRecuerde que debe ser entre 1 y 6!!!");
			int apuesta= scan.nextInt();
			if(apuesta==dado) {saldo=saldo+(saldoap*3);}
			System.out.println("Su saldo es: "+saldo);
					
			
		}while(respuesta.equalsIgnoreCase("salida"));
		String salida = scan.nextLine();
		System.out.println("Adios!!");
		scan.close();
	}

}
for (int rul = 1; rul <=12 ; rul++) {
			for (int columna =1; columna<=1 ;columna++ ) {
//				if (rul==1||rul==3||rul==6||rul==7||rul==8||rul==9) {
					System.err.println(" "+n1+" ");
//				else {System.out.println(" "+n1+" ");}
				}
//			for (int columna =1; columna<=3 ;columna++ ) {
//				System.out.print(" x ");}
//			for (int columna =1; columna<=3 ;columna++ ) {
//				System.out.print(" x ");}
			n1=n1+3;
			n2=n2+3;
			n3=n3+3;	
//			System.out.println("");
		}
		
	}

}
