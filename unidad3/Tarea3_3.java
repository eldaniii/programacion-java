package unidad3;

import java.util.Scanner;

public class Tarea3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=1;
		int averageEven;
		int countEven=0;
		int plusEven=0;
		int averageOdd;
		int countOdd=0;
		int plusOdd=0;
		int countZeros=0;
		int[] numbers;
		
		do {
			System.out.println("Introduzca un número 'n':"); //por defecto 1
			n=sc.nextInt();
		} while (n<=0);
		
		numbers = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Introduzca el número "+(i+1)+":");
			numbers[i]=sc.nextInt();
			if (numbers[i]>0) {
				countEven++;
				plusEven+=numbers[i];
				averageEven=plusEven/countEven;
			} else if (numbers[i]<0) {
				countOdd++;
				plusOdd+=numbers[i];
				averageOdd=plusOdd/countOdd;
			}
			else countZeros++;
		}
		
		System.out.println("Orden inverso:");
		for (int i=n-1; i>=0; i--) System.out.println("numeros["+i+"]:"+numbers[i]);
	}
}
