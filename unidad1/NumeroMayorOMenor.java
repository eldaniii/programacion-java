package unidad1;
import java.util.Scanner;

public class NumeroMayorOMenor {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número:");
		num2=sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		} else if (num2>num1) {
			System.out.println(num2+" es mayor que "+num1);
		} else {
			System.out.println(num1+" y "+num2+" son iguales.");
		}
	}
}
