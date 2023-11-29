package unidad1;
import java.util.Scanner;

public class CarnePescado {
		public static void main(String[] args) {
			int opc;
			Scanner sc = new Scanner(System.in);
			
			do { System.out.println("Elija opción:");
				System.out.println("1 Carne");
				System.out.println("2 Pescado");
				System.out.println("3 Vegano");
				opc=sc.nextInt();
			
				
				switch(opc) {
				case 1: System.out.println("Ha elegido carne");
					break;
				case 2: System.out.println("Ha elegido pescado");
					break;
				case 3: System.out.println("Ha elegido vegano");
					break;
				default: System.out.println("Opción no válida");
				}
			} while (!(opc>=1 && opc<=3));
		}
}
