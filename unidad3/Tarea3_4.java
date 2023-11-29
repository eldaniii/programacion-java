package unidad3;

import java.util.Scanner;

public class Tarea3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int longClave;
		int[] clave;
		int combinacion[];
		String respuesta;
		boolean acertado=false;
		
		
		System.out.println("¿Cuántos digitos quieres para la clave?:");
		longClave=sc.nextInt();
		
		clave=new int[longClave];
		combinacion=new int[longClave];
		
		for (int i=0; i<longClave; i++) {
			clave[i]=(int) (Math.random()*5)+1;
			System.out.print(clave[i]);
		}
		
		//System.out.println();
		while (!acertado) {
			acertado=true;
			System.out.println("\nIntroduzca la combinación:");
			respuesta=sc.next();
			for (int i=0; i<longClave; i++) {
				combinacion[i]=respuesta.charAt(i)-'0';
				// Alternativa:
				// combinacion[i]=Integer.parseInt(String.valueOf(respuesta.charAt(i)));
				// combinacion[i]=Character.getNumericValue(respuesta.charAt(i));
			}
			for (int i=0; i<longClave; i++) {
				if (combinacion[i]>clave[i]) {
					System.out.println("Es menor que "+combinacion[i]);
					acertado=false;
				}
				else if (combinacion[i]<clave[i]) {
					System.out.println("Es mayor que "+combinacion[i]); 
					acertado=false;
				}
				else System.out.println("Es igual a "+combinacion[i]);
			}
		}
		System.out.println("¡Enhorabuena, has ganado!");
	}
}
