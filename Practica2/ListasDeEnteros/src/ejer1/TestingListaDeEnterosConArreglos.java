package ejer1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class TestingListaDeEnterosConArreglos {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int nro,
		posAct = 1;
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos() ;
		
		
		
		lista.comenzar();
		
		do {
			System.out.println("Ingrese un nro: "); 
			nro = in.nextInt();
			lista.agregarEn(nro, posAct);
			posAct++;
		}while(nro != 0);
		
		int i = 1;
		while (i < lista.tamanio()) {
			System.out.println("Elemento "+i+": "+lista.elemento(i));
			i++;
		}

		System.out.println("Hola");
	}
}
