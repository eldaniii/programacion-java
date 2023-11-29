package unidad1;

public class ArrayEjemplo2 {
	public static void main(String[] args) {
		final int tam=50;
		int[] pares= new int[tam];
		int[] impares= new int[tam];
		int j=0;
		int k=0;
		
		for(int i=1; i<100; i++) {
			if (i%2==0) {
				pares[j]=i;
				j++;
			} else {
				impares[k]=i;
				k++;
			}
		}
		for(int i=0; i<tam; i++) {
			 System.out.println("pares["+i+"]:"+pares[i]);
		}
		System.out.println("--------------------------");
		for(int i=0; i<tam; i++) {
			 System.out.println("impares["+i+"]:"+impares[i]);
		}
	}
}
