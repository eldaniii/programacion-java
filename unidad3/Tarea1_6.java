package unidad3;

public class Tarea1_6 {
	public static boolean esVocal(char a) {
		boolean esVocal;
		switch (a) {
		case 'a','e','i','o','u','A','E','I','O','U': esVocal=true;
		break;
		default: esVocal=false;
		break;
		}
		return esVocal;
	}
	public static void main(String[] args) {
		System.out.println(esVocal('a'));
	}
}
