package unidad1;

import java.util.Scanner;

public class Vilar_Martínez_8_10 {
	public static void main(String[] args) {
		int n=0;
		int m=1;
		int product;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número del 1 al 10:");
		n=sc.nextInt();

		while (n<1 || n>10) {
			System.out.println("Número no válido, introduce un número del 1 al 10:");
			n=sc.nextInt();
		}
		while (m>=1 && m<=10) {
			product=n*m;
			System.out.println(n+"*"+m+"="+product);
			m++;
		}
	}
}
