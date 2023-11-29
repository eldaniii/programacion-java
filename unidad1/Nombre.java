package unidad1;

import java.util.Scanner;

public class Nombre {
	public static void main(String[] args) {
		String nombreUsuario;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		
		nombreUsuario=teclado.nextLine();
		
		System.out.println("Te llamas: " +nombreUsuario);
	}
}
