package unidad3;

import java.util.Scanner;

public class Tarea2_5 {
	public static String eliminarVocales(String a) {
		// Expresión regular para buscar vocales (mayúsculas, minúsculas y acentuadas)
		String vocales="[AEIOUaeiouÁÉÍÓÚáéíóú]";
		
		// Reemplazar vocales por cadena vacía
		return a.replaceAll(vocales, "");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Pedir el nombre completo al usuario
		System.out.print("Introduzca su nombre completo: ");
		String nombreCompleto = sc.nextLine();
		
		// Eliminar vocales del nombre
		String nombreSinVocales = eliminarVocales(nombreCompleto);
		
		// Mostrar el resultado
		System.out.println("Nombre sin vocales: "+nombreSinVocales);
		System.out.println("Hecho por Daniel Vilar Martínez, copyright 2023.");
	}
	// También se puede resolver utilizando 'for' y cadenas de 'arrays'
}
