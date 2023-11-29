package unidad3;

import java.util.Scanner;

public class ejemplosBurbuja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
	public static int[] burbuja1(int[] num) {
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
	private static void burbuja2(int[] num) {
		int temp;
		
		for (int i=0; i<num.length; i++) {
			
		}
	}
}
