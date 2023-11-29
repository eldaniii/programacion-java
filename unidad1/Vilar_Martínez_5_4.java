package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_5_4 {
    public static void main (String[]args){
        int num1;
        int num2;
        float nImpar1;
        float nImpar2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        num1=sc.nextInt();
        System.out.println("Ingresa otro número");
        num2=sc.nextInt();
        nImpar1=num1%2;
        nImpar2=num2%2;
        
        if(nImpar1!=0){
        System.out.println("El número "+num1+" es impar");
        } else {
        System.out.println("El número "+num1+" es par"); 
        }
        if(nImpar2!=0){
        System.out.println("El número "+num2+" es impar");
        } else {
        System.out.println("El número "+num2+" es par"); 
        }
    }
}

