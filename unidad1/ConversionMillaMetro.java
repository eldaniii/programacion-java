package unidad1;
import java.util.Scanner;

public class ConversionMillaMetro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud en millas:");
		float longMilla=sc.nextFloat();
		float convMillaMetro=longMilla*1609;
		System.out.println("Su equivalencia en metros es: "+convMillaMetro);
	}
}
