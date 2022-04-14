package ejer1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class ejer1_6 {

	public static int calcular(int nro) {
		if (nro > 1) {
			if (nro % 2 == 0) {
				nro = nro/2;
			}else if(nro % 2 != 0 ) {
				nro = 3*nro+1;
			}
		}
		return nro;
	}
	
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		if (n > 1) {
			lista = calcularSucesion(calcular(n));
		}else if(n == 1) {
			lista = new ListaDeEnterosEnlazada();
		}
		lista.agregarInicio(n);
		return lista;
	}
	
	public static void main (String[] args) {
		ejer1_6 f = new ejer1_6();
		ListaDeEnterosEnlazada lista = f.calcularSucesion(6);
		
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println("Lista : ");
			System.out.println(lista.proximo());
		}
	}
}
