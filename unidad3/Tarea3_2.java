package unidad3;

import java.util.Scanner;

public class Tarea3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidadNum=1;
		int[] numeros;
		
		do {
			System.out.println("¿Cuantos números desea introducir?:"); //por defecto 1
			cantidadNum=sc.nextInt();
		} while (cantidadNum<=0);
		
		numeros = new int[cantidadNum];
		
		for (int i=0; i<cantidadNum; i++) {
			System.out.println("Introduzca el número "+(i+1)+":");
			numeros[i]=sc.nextInt();
		}
		
		System.out.println("Orden inverso:");
		for (int i=cantidadNum-1; i>=0; i--) System.out.println("numeros["+i+"]:"+numeros[i]);
	}
}
