package es.curso.java.ejercios;

public class TableroRuleta {
	public static void main(String[]args) {
		int n1=1;
		int n2=2;
		int n3=3;
		int rul=1;
		int columna =1;
		
		for (rul = 1; rul <=12 ; rul++) {
			for (columna =1; columna<=1 ;columna++ ) {
				if (rul==1||rul==3||rul==6||rul==7||rul==9||rul==12) {
					System.err.print(" "+n1+" ");}
				else {System.out.print(" "+n1+" ");}
			}
			for (columna =1; columna<=1 ;columna++ ) {
				if (rul==2||rul==5||rul==8||rul==11) {
					System.err.println(" "+n2+" ");}
				else {System.out.println(" "+n2+" ");}
			}
			for (int x =1; x<= lado; x++) {
				System.out.print("x");	
			}
			System.out.println("");
			
			for(int media =1; media <= lado-2; media++) {
				for (int y= 1 ; y<= lado ; y++) {
					if (y==1 || y==lado) {System.out.print("x");}
					else{System.out.print(" ");}
					
				}System.out.println("");
			
			}
			
			for (int x =1; x<= lado; x++) {
				System.out.print("x");	
			}
//							for (int columna =1; columna<=1 ;columna++ ) {
//								System.out.print(" x ");}
			n1=n1+3;
			n2=n2+3;
			n3=n3+3;	
//			System.out.println("");
		}

	}

}


