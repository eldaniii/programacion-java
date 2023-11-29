package unidad1;
import java.util.Scanner;

public class Suma2NumerosByte {
	public static void main(String[] args ) {
		byte num1;
		byte num2;
		int suma;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un 1er número de 2 cifras: ");
		num1=sc.nextByte();
		while(!(num1>9 && num1<100)) {
			System.out.println("Debe ser un número de 2 cifras: ");
			num1=sc.nextByte();
		} 
		System.out.println("Introduce un 2o número de 2 cifras: ");
		num2=sc.nextByte();
		while(!(num2>9 && num2<100)) {
			System.out.println("Debe ser un número de 2 cifras: ");
			num2=sc.nextByte();
		}
		suma = (int) num1+num2;
		System.out.println("El resultado de la suma es: "+suma);
	}
}

