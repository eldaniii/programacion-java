package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_8 {
	public static long factorial(long numero) {
		/* Un factorialRecursivo sería {
		 * if (numero <=1)
		 * 		return 1;
		 * return numero * factorial(numero-1);
		 * }
		 * 
		 * Una función recursiva es aquella que se llama a sí misma cuando se ejecuta.
		 */
		if (numero == 0)
			return 1;
		
		long factorial = 1;
		
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
		//Se puede hacer también mediante un bucle "for"
	}
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número para el que quiere calcular el factorial:");
		numero = teclado.nextInt();
		
		System.out.println("El factorial de "+numero+" es "+factorial(numero));
		System.out.println("Fin");
	}
}
