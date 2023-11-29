package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_6_4 {
    public static void main(String[]args){
    byte num1;
    byte num2;
    byte menor;
    Scanner sc = new Scanner(System.in);

    System.out.println("Escriba un número");
    num1=sc.nextByte();
    System.out.println("Escriba un número");
    num2=sc.nextByte();

        if(num2<num1){
            menor=num2;
            System.out.println("El menor es "+menor);
        }
        if(num1<num2){
            menor=num1;
            System.out.println("El menor es "+menor);
        }
    }
}