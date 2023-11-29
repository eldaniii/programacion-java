package unidad1;

import java.util.Scanner;

public class Vilar_Martínez_8_13 {
	public static void main(String[] args) {
		int nota;
		int nAlumnos=1;
		int nAprob=0;
		int nAprobCondicionados=0;
		int nSuspensos=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota del alumno:");
		nota=sc.nextInt();
		if (nota<5 && nota>=4) nAprobCondicionados++;
		else if(nota<4) nSuspensos++;
		else nAprob++;
		while(nAlumnos<6) {
			System.out.println("Introduce la nota del siguiente alumno:");
			nota=sc.nextInt();
			nAlumnos++;
			if (nota<5 && nota>=4) nAprobCondicionados++;
			else if(nota<4) nSuspensos++;
			else nAprob++;
		}
		System.out.println("Hay "+nAprob+" alumnos aprobados, "+nAprobCondicionados+" con aprobados condicionados y "+nSuspensos+" suspensos.");
		System.out.println(nAlumnos);
	}
}
