package ejer2;

import tp02.ejercicio2.*;
import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
	
		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
		
		Estudiante est1 = new Estudiante("Franco", "Garcia", 2, "jgjg", "nada");
		Estudiante est2 = new Estudiante("Mica", "Lopez", 6, "hola", "nice");
		Estudiante est3 = new Estudiante("Noemi", "Fernandez", 8, "lkj", "etf");
		Estudiante est4 = new Estudiante("Nano", "Gil", 2, "rj", "hvc");
		
		l.agregarInicio(est1);
		l.agregarEn(est2, 2);
		l.agregarEn(est3, 3);
		l.agregarEn(est4, 4);
		
		
		l.comenzar();
		while(!l.fin()) {
			int i = 1;
			System.out.println("Estudiante "+i+": ");
			System.out.println(l.proximo().tusDatos());
			i++;
			System.out.println("============================================");
		}
	}
	
}
