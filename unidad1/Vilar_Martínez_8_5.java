package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_5 {
	public static void main(String[] args) {
		int minRange;
		int maxRange;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor mínimo del rango:");
		minRange=sc.nextInt();
		System.out.println("Introduce el valor máximo del rango:");
		maxRange=sc.nextInt();
		System.out.println("Introduce un número dentro del rango");
		n=sc.nextInt();
		while (n<=minRange || n>=maxRange) {
			System.out.println("Valor incorrecto, introduzca un número dentro del rango.");
			n=sc.nextInt();
		}
		System.out.println("Valor correcto.");
	}
}