/*
 * Programa para generar un arreglo de 20 números enteros aleatorios
 * entre 20 y 400.
 * El usuario elige si desea resaltar los múltiplos de 5 o los múltiplos de 7. 
 * 
 * Posteriormente el programa vuelve a mostrar el arreglo, destacando los números seleccionados
 * con corchete []. 
 */

//Imports utilizados
import java.util.Scanner;

public class Codigo6 {
	  //Se agrega class main
	public static void main (String[] args) {
		//Se corrige la declaración del arreglo -> "int[] n= int[20];"
	    int[] n = new int[20]; //Arreglo de 20 números enteros
	    
	    //Se corrige el for, error de sintaxis -> "i+" en lugar de "i++"
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20; //Números entre 20 y 400
	      System.out.print(n[i] + " ");
	    }
	     
	    //Faltaba salto de línea y la impresión estaba mal escrita
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	    Scanner s = new Scanner(System.in);
	    int opcion = s.nextInt();
	    
	    //Determinar el múltiplo según la opción, se corrige el ? y : , error de colocación
	    int multiplo = (opcion == 1) ? 5 : 7;
	    
	    //Mostrar números resaltando los múltiplos seleccionados
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {
	    	  //Corrección de "in" por "out"
	        System.out.print(e + " ");
	      }
	    }
	    
	    //Se agrega s.close para cerrar el Scanner
	  s.close();
	}//class main
}//class Cogido 6