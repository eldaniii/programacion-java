package unidad1;

import java.util.Scanner;

public class Vilar_Martínez_8_4 {
	public static void main(String[] args) {
		int n;
		int result=1;
		int rep=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		n=sc.nextInt();
		do { 
			System.out.println(result);
			result++;
			rep++;
		} while (!(rep==n+1));
	}
}
