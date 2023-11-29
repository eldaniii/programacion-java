package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_7_2 {
   public static void main(String[] args) {
        int edad;
        int nivel_de_estudios;
        int ingresos;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad:");
        edad=sc.nextInt();
        System.out.println("Introduce el nivel de estudios:");
        nivel_de_estudios=sc.nextInt();
        System.out.println("Introduce la cantidad de ingresos:");
        ingresos=sc.nextInt();
        
        boolean jasp=(edad<=28 && nivel_de_estudios>3 && ingresos>28000)?true:false;
        System.out.println(jasp);
    }
}

