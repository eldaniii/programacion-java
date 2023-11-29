package unidad1;
import java.util.Scanner;

public class CalcularAreaTriángulo {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base del triángulo en cm: ");
		int base=sc.nextInt();
		System.out.println("Introduce la altura del triángulo en cm: ");
		int altura=sc.nextInt();
		
		float areaTriangulo= (float) (base*altura)/2;
		System.out.println("La área del triángulo en cm es: "+areaTriangulo);
	}

}
