package unidad1;

public class Vilar_Martínez_8_7 {
	public static void main(String[] args) {
		int oddNumber=1;
		int numMultiples=0;
		int totalProduct=1;
		
		while (numMultiples<10) {
			totalProduct=totalProduct*oddNumber;
			oddNumber+=2;
			numMultiples++;
		}
		System.out.println("El producto total de los 10 primeros números impares es: "+totalProduct);
	}
}
