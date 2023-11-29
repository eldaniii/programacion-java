package unidad3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea3_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//DecimalFormat df = new DecimalFormat("#.00");
		/*
		 * En vez de Math.round(()*100)/100 podemos hacer uso de un DecimalFormat para quedarnos con dos decimales la diferencia es que
		 * con DecimalFormat el programa nos devuelve un String y con Math.round() un valor númerico.
		 */
		
		final int trimestres = 3;
		final int alumnos = 5;
		double[][] notas = new double[trimestres][alumnos];
		double[] notaMedia = new double[trimestres];
		double[] alumnoMedia = new double[alumnos];
		double suma1 = 0;
		double suma2 = 0;
		int pos;
		
		/*for (int i=0; i<notas.length; i++) {
			for (int k=0; k<notas[0].length; k++) {
				notas[i][k]=(int) Math.round((Math.random()*10)*100)/100.0;
			}
		}*/
		
		/*for (int i=0; i<notas.length; i++) {
			double suma=0;
			for (int k=0; k<notas[0].length; k++) {
				System.out.println("La nota del trimestre "+i+" del alumno "+k+" es notas["+i+"]["+k+"]:"+notas[i][k]);
				suma+=notas[i][k];
				notaMedia[i]=Math.round((suma/alumnos)*100)/100.0;
			}
			System.out.println("La nota media de la clase es notaMedia["+i+"]:"+notaMedia[i]);
		}*/
		
		for (int i=0; i<notas.length /*o trimestres*/; i++) {
			suma1=0;
			for (int k=0; k<notas[0].length /*o alumnos*/; k++) {
				notas[i][k]=(int) Math.round((Math.random()*10)*100)/100.0;
				System.out.println("La nota del trimestre "+(i+1)+" del alumno "+k+" es notas["+i+"]["+k+"]:"+notas[i][k]);
				suma1+=notas[i][k];
			}
			notaMedia[i]=Math.round((suma1/alumnos)*100)/100.0;
			System.out.println("La nota media de la clase del trimestre "+(i+1)+" es notaMedia["+i+"]:"+notaMedia[i]);
		}
		
		do {
			System.out.println("Dime la posición en el array del alumno del cual quieres mostrar su media individualmente:");
			pos=sc.nextInt();
		} while (pos<0 || pos>alumnos);
		
		for (int i=0; i<notas.length /*o trimestres*/; i++) {
			suma2+=notas[i][pos];
		}
		alumnoMedia[pos]=Math.round((suma2/trimestres)*100)/100.0;
		
		System.out.println("La media del alumno "+pos+" de todos los trimestres es alumnoMedia["+pos+"]:"+alumnoMedia[pos]);
	}
}
