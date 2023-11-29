package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_7_1 {
  public static void main(String[] args) {
    int a;
    int b;
    int myCookie;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el valor de 'a' :");
    a=sc.nextInt();
    System.out.println("Introduce el valor de 'b' :");
    b=sc.nextInt();
    myCookie=a;
    a=b;
    b=myCookie;

    System.out.println("a= "+a+" b= "+b);
    }
}