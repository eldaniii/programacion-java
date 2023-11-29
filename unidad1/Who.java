package unidad1;

import java.util.Scanner;

public class Who {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int numMayor;
		int numMenor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número:");
		num2=sc.nextInt();
		System.out.println("Introduce el tercer número:");
		num3=sc.nextInt();
		
		if (num1>num2 && num1>num3) { numMayor=num1; } 
		else if (num2>num1 && num2>num3) { numMayor=num2; } 
		else { numMayor=num3; }
		
		if (num1<num2 && num1<num3) { numMenor=num1; }
		else if (num2<num1 && num2<num3) { numMenor=num2; }
		else { numMenor=num3; }
		
		System.out.println("El número mayor es: "+numMayor);
		System.out.println("El número menor es: "+numMenor);
	}
}
