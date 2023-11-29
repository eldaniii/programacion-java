package unidad3;

import java.util.Scanner;

public class Tarea1_2 {
	public static void enteros(int resp1, int resp2) {
		for(int i = resp1 ; i<=resp2 ; i++) {
			System.out.println(i);
		}
	}
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int resp1 = sc.nextInt();
		
		System.out.println("Introduce otro número");
		int resp2 = sc.nextInt();
		
		System.out.println("Estos son los números comprendidos entre "+resp1+" y "+resp2);
		enteros(resp1,resp2);
	}
}
