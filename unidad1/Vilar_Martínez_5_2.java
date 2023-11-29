package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_5_2 {
    public static void main (String[]args){
        int num1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número 12");
        num1=sc.nextInt();
        if(!(num1==12))
        System.out.println("Este número no es el 12");
        else 
        System.out.println("Este número es el 12");    
    }
}