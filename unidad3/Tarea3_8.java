package unidad3;

public class Tarea3_8 {
	public static void main(String[] args) {
		int t[][] = new int[5][5]; // definimos t como una tabla bidimensional t = new int [5][5]; // creamos la tabla de 5x5
		for (int i=0;i<5;i++) // utilizamos i para la primera dimensión {
		for (int j=0;j<5;j++) // utilizamos j para la segunda dimensión {
				
		t[i][j]=i+j;

		System.out.println("TABLA: ");

		for (int i=4 ; i>=0 ; i--) {
			System.out.println();
			for (int j=0;j<5;j++)
				System.out.print(t[i][j]+" "); 
		}
	}
}
