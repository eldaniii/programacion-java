package unidad3;

import java.util.Scanner;

public class ejercicioAhorcado {
	// ---SOLUCIÓN 1---
	
	// Genera la palabra a adivinar de manera aleatoria
	public static String damePalabraSecreta() {
		String[] palabras={"estudiar","practicar","persistir","aprobar"};
		int elegida = (int) (Math.random()*palabras.length);
		return palabras[elegida];
	}
	
	public static void ocultaPalabra(StringBuilder palabra) {
		for (int i=0; i<palabra.length(); i++) {
			palabra.setCharAt(i,'_');
		}
	}
	
	// Si la letra está en la palabra, la desvela
	public static boolean desvelaLetra(String palabra, StringBuilder palabraOculta, char letra) {
		boolean encontrada=false;
		
		for (int i=0; i<palabra.length(); i++) {
			if (palabra.charAt(i)==letra) {
				palabraOculta.setCharAt(i, letra);
				encontrada=true;
			}
		}
		return(encontrada);
	}
	
	// Comprueba si he acertado 
	public static boolean heAcertado(String palabra, StringBuilder palabraOculta) {
			boolean acertado=true;
			
			for (int i=0; i<palabra.length(); i++) {
				if (palabra.charAt(i)!=palabraOculta.charAt(i))
					acertado=false;
			}
			return(acertado);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabraSecreta="";
		int intentos=5;
		char letra;
		boolean acertado=false;
		
		palabraSecreta=damePalabraSecreta();
		
		System.out.println(palabraSecreta); // Escribo la palabra secreta para poder comprobar que funciona
		
		StringBuilder palabraOculta = new StringBuilder(palabraSecreta.substring(0, palabraSecreta.length()));
		
		ocultaPalabra(palabraOculta); // Relleno con guiones la palabra secreta
		
		System.out.println(palabraOculta);
		
		/*System.out.println("Dime número de intentos:");
		intentos=sc.nextInt();*/
		while (intentos>0 && !acertado) {
			System.out.println("Dime letra:");
			letra=sc.nextLine().charAt(0);
			
			// Su la letra está en la palabra, la muestra
			if (!desvelaLetra(palabraSecreta, palabraOculta, letra)) {
				intentos--;
				System.out.println("fallo...intentos restantes:"+intentos+"\n");
			}
			
			// Comprueba si he acertado la palabra completa
			if (heAcertado(palabraSecreta, palabraOculta)) {
				System.out.println("Enhorabuena!!");
				acertado=true;
			}
			
			System.out.println(palabraOculta);
		}
	}
}
