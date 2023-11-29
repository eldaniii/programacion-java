package unidad3;

import java.util.Scanner;

public class Tarea3_5 {
	public static int[] burbujaAsc(int[] num) {
		int i;
		boolean flag=true;
		int temp;
		while (flag) {
			flag=false;
			for (i=0; i<num.length-1; i++) {
				if (num[i]>num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					flag=true;
				}
			}
		}
		return num;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int tam=6;
		
		int[] alfa = {2,6,7,9,3,1};
		int[] beta = {3,5,2,6,2,1};
		int[] gamma = new int[tam*2];
		
		burbujaAsc(alfa);
		burbujaAsc(beta);
		
		int i=0;
		int j=0;
		int k=0;
		
		while (i<alfa.length && j<beta.length) {
			if (alfa[i]<beta[j]) {
				gamma[k]=alfa[i];
				i++;
				k++;
			} else if (alfa[i]>beta[j]) {
				gamma[k]=beta[j];
				j++;
				k++;
			} else {
				gamma[k]=alfa[i];
				i++; //No incrementamos j para que los repetidos se vuelquen 2 veces
				k++;
			}
		}
		
		System.out.println("i:"+i+" j:"+j+" k:"+k);
		//Llegando a este punto, alfa o beta han sido volcados por completo en gamma
		
		while (i<alfa.length) {
			gamma[k]=alfa[i]; //Volcamos en gamma el resto de alfa
			i++;
			k++;
		}
		
		while (j<beta.length) {
			gamma[k]=beta[j]; //Volcamos en gamma el resto de beta
			j++;
			k++;
		}
		
		for (k=0; k<tam*2; k++) {
			System.out.print(gamma[k]);
		}
	}
 }
