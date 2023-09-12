package es.curso.java.strings;

public class MetodoString {
 
	public static void main(String[]args) {
		String nombre1= "     Ludwing Gedler    ";
		String nombre2= nombre1;
		
		nombre1=nombre1.toUpperCase();
		
		System.out.println(nombre1);
		System.out.println(nombre2);
		
		System.out.println(nombre1.charAt(0));
		
		System.out.println(nombre1.concat(nombre2));
		
		System.out.println(nombre1.contains("D"));
		
		System.out.println(nombre1.startsWith("L"));
		
		System.out.println(nombre1.endsWith("K"));
		
		System.out.println(nombre1.length());
		
		System.out.println(nombre1.isEmpty());
		
		System.out.println(nombre1.replace("G","H"));
		
		System.out.println(nombre1.lastIndexOf("G"));
		
		System.out.println(nombre1.indexOf("R"));
		
		System.out.println(nombre1.substring(8,11));
		
		System.out.println(nombre1.trim());
		
		System.out.println(nombre1.concat(nombre2));
//		System.out.println(nombre1);
		
		
	}
}
