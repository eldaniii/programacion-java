package unidad1;

public class Vilar_Martínez_8_6 {
	public static void main(String[] args) {
		int naturalNum=0;
		int beforeMultiple=7;
		
		while (beforeMultiple<100) {
			naturalNum++;
			beforeMultiple=7*naturalNum;
			if (beforeMultiple<100) {
				System.out.println(7+"*"+naturalNum+" = "+7*naturalNum);
			} else {}
		}
	}
}
