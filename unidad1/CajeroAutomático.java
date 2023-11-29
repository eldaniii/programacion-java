package unidad1;
import java.util.Scanner;

public class CajeroAutomático {
	public static void main(String[] args) {
		final int pinValido=1234;
		int pinIntroducido;
		int opc;
		int intentos=0;
		int saldo=500;
		int importe;
		boolean autenticado=false;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca el PIN:");
			pinIntroducido=sc.nextInt();
			if (pinIntroducido==pinValido) 	{
				autenticado=true;
				} else {
				intentos++;
				System.out.println("Error en en PIN, le quedan "+(3-intentos)+" intentos.");
				}
			} while(!autenticado && intentos<3);
		
		while (autenticado ) {
			System.out.println("Elija una opción:");
			System.out.println("1- Ingreso de efectivo");
			System.out.println("2- Retirada de efectivo");
			System.out.println("3- Cerrar sesión");
			opc=sc.nextInt();
				
			switch(opc) {
			case 1: System.out.println("Elija la cantidad a ingresar:");
			importe=sc.nextInt();
			saldo=saldo+importe;
			System.out.println("Ingreso correcto.");
			System.out.println("Saldo disponible "+saldo);
			break;
			case 2: System.out.println("Elija la cantidad a retirar:");
			importe=sc.nextInt();
			if (importe<=saldo) {
				saldo=saldo-importe;
				System.out.println("Retiro correcto.");
			} else { 
				System.out.println("Saldo insuficiente");
			}
			System.out.println("Saldo disponible "+saldo);
			break;
			case 3: System.out.println("Ha salido correctamente.");
			autenticado=false;
			break;
			default: System.out.println("Opción no válida.");
			}
		}
	} 
}
