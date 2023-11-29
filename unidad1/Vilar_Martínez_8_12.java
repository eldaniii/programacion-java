package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_12 {
	public static void main(String[] args) {
		int nota;
		int m=1;
		boolean haySuspenso=false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota del alumno:");
		nota=sc.nextInt();
		while(m<5) {
			System.out.println("Introduce la nota del siguiente alumno:");
			nota=sc.nextInt();
			if (nota<5) haySuspenso=true;
			m++;
		}
		if (haySuspenso) System.out.println("Si hay algún suspenso.");
		else System.out.println("No hay ningún suspenso.");
	}
}
