package unidad1;

import java.util.Scanner;

public class ArrayEjemplo3 {
	public static void escribirArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array+"["+i+"]:"+array[i]);
		}
	}
	
	public static int mayorArray(int[] array) {
		int nMayor=0;
		for(int i=0; i<array.length; i++) {
			if (array[i]>nMayor) nMayor=array[i];
		}
		return nMayor;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int tam=50;
		int[] pares= new int[tam];
		int[] impares= new int[tam];
		int j=0;
		int k=0;

		for(int i=1; i<=100; i++) {
			if (i%2==0) {
				pares[j]=i;
				j++;
			} else {
				impares[k]=i;
				k++;
			}
		}
		
		escribirArray(pares);
		escribirArray(impares);
		System.out.println(mayorArray(pares));
		System.out.println(mayorArray(impares));
		
		/*do {
			System.out.println("¿Cómo prefiere visualizar los arrays? (ascendente/descendente):");
			visual=(sc.next()).toLowerCase();
			
			switch (visual) {
			case "ascendente": 
				for(int i=0; i<tam; i++) {
					System.out.println("pares["+i+"]:"+pares[i]);
				}
				System.out.println("--------------------------");
				for(int i=0; i<tam; i++) {
					System.out.println("impares["+i+"]:"+impares[i]);
				}
				break;
			case "descendente":
				for(int i=tam-1; i>=0; i--) {
					System.out.println("pares["+(i)+"]:"+pares[i]);
				}
				System.out.println("--------------------------");
				for(int i=tam-1; i>=0; i--) {
					System.out.println("impares["+(i)+"]:"+impares[i]);
				}
				break;
			default: opcionIncorrecta=true;
				break;
			}
		} while (opcionIncorrecta);*/
	}
}
