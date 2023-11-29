package unidad1;

import java.util.Scanner;

public class Vilar_Martínez_8_14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce longitud:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
