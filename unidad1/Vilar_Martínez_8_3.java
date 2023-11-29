package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_3 {
	public static void main(String[] args) {
		int numRandom= (int) Math.floor((Math.random()*100)+1);
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número del 1-100:");
			num=sc.nextInt();
			String result=(num>numRandom)? "Menor":"Mayor";
			System.out.println(result);
		} while (!(num==numRandom));
		System.out.println("Correcto!");
	}
}
