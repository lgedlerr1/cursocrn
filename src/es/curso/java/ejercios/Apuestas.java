package es.curso.java.ejercios;

import java.util.Scanner;

public class Apuestas {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.err.println("**Buena Suerte**");

		int saldo =1000;
		String respuesta = "";
		
		
		do{ scan= new Scanner(System.in);
			int dado=(int)(Math.random()*6)+1;
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


