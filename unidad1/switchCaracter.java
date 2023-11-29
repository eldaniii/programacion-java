package unidad1;
import java.util.Scanner;

public class switchCaracter {
	public static void main(String[] args) {
		char character;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una letra letrita:");
		character = sc.next().charAt(0);
		
		switch (character) {
		case 'A','E','I','O','U','a','e','i','o','u':
			System.out.println("Vocal.");
		break;
		default:
			System.out.println("Consonante.");
		break;
		}
	}
}
