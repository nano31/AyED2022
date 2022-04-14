package tp02.ejercicio3;

import tp02.ejercicio2.*;

public class ColaGenerica<T> {
	ListaEnlazadaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
	
	public void encolar (T elem) {
		lista.agregarFinal(elem);
	}
	
	public T desencolar() {
		int pos = 1;
		T elem = lista.elemento(pos);
		pos++;
		
		return elem;
	}
	
	public T tope() {
		T elem;
		elem = lista.elemento(1);
		return elem;
	}
	
	public boolean esVacia() {
		return (lista.esVacia());
	}
	
}
