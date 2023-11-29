package unidad1;
import java.util.Scanner;

public class ConversionCentígradosFahrenheit {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados centígrados: ");
		float tempCentigrados=sc.nextFloat();
		float convCentigradosFahrenheit=(9*tempCentigrados)/5+32;
		System.out.println("Su equivalencia en grados Fahrenheit es: "+convCentigradosFahrenheit);
	}
}
