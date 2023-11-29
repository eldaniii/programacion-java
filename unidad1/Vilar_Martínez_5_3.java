package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_5_3{
    public static void main (String[]args){
        int num;
        float nImpar;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        num=sc.nextInt();
        nImpar=num%2;
        if(nImpar!=0)
        System.out.println("Este número no es par");
        else 
        System.out.println("Este número es par");    
    }
}