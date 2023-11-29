package unidad1;
import java.util.Scanner;

public class DivisionNumerosReales {
	public static void main(String[] args) {
		double num1;
		double num2;
		double division;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		num1=sc.nextDouble();
		System.out.println("Introduce el segundo número:");
		num2=sc.nextDouble();
		division=num1/num2;
		System.out.println("El resultado de la división es: "+division);
		
	}

}
