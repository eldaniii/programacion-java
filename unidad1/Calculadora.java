package unidad1;
import java.util.Scanner;

public class Calculadora {
	public static double suma(int a, int b) {
		double suma=a+b;
		return suma;
	}
	public static double resta(int a, int b) {
		double resta=a-b;
		return resta;
	}
	public static double multiplicacion(int a, int b) {
		double multiplicacion=a*b;
		return multiplicacion;
	}
	public static double division(int a, int b) {
		double division=a/b;
		return division;
	}
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int op;
		String continuar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ACLARACIÓN: Permite números decimales.");
		System.out.println("Introduce el primer número:");
		numero1=sc.nextInt();
		System.out.println("Introduce el segundo número:");
		numero2=sc.nextInt();
		
		System.out.println("Introduzca el tipo de operación:");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicación");
		System.out.println("4: División");
		op=sc.nextInt();
		while (op<1 || op>4) {
		System.out.println("Error en el tipo de operación. Ingrese un número válido.");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicación");
		System.out.println("4: División");
		op=sc.nextInt();
		} 
	
		switch (op) {
		case 1: System.out.println(suma(numero1,numero2));
				break;
		case 2: System.out.println(resta(numero1,numero2));
				break;
		case 3: System.out.println(multiplicacion(numero1,numero2));
				break;
		case 4: if (!(numero2==0)) System.out.println(division(numero1,numero2));
				else System.out.println("No se puede dividir un número entre 0.");
				break;
		default: System.out.println("Tipo de operación no válido.");
		}
	}
}
