package unidad1;
import java.io.*;

public class PrimeraFuncion { 
	public static double calcularLongCircunf(int radio ) { 
		double longCircunf = 2 * 3.1415926535 * radio;
		double longConDosDecimales = Math.round(longCircunf * 100) / 100.0;
		return longConDosDecimales;
	}
	public static double calcularAreaCircunf(int radio ) {
		double areaCircunf = (radio*radio) * 3.1415926535;
		double areaConDosDecimales = Math.round(areaCircunf * 100) / 100.0;
		return areaConDosDecimales;
	}
	public static void main(String[] args) {
		System.out.println(calcularLongCircunf(4));
		System.out.println(calcularLongCircunf(6));
		System.out.println(calcularLongCircunf(8));
		System.out.println(calcularLongCircunf(10));
		System.out.println(calcularLongCircunf(111));
		System.out.println();
		System.out.println(calcularAreaCircunf(4));
		System.out.println(calcularAreaCircunf(6));
		System.out.println(calcularAreaCircunf(8));
		System.out.println(calcularAreaCircunf(10));
		System.out.println(calcularAreaCircunf(111));
	}
} 
