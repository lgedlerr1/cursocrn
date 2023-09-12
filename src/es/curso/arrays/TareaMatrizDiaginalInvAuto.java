package es.curso.arrays;

import java.util.Scanner;

public class TareaMatrizDiaginalInvAuto {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Indique en numero de lados de la matriz");

		int num=scan.nextInt();
		int[][]matriz= new int [num][num];
		int[][]aux=new int[num][num];

		for(int i =0; i<num;i++) {
			for(int j =0; j<num;j++) {
				matriz[i][j]=(int)(Math.random()*10);
			}
		}
		System.out.println("La Matriz es:");
		for(int i =0;i<num;i++) {
			System.out.println();
			for(int j=0;j<num;j++) {
				aux[i][j]=matriz[i][j];
				System.out.print(matriz[i][j]+" ");

			}
		}
		System.out.println("\n \nLa diagonal principal es:\n");

		for(int i =0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==i) {
					System.out.print(matriz[i][j]+" ");
				}
			}
		}
		System.out.println("\n\nLa matriz de diagonal principal invertida es:");
		for(int i =0;i<num;i++) {
			System.out.println();
			for(int j=0;j<num;j++) {
				if(j==i) {
					matriz[i][j]=aux[num-j-1][num-i-1];
					System.out.print(matriz[i][j]+" ");
				}else
					System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println("\n \nLa diagonal secundaria es:\n");

		for(int i =0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==(num-i-1)) {
					System.out.print(matriz[i][j]+" ");
				}
			}
		}
		System.out.println("\n\nLa matriz de diagonal segundaria invertida es:");
		for(int i =0;i<num;i++) {
			System.out.println();
			for(int j=0;j<num;j++) {
				if(j==(num-i-1)) {
					matriz[i][j]=aux[j][i];
					System.out.print(matriz[i][j]+" ");
				}else
					System.out.print(matriz[i][j]+" ");
			}
		}	
		scan.close();	
	}


}
