package unidad1;
import java.util.Scanner;

public class CalcularEdad {
	public static void main(String[] args) {
		short anoNacimiento;
		short anoActual;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce su año de nacimiento: ");
		anoNacimiento=sc.nextShort();
		System.out.println("Introduce el año actual: ");
		anoActual=sc.nextShort();
		edad=anoActual-anoNacimiento;
		System.out.println("Tienes "+edad+" años.");
	}
}
