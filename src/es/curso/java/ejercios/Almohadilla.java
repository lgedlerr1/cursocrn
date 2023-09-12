package es.curso.java.ejercios;

public class Almohadilla {
	public static void main(String[]args) {
		
		for(int p=1;p<=5;p++) {
		if(p%2==0) {for (int x =1; x<= 7; x++) {
			System.out.print("x ");	
		}System.out.println("");}
		else {for(int sup =1; sup <= 2; sup++) {
			for (int y= 1 ; y<= 4 ; y++) {System.out.print(" ");}
			for(int k= 1;k<=6;k++) {
				if(k==1||k==6) {System.out.print("x");}
				else{System.out.print(" ");}}
			System.out.println("");
		}}
		}
		
		
	}


}
