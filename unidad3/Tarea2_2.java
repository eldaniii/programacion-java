package unidad3;

import java.util.Scanner;

public class Tarea2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroPalabras = 0;
		String palabra;
		String frase = "";
		//String frase = new StringBuilder();
		
		System.out.println("Cuando haya terminado de ingresar las palabras de la frase introduzca 'fin' (fin no se mostrará en pantalla).");
		System.out.println("Introduzca la palabra "+numeroPalabras+":");
		palabra=sc.next();
		while (!(palabra.equalsIgnoreCase("fin"))) {
			/*frase.append(palabra);
			frase.append(" ");*/
			frase+=palabra;
			frase+=" ";
			numeroPalabras++;
			System.out.println("Introduzca la palabra "+numeroPalabras+":");
			palabra=sc.next();
		} 
		System.out.println("Frase: "+frase);
	}
}
