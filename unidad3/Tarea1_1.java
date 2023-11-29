package unidad3;

import java.util.Scanner;

public class Tarea1_1 {
	public static void eco(int n) {
		for (int i = 0 ; i < n ; i++) {
			System.out.println("ECO");
		}
	}
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce el número de veces que se repitirá el eco");
		n=sc.nextInt();
		eco(n);
	}
}
