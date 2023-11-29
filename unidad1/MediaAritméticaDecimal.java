package unidad1;
import java.util.Scanner;

public class MediaAritméticaDecimal {
	public static void main(String[] args) {
		int nota1;
		int nota2;
		double media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera nota");
		nota1=sc.nextInt();
		System.out.println("Introduce la segunda nota:");
		nota2=sc.nextInt();
		media= (double) (nota1+nota2)/2;
		System.out.println("La media aritmética es: "+media);
	}
} 
