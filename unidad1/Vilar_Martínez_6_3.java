package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_6_3 {
    public static void main(String[]args){
    int num;
    int par;
    int tipo;
    Scanner sc = new Scanner(System.in);

    System.out.println("Escriba un número entero");
    num=sc.nextInt();
    par=num%2;

        if(par!=0){
            tipo=0;
            System.out.println("La variable par vale "+tipo);
        }else{
            tipo=1;
            System.out.println("La variable par vale "+tipo);
        }
    }
}
