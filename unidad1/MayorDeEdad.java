package unidad1;
import java.util.Scanner;

public class MayorDeEdad {
	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué edad tienes:");
		edad=sc.nextInt();
		
		if (edad>=18) {
			System.out.println("Entra");
		} else { 
			System.out.println("No entras");
		}
	}
}
