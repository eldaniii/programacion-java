package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_9 {
	public static void main(String[] args) {
		int treeHeight;
		int treeCounter=0;
		int maxTreeHeight=0;
		int maxTreeCounter=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca en centímetros la altura del árbol:");
		treeHeight=sc.nextInt();
		while (treeHeight !=-1) {
			if (maxTreeHeight<treeHeight) {
				maxTreeHeight=treeHeight;
				maxTreeCounter=treeCounter;
			}
			treeCounter++;
			System.out.println("Introduzca  en centímetros la altura del siguiente árbol:");
			treeHeight=sc.nextInt();
		}
		System.out.println("El árbol más grande es el etiquetado con el número "+maxTreeCounter+" mediendo "+maxTreeHeight+" centímetros.");
	}
}
