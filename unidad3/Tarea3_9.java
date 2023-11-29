package unidad3;

public class Tarea3_9 {
	public static int aciertosPrimitiva(int[] tabla1, int[] tabla2) {
	    int numAciertos = 0;

	    for (int i = 0; i < tabla1.length; i++) {
	        for (int j = 0; j < tabla2.length; j++) {
	            if (tabla1[i] == tabla2[j]) 
	                numAciertos++;
	        }
	    }
	    return numAciertos;
	}

	public static void main(String[]args){
		final int tam=6;
		int[] combinacionGanadora = new int[tam];
		int[] combinacionUsuario = new int[tam];
		int numAciertos = aciertosPrimitiva(combinacionGanadora, combinacionUsuario);
		boolean numInvalido;

		// Sin terminar
		/*for (int=0; i<combinacionGanadora.length; i++)
		
		if ((valor<=0)||(valor>50)) {
			System.out.println("Valor incorrecto, debe ser de 1 a 50, por favor introduzclo de nuevo:");
		} else {
			combinacionUsuario[i]=valor;
			numInvalido=false;
		}
		System.out.println("Has tenido "+aciertosPrimitivos(combinacionGanadora, combinacionUsuario));*/
	}
	
}
