package unidad3;

import java.util.Scanner;

public class Tarea2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intento;
		boolean acierto = false;
		int pistas = 0;
		
		System.out.println("Jugador 1 - Introduzca la contraseña secreta:");
		String secreta = sc.next();
		
		System.out.println("Jugador 2 - Introduzca su intento para adivinar la contraseña:");
		intento = sc.next();
		
		if (intento.equalsIgnoreCase(secreta)) {
			System.out.println("Acertaste!");
			acierto = true;
		} else {
			pistas++;
			
			if (pistas == 1) {
				System.out.println("Fallaste:");
				System.out.println("La contraseña secreta tiene "+secreta.length());
				// Sin terminar
			}
		}
	}
}
