package tp03.ejercicio1;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int cantHojas = 0;
		
		//se debe consultar si el arbol es vacio, en caso de ser vacio retorno 1

		if (this.esHoja){
			cantHojas++;
			return cantHojas;
		}else{

			//en caso de no ser vacio, se recorre el arbol de forma recursiva, contando
			//la cantidad de hojas que tiene el mismo.

			if (this.tieneHijoIzquierdo){
				cantHojas += this.getHijoIzquierdo().contarHojas();
			}

			if(this.tieneHijoDerecho){
				cantHojas += this.getHijoDerecho().contarHojas();
			}

		}

		//devuelve la cantidad de hojas que posee el arbol
		return cantHojas;
	}
	

    public ArbolBinario<T> espejo() {
		//utilizo una variable temporal o auxiliar para guardar el dato de 
		//el hijo izquierdo, asi depues lo guardo en el hijo derecho

		ArbolBinario<T> aux = this.getHijoIzquierdo();
		this.agregarHijoIzquierdo(this.getHijoDerecho());
		this.agregarHijoDerecho(aux);

		//se recorre recursivamente el arbol invocando el proceso para ir formando el 
		//arbol espejo

		if(this.tieneHijoIzquierdo()){
			this.getHijoIzquierdo().espejo();
		}
		if(this.tieneHijoDerecho()){
			this.getHijoDerecho().espejo();
		}


		return this;
	}


	public void entreNiveles(int n, int m){
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nivel = 0;
		
		cola.encolar(this); 
		cola.encolar(null);

		//la primera vez siempre entra al while, porque me estoy asegurando de que hay 
		//algo en la cola
		while (!cola.esVacia()){ //si cola = vacia --> false si cola != vacia --> true

			arbol = cola.desencolar(); //desencola la raiz del arbol

			if (arbol != null){ //entra al if si el arbol no esta vacio

				if ((nivel >= n) && (nivel <= m)){
					System.out.println(arbol.getDato());
				}
				if(arbol.tieneHijoIzquierdo()){
					cola.encolar(arbol.getHijoIzquierdo()); //encola el hijo izquierdo del arbol
				}
				if(arbol.tieneHijoDerecho()){
					cola.encolar(arbol.getHijoDerecho()); //encola el hijo derecho del arbol
				}

			}else if(!cola.esVacia()){
				cola.encolar(null);
				nivel++;
			}
		} 
	}

	

}
