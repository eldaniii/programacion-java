package unidad3;

import java.util.Scanner;

public class MainListing {
	public static String dameApellido(String datos[][], String telef) {
        String apellido = "";
        
        for (int i = 0; i < datos.length; i++) {
            if (telef.equalsIgnoreCase(datos[i][2])) {
            apellido = datos[i][1];
              i = datos.length;
            }
        }
		return apellido;
    }
	
	public static String dameNombre(String datos [][], String telef){
		String nombre = "";
		int i = datos.length;
		/*Comparamos array con el numero de telefono*/
		for (i = 0;i<datos.length;i++) {
			/*Si son iguales devolvemos nombre si no no pasara nada.*/
			if (datos[i][2].equalsIgnoreCase(telef)) {
				nombre=datos[i][0];
				i = datos.length;
			}
		}
		return nombre;
	}
	
	public static String dameTelefono(String datos [][], String apelli){
		String telefono = "";
		int i = datos.length;
		for (i = 0;i<datos.length;i++) {
			/*Si son iguales devolvemos el numero si no, no pasara nada.*/
			if (datos[i][1].equalsIgnoreCase(apelli)) {
				telefono=datos[i][2];
				i = datos.length;
			}
		}
		return telefono;
	}
	
	public static void dameTodo(String[][] datos) {

        for (int i = 0; i < datos.length; i++) { /* 5=i 3=j */
            System.out.println("Contacto: Nº"+i);
            System.out.println("Nombre:(" + datos[i][0] + ") ");
            System.out.println("Apellido:(" + datos[i][1] + ") ");
            System.out.println("Telefono:(" + datos[i][2] + ") ");
            //System.out.println("Nombre: "+datos[i][0]+" / Apellido: "+datos[i][1]+" / Telefono: "+datos[i][2]);

            System.out.println("----------------------");

        }
    }	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[][] cache = new String[1000][3]; En proceso para implementar un array limpio
		String[][] lista = new String[5][3]; //Suponemos 5 contactos.
		String apellido;
		String telefono;
		int opc = 0;
		char respuesta;
		int contactos=0;
		boolean terminar = false;
		int i = 0;
		int j= 0;
		
		do {
			j=0;
			System.out.println("Introduce el nombre:");
			lista[contactos][j]=sc.next();
			j++;
			System.out.println("Introduce el apellido:");
			lista[contactos][j]=sc.next();
			j++;
			System.out.println("Introduce el teléfono:");
			lista[contactos][j]=sc.next();
			j++;
			contactos++;
			do {
				System.out.println("¿Desea añadir otro contacto? (S/N)");
				respuesta=sc.next().charAt(0);
			} while (!(respuesta=='S' || respuesta=='N'));
		} while (respuesta=='S' && contactos<lista.length);
		
		do {
			System.out.println("1. Escribir todo el listing por consola");
			System.out.println("2. Buscas el nombre a partir del número de teléfono");
			System.out.println("3. Buscar el apellido a partir del número de teléfono");
			System.out.println("4. Buscar el teléfono a partir del apellido");
			System.out.println("5. Finalizar");
			opc=sc.nextInt();
				
			switch (opc) {
			case 1: 
				dameTodo(lista);
				break;
			case 2:
				System.out.println("Introduzca el teléfono:");
				telefono=sc.next();
				if (dameNombre(lista, telefono).equals("")) System.out.println("No se ha encontrado el nombre."); 
				else System.out.println("El nombre asociado a '"+telefono+"' es: "+dameNombre(lista, telefono));
				break;
			case 3:
				System.out.println("Introduzca el teléfono:");
				telefono=sc.next();
				if (dameApellido(lista, telefono).equals("")) System.out.println("No se ha encontrado el apellido.");
				else  System.out.println("El apellido asociado a '"+telefono+"' es: "+dameApellido(lista, telefono));
				break;
			case 4:
				System.out.println("Introduzca el apellido:");
				apellido=sc.next();
				if (dameTelefono(lista, apellido).equals("")) System.out.println("No se ha encontrado el teléfono.");
				else System.out.println("El número de teléfono asociado a '"+apellido+"' es: "+dameTelefono(lista, apellido));
				break;
			case 5:
				terminar=true;
				break;
			default: System.out.println("Opción no válida.");
				break;
			}
		} while (!terminar);
	}
}
