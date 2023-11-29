package unidad1;
import java.util.Scanner;

public class MediaAritméticaEntera {
	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		int media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera nota");
		nota1=sc.nextDouble();
		System.out.println("Introduce la segunda nota:");
		nota2=sc.nextDouble();
		System.out.println("Introduce la segunda nota:");
		nota3=sc.nextDouble();
		media= (int) (nota1+nota2+nota3)/3;
		System.out.println("La media aritmética es: "+media);
	}
}
