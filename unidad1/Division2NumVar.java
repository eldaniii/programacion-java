package unidad1;
import java.util.Scanner;

public class Division2NumVar {
	public static void main(String[] args ) {
		float num1;
		float num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número 1: ");
		num1=sc.nextFloat();
		System.out.println("Introduce el número 2: ");
		num2=sc.nextFloat();
		float division=num1/num2;
		System.out.println("El resultado de la división es: "+division);
	}
}
