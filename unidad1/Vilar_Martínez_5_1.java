package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_5_1 {
    public static void main (String[]args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número entero:");
        num=sc.nextInt();
        if(num<0)
        System.out.println("Este número no es entero.");
        else 
        System.out.println("Este número es entero.");    
    }
}