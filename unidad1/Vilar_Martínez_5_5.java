package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_5_5 {
    public static void main (String[]args){
        long num1;
        long num2;
        long num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        num1=sc.nextInt();
        System.out.println("Ingresa otro número");
        num2=sc.nextInt();
        System.out.println("Ingresa otro número");
        num3=sc.nextInt();
        
        if(num1>=num2 && num1>=num3)
        System.out.println(num1+" es mayor que "+num2+" y "+num3);
        if(num2>=num1 && num2>=num3)
        System.out.println(num2+" es mayor que "+num1+" y "+num3);
        if(num3>=num1 && num3>=num2)
        System.out.println(num3+" es mayor que "+num1+" y "+num2);
    }
}
