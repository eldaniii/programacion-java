package unidad1;

import java.util.Scanner;

public class TuSeguro {
	public static void main(String[] args) {
		int precioBase;
		int precioFinal;
		int edad;
		int recargo;
		String marcaCoche;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio base del coche:");
		precioBase=sc.nextInt();
		System.out.println("Introduce tu edad:");
		edad=sc.nextInt();
		System.out.println("Introduce la marca del coche en mayúsculas:");
		marcaCoche=sc.next();
		
		switch (marcaCoche) {
		case "JAGUAR","ASTON","PORSCHE","TESLA": recargo=50;
		break;
		case "BMW","MERCEDES","AUDI","VOLKSWAGEN": recargo=25;
		default: recargo=0;
		}
		
		if (edad<25) recargo+=30;
		else if (edad>60) recargo+=20;
		
		precioFinal=precioBase+((precioBase*recargo)/100);
		System.out.println("El precio del seguro para los datos introducidos es de: "+precioFinal);
	}
}
