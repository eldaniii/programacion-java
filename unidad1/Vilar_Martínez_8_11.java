package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_11 {
	public static void main(String[] args) {
		int n=1;
		int m=1;
		int product;
		Scanner sc = new Scanner(System.in);
		
		while (n>=1 && n<=10) {
			while (m>=1 && m<=10) {
				product=n*m;
				System.out.println(n+"*"+m+"="+product);
				m++;
			}
			n++;
			m=1;
		}
	}
}
