package unidad3;

public class Tarea1_4 {
	public static int mayor2(int a, int b) {
		int nMayor;
		if (a>b) nMayor=a;
		else nMayor=b;
		return nMayor;
	}
	public static void main(String[] args) {
		System.out.println(mayor2(6,10));
	}
}
