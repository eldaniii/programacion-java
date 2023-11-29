package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_8_2 {
	public static void main(String[] args) {
		int age;
		int sumAge=0;
		int averageAge=0;
		int nStudents=0;
		int studOver18=0;
		Scanner sc = new Scanner(System.in);
		
		/*do {
			System.out.println("Introduce la edad del alumno"+counter+":");
			age=sc.nextInt();
			if (age>0) {
				counter++;
				sumAge+=age; //sumaAge=sumaAge+age
				averageAge=(sumAge/counter);
				if (age>=18) studOver18++;
			}
		} while (age>0);
		*/
		
		System.out.println("Introduce la edad del alumno"+nStudents+":");
		age=sc.nextInt();
		while (age>=0) {
				nStudents++;
				sumAge+=age; //sumaAge=sumaAge+age
				averageAge=(sumAge/nStudents);
				if (age>=18) studOver18++;
				System.out.println("Introduce la edad del alumno"+nStudents+":");
				age=sc.nextInt();
		}
		System.out.println("La suma de las edades de todos los alumnos es: "+sumAge);
		System.out.println("La media de las edades de todos los alumnos es: "+averageAge);
		System.out.println("Se han introducido la edad de "+nStudents+" alumnos.");
		System.out.println("Hay un total de "+studOver18+" alumnos mayores de edad.");	
	}
}
