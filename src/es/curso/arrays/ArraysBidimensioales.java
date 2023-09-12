package es.curso.arrays;

public class ArraysBidimensioales {

	public static void main(String[]args) {

		int numi=(int)(Math.random()*10)+1;
		String[][]animales= new String [numi][];
		int pos=0;
		int[] numj= new int[numi];
		for(int i =0; i<numi;i++) {
			pos=(int)(Math.random()*15)+1;
			numj [i]= pos;
			animales[i]= new String [pos];
		}
		for(int i=0;i<numi;i++) { 
			for(int j=0;j<numj[i];j++) {
				int num=(int)(Math.random()*30)+1;
				String con=Integer.toString(num);
				animales[i][j]=con;			
			}
		}
		System.out.println("\n\n");
		for(int i=0;i<numi;i++) {
			System.out.println();
			for(int j=0;j<numj[i];j++) {
				System.out.print(animales[i][j]+"\t");
			}
		}
	}  

}
