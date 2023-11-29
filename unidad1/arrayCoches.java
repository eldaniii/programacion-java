package unidad1;

import java.util.Scanner;

public class arrayCoches {
	public static void dameInfoCoches(String[][] datos) {
		System.out.println("Número de vehículos:"+datos.length+"\n");
		
		for (int i=0; i<datos.length; i++)
			System.out.println("Marca: "+datos[i][0]+"\t Modelo"+datos[i][1]);
	}
	public static String dameModeloCoche(String[][] datos, String marca) {
		String modelo="";
		
		for (int i=0; i<datos.length; i++)
				if (datos[i][0].equals(marca)) modelo=datos[i][1];
		return(modelo);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [][] coches = {{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}};
		
		for (int i=0; i<coches.length; i++) {
			System.out.println("Marca:"+coches[i][0]);
			System.out.println("Modelo:"+coches[i][1]);
			System.out.println();
		}
	} 
}
