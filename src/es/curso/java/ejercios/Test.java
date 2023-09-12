package es.curso.java.ejercios;

public class Test {
	public static void main(String[]args) {
		int stop =0;
		int sumador= 0;
		
		
		do{ int dado=(int)(Math.random()*6)+1;
		System.out.println(dado+" ");
			if (dado==6) {
			stop+=1; 	
		}else {stop=0;}
		sumador+=1;
			
		} while (stop<3);
		System.err.print("Lacantidad de ciclos fue de "+sumador+" ");
		
		
	}

}
