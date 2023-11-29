package unidad1;
import java.util.Scanner;

public class MayorDe3 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int numMayor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número:");
		a=sc.nextInt();
		System.out.println("Ingresa el segundo número:");
		b=sc.nextInt();
		System.out.println("Ingresa el tercer número:");
		c=sc.nextInt();
		
		if (a>b)
			if (a>c) numMayor=a;
			else numMayor=c;
		if (b>a)
			if (b>c) numMayor=b;
			else numMayor=c;
		else numMayor=c;
		
		System.out.println("El número mayor es: "+numMayor);
		
	}
}

