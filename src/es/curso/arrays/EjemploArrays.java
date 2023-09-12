package es.curso.arrays;

public class EjemploArrays {

	public static void main(String[]args) {

//		String nombre= "raul";
		String [] nombres = {"n1" ,"n2", "n3", "n4"};
//		System.out.println(nombres.length);
		
		nombres[3]="lud";
		for(int nom=0;nom<nombres.length;nom++){
		System.out.println(nombres[nom]);}

	}

}
