package unidad1;

public class arrayBidimensional {
	public static void main(String[] args) {
		
		int[][] datos = new int[11][3];
		datos[0][0] = 1; //dorsal
		datos[0][1] = 18; //edad
		datos[0][2] = 2005; //año nacimiento
		datos[1][0] = 2;
		datos[1][1] = 17;
		datos[1][2] = 2006;
		datos[2][0] = 3;
		datos[2][1] = 19;
		datos[2][2] = 2004;
		
		for (int i=0; i<11; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("El dato "+i+","+j+" vale "+datos[i][j]);
			}
			System.out.println("tamaño:"+datos.length);
		}
	}
}
