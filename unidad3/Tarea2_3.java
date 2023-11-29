package unidad3;

import java.util.Scanner;

public class Tarea2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la frase:");
		String frase=sc.nextLine();
		int posCentral=frase.length()/2
;		
		System.out.println("Longitud cadena:"+frase.length());
		System.out.println("Posición central:"+posCentral);
		
		if (frase.charAt(posCentral)==(' ')) System.out.println("El carácter central es un espacio en blanco.");
		else System.out.println("El carácter no es un espacio en blanco.");
	}
}
