package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_1 {
	public static void main(String[] args) {
		int num;
		int numSquare;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while (!(num==0)) {
			/*if ((num%2)==0) System.out.println("El número "+num+" es par.");
			else System.out.println("El número "+num+" es impar.");
			if (num>0)  System.out.println("El número "+num+" es positivo.");
			else System.out.println("El número "+num+" es negativo");
			*/
			String evenText = (num%2==0) ? "El número "+num+" es par.":"El número "+num+" es impar.";
			System.out.println(evenText);
			String positiveText = (num>0) ? "El número "+num+" es positivo":"El número"+num+" es negativo.";
			System.out.println(positiveText);
			numSquare=(num*num);
			System.out.println("El cuadrado del número "+num+" es: "+numSquare);
			System.out.println("Introduce un número:");
			num=sc.nextInt();
		}
	}
}
