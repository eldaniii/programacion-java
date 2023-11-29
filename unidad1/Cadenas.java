package unidad1;
import java.util.Scanner;

public class Cadenas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del usuario");
		
		String user=teclado.nextLine();
		
		System.out.println(user.toLowerCase());
		
		System.out.println(user.toUpperCase());
		
		System.out.println(user.equals("Paco"));
		
		System.out.println(user.substring(1,2));
		
		System.out.println(user.charAt(1));
		
		System.out.println(user.indexOf('c'));
	}
}
