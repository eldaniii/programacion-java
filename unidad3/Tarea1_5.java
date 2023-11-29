package unidad3;

public class Tarea1_5 {
	public static int mayor3(int a, int b, int c) {
		int nMayor;
		if (a>b) {
			if (a>c) nMayor=a;
			else nMayor=c;
		}
		else {
			if (b>c) nMayor=b;
			else nMayor=c;
		}
		return nMayor;
	}
	public static void main(String[] args) {
		System.out.println(mayor3(6,10,20));
	}
}
