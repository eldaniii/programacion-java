package unidad1;

import java.util.Scanner;

public class BucleForL {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura:");
		int n = sc.nextInt();
		for (int j = 1; j <= n-1; j++) {
			System.out.println("*");
		}
		for (int i = 1; i <= (n/2)+1 ; i++) {
				System.out.print("*");
		}
	}
}
