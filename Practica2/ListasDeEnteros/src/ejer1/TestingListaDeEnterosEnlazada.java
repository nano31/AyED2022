package ejer1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class TestingListaDeEnterosEnlazada {

	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		Scanner in = new Scanner(System.in);
		
		Integer nro,
			posAct = 1;
		lista.comenzar();
		
		System.out.println("Igrese un nro: ");
		nro = in.nextInt();
		do {
			lista.agregarEn(nro, posAct);
			posAct++;
			System.out.println("Ingrese un nro: ");
			nro = in.nextInt();
		}while(nro != 0);
		
		System.out.println(lista.proximo());

	}

}
