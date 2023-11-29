package unidad1;

import java.util.Scanner;

public class UltimaCaja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		
		System.out.println("Introduce un número entero:");
		numero1=sc.nextInt();
		
		String numeroTexto1=String.valueOf(numero1);
		int longTexto=numeroTexto1.length();
		
		System.out.println();
		for(int i=longTexto-1 ; i>=0; i--) {
			System.out.print(numeroTexto1.charAt(i));
			}
		}
}
