package unidad3;

public class Tarea3_6 {
	public static int[] sinRepetidos(int a[]) {
 		int b[] = new int[a.length];
		int k=0;
		int repetidos;
		
		for (int i=0; i<a.length; i++) {
			repetidos=0;
			for (int j=0; j<a.length; j++) 	
				if (a[i]==b[j]) repetidos++;
			if (repetidos<1) {
				b[k]=a[i];
				k++;
			}
		}
		
		int[] c=new int[k];
		for  (int i=0; i<c.length; i++) 
			c[i]=b[i];
		return c;
	}
	public static void main(String[] args) {
		final int tam=50;
		int[] num = new int[tam];
		
		num[0]=2;
		num[1]=2;
		num[2]=3;
		num[3]=6;
		num[4]=6;
		num[5]=1;
		num[6]=5;
		num[7]=2;
		
		// Escribimos el array en base al nuevo length que devuelve nuestra función 'sinRepetidos', el tamaño será menor ya que estamos eliminando registros repetidos.
		for (int i=0; i<sinRepetidos(num).length; i++) 
			System.out.println(sinRepetidos(num)[i]);
	}
}
