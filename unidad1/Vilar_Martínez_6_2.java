package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_6_2 {
    public static void main (String[]args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 10");
        num=sc.nextInt();
        if(num>=1 && num<=10){
            switch(num) {
                case 1:
                System.out.println("Uno");
                break;
                case 2:
                System.out.println("Dos");
                break;
                case 3:
                System.out.println("Tres");
                break;
                case 4:
                System.out.println("Cuatro");
                break;
                case 5:
                System.out.println("Cinco");
                break;
                case 6:
                System.out.println("Seis");
                break;
                case 7:
                System.out.println("Siete");
                break;
                case 8:
                System.out.println("Ocho");
                break;
                case 9:
                System.out.println("Nueve");
                break;
                case 10:
                System.out.println("Diez");
                break;
            }
        }else{
            System.out.println("No es un número entre el 1 y el 10");
        }
    }
}