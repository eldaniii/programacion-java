package u1ent;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n=100;
		int nMayor=0;
		int sumaTotal=0;
		int media;
		int contador=0;
		int num; 
		
		System.out.println("Introduzca un número par y natural:");
		num=sc.nextInt();
		while (sumaTotal<=n) {
			if (!(num>0) || !(num%2==0)) {
				System.out.println("Error en el número introducido. Introduzca un número natural y par:");
				num=sc.nextInt();
			} else {
				sumaTotal+=num;
				contador++;
				if (num>nMayor) nMayor=num;
				if (sumaTotal<=n) {
					System.out.println("Introduzca otro número par y natural:");
					num=sc.nextInt();
				}
			}
		}
		media=sumaTotal/contador;
		System.out.println("La media de los números introducidos es: "+media);
		System.out.println("El mayor de los números introducidos es: "+nMayor);
	}
}
