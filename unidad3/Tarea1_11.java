package unidad3;

import java.util.Scanner;

public class Tarea1_11 {
	public static double potencia(double a, int b) {
		double calculo=1;
			for (int i=1; i<=b; i++) {
				calculo=calculo*a;
			}
		return a;
	}
	
	public static double potenciaRecursiva(double a, int b ) {
		if (b==1)
			return a;
		
		return a*potenciaRecursiva(a, (b-1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a realizar potencias");
		System.out.println("Introduce la base:");
		
		double base=sc.nextInt();
	}
}
