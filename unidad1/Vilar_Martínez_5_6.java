package unidad1;
import java.util.Scanner;

public class Vilar_Martínez_5_6 {
    public static void main (String[]args){
        final double gravedad=9.8;
        double tiempo;
        double velocidad;
        Scanner sc = new Scanner(System.in);  

        System.out.println("Introduce el tiempo");
        tiempo=sc.nextDouble();
        velocidad=tiempo*gravedad;
        if(tiempo!=0){
            System.out.println("La velocidad es: "+velocidad);
        }else{
            System.out.println("Tiempo Incorrecto");
        }
    }
}
    

