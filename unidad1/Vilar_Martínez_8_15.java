package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_15 {
	public static void main(String[] args) {
		int N;
		int nPrimos=0;
		int nDivisibles=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		N=sc.nextInt();
		
		for(int i=1;i<=N; i++) {
		
			for(int k=1;k<=N;k++) {
				if ((N%k)==0) nDivisibles++;
			}
			if (nDivisibles == 2) {
				System.out.println("El número "+i+" es primo.");
				nPrimos++;
			} else System.out.println("El número "+i+" no es primo.");
		}
		System.out.println("Entre 1 y "+N+" hay "+nPrimos+" números primos.");
	}
}
