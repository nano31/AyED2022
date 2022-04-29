// package src.tp04.ejercicio1;
// import tp02.ejercicio2.*;

// import tp02.ejercicio2.ListaEnlazadaGenerica;
// import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	/*public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(Integer n, ArbolGeneral<Integer> ab, ListaGenerica<Integer> l){
		//ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		//la lista se inicializa y se pasa como parámetro en el main.
		if(!ab.esVacio()) {
			if(ab.getDato() % 2 != 0 && ab.getDato() > n) {
				l.agregarFinal(ab.getDato());
			}
			if(!ab.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = ab.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					numerosImparesMayoresQuePreOrden(n, ab, hijos.proximo());
				}
				
			}
		}
		
		return l;
	}*/
	
	public Integer altura() {
		Integer altura = 0, max = -1;
		
		if (this.esHoja()) {
			return 0; //el unico nodo en el arbol es la raiz
		}
		else {
			if(this.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
				hijos.comenzar();
				while(!hijos.esVacia()) {
					altura += hijos.proximo().altura();
					//mi duda es, suma de a uno, o suma el dato que tiene guardado el 
					//nodo que se esta procesando
				}
			}
			if(altura > max) {
				max = altura;
			}
		}
		
		return max;
	}

	public Integer nivel(T dato) {
		//devuelve el nivel donde se encuentra el dato pasado como parametro
        Integer nivel = 0;
        ColaGenerica<ArbolGeneral<T>> q = new ColaGenerica<ArbolGeneral<T>>();
        ArbolGeneral<T> aux; 

        


		return -1;
	}

	public Integer ancho() {
		Integer cant = 0, max = -1;
		ArbolGeneral<T> aux; //variable auxiliar para desencolar
		ColaGenerica<ArbolGeneral<T>> q = new ColaGenerica<ArbolGeneral<T>>();
		
		q.encolar(this);
		q.encolar(null);
		
		while(!q.esVacia()) {
			aux = q.desencolar();
			if(aux != null) {
				cant++; //cuenta la cantidad de nodos que hay en el nivel actual
				ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					q.encolar(hijos.proximo());
				}
			}else {
				if(!q.esVacia()) {
					q.encolar(null);
					if(cant > max) {
						max = cant;
					}
					cant = 0;
				}
			}
		}
		
		
		return max;
	}

}

