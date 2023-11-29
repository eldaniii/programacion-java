package unidad1;

import java.util.Scanner;

public class ProductoIVA {
	public static void main(String[] args) {
		int baseImponible;
		int IVA;
		int precioIVA;
		int total;
		String tipoIVA;
		String codPromocional;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base imponible:");
		baseImponible=sc.nextInt();
		do {
			System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
			tipoIVA=sc.next();
		} while (tipoIVA=="general");
		
		switch (tipoIVA ) {
		case "general": IVA=21;
		break;
		case "reducido": IVA=10;
		break;
		case "superreducido": IVA=4;
		break;
		}
		
		System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
		codPromocional=sc.next();
		
		switch (codPromocional) {
		case "nopro":
			
		}
		System.out.println(baseImponible);
	}
}
