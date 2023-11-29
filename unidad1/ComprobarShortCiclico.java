package unidad1;
import java.util.Scanner;

public class ComprobarShortCiclico {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	short valorMaximo=32767;
	
	System.out.println("El valor máximo de una variable short es: "+valorMaximo);
	valorMaximo= (short) (valorMaximo+1);
	System.out.println("Si le sumamos al valor máximo 1 sucede esto: "+valorMaximo);
	}
}
