package unidad1;
import java.util.Scanner;

public class SiNumParYEntre1Y10 {
	public static void main(String[] args) {
		int num;
		boolean esEntre1Y10=false;
		boolean esPar=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		if ((num%2)==0) {esPar=true;}
		if (num>=1 && num<=10) {esEntre1Y10=true;}
		if (esEntre1Y10 || esPar) {
			System.out.println("Es par o está entre 1 y 10.");
		} else {
			System.out.println("No es par y no está entre 1 y 10");
		}
	}
}
