package u1ent;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = (int) Math.floor(Math.random()*(25)+1);
		int nIntroducido=0;
		int intentosTotales=1;
		int intentosUsados=0;
		int quiereAyuda;
		boolean haAcertado=false;
		
		System.out.println(num);
		System.out.println("¿Cuantos intentos quiere realizar?");
		intentosTotales=sc.nextInt();
		System.out.println("¿Quiere recibir ayuda? (SI/NO)");
		System.out.println("1 - SI");
		System.out.println("2 - NO");
		quiereAyuda=sc.nextInt();
		
		do  {
			System.out.println("Introduzca un número:");
			nIntroducido=sc.nextInt();
			intentosUsados++;
			if (nIntroducido==num) haAcertado=true;
			else {
				haAcertado=false;
				System.out.println("Fallo, intentos restantes: "+(intentosTotales-intentosUsados));
				if (quiereAyuda==1) {
					if (nIntroducido>num) System.out.println("Como has pedido ayuda te daré una pista. El número secreto es menor que el acabas de introducir.");
					else if (nIntroducido<num) System.out.println("Como has pedido ayuda te daré una pista. El número secreto es mayor que el acabas de introducir.");
				}
			} 
		} while (intentosUsados<intentosTotales && !haAcertado);
		
		if (haAcertado) { System.out.println("Has acertado, enhorabuena!");
		System.out.println("Has hecho "+intentosUsados+" intentos.");
		} else {
			System.out.println("Lo siento, has perdido.");
			System.out.println("Has hecho "+intentosUsados+" intentos.");
		}
	}
}
