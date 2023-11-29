package unidad3;

import java.util.Scanner;

public class Tarea3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduzca el número "+(i+1)+":");
			numeros[i]=sc.nextInt();
		}
		for (int i=0; i<5; i++) {
			System.out.println("numeros["+i+"]:"+numeros[i]);
		}
	}
}
