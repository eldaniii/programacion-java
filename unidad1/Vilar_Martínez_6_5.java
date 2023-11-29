package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_6_5 {
    public static void main(String[]args){
    double num1;
    int resp1;
    double diametro;
    double perimetro;
    double area;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el radio");
    num1=sc.nextDouble();
    System.out.println("1.Calcular diámetro");
    System.out.println("1.Calcular perímetro");
    System.out.println("1.Calcular área");
    resp1=sc.nextInt();

    switch(resp1) {
        case 1:
            diametro=2*num1;
            System.out.println("El diámetro es "+diametro);
            break;
        case 2:
            perimetro=2*(3.14)*num1;
            System.out.println("El perímetro es "+perimetro);
            break;
        case 3: 
            area=(3.14)*num1*num1;
            System.out.println("El área es "+area);
            break;
        default:
            System.out.println("No válido");
            break;
        }
    }
}