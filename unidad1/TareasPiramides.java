package unidad1;

import java.util.Scanner;

public class TareasPiramides {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura:");
		int n = sc.nextInt();
		
		System.out.println("Introduce el carácter a utilizar:");
		String r = sc.next();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2)-1; k++) {
				if ((k==1) || (k==(i*2)-1) || (i==n)) {
					System.out.print(r);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*for (int i = 1; i <= n; i++) {
			if (i!=n) {
				for (int j = 1; j <= (n-i); j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (i*2)-1; k++) {
					if (k==(i*2)-1) {
						System.out.print("x");
					} else {
						if (k>=2) {
							System.out.print(" ");
						} else if (k<2) {
							System.out.print("x");
						}
					}
				}
				System.out.println();
			} else {
				for (int a=1; a <= (i*2)-1; a++) {
					System.out.print("x");
				}
			}
		}
		
		Ejercicio original*/
	}
}
