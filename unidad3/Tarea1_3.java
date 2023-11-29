package unidad3;

import java.util.Scanner;

public class Tarea1_3 {
	public static void calculo(double radio , double altura, int resp) {
		double area = 2*3.14*(radio*(radio+altura));
		double volumen = 3.14*radio*radio*altura;
		
		if(resp==1) {
			System.out.println("El area del cilindro es: "+area);
		}
		if(resp==2) {
			System.out.println("El volumen del cilindro es: "+volumen);
		}
	}
	public static void main(String[]args) {
		int resp = 0;
		
		Scanner sc = new Scanner (System.in);
	
		do {
		System.out.println("¿Que quieres calcular?");
		System.out.println("1.Área");
		System.out.println("2.Volumen");
		
		resp = sc.nextInt();
		
		switch(resp) {
		case 1 : System.out.println("Has elegido calcular el área");
		break;
		case 2 : System.out.println("Has elegido calcular el volumen");
		break; 
		default : System.out.println("No has elegido una opción correcta");
		}
		
		} while (resp>=3);
		
		System.out.println("Define el radio de la base del cilindro");
		double radio = sc.nextDouble();
		
		System.out.println("Define la altura del cilindro");
		double altura = sc.nextDouble();
		
		calculo(radio,altura,resp);
	}
}
