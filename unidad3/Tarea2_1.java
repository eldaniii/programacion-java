package unidad3;

import java.util.Scanner;

public class Tarea2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera palabra:");
		String palabra1=sc.next();
		System.out.println("Introduce la segunda palabra:");
		String palabra2=sc.next();
		
		if (palabra1.length()>palabra2.length()) System.out.println("La palabra '"+palabra1+"' es más larga que la palabra '"+palabra2+"'");
		else if (palabra2.length()< palabra1.length()) System.out.println("La palabra '"+palabra2+"' es más larga que la palabra '"+palabra1+"'");
		else System.out.println("Son iguales");
	}
}
