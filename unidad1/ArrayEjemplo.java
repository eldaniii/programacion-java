package unidad1;
import java.util.Scanner;

public class ArrayEjemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] datos = new int[50];
		int j=0;
		
		for(int i=1; i<=100; i++) {
			if (i%2==0) {
				datos[j]=i;
				j++;
			}
		}
		for(int i=0; i<50; i++) {
			
		 System.out.println("datos["+i+"]:"+datos[i]);
		}
	}
}
