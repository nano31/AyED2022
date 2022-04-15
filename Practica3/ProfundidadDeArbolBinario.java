package tp03.ejercicio5;
import tp03.ejercicio1.ArbolBinario;
import tp02.ejercicio3.ColaGenerica;

public class ProfundidadDeArbolBinario{
    private ArbolBinario<Integer> arbol;

    public ProfundidadDeArbolBinario (ArbolBinario<Integer> arbol){
        this.arbol = arbol;
    }

    public static int sumaElementosProfundidad(int profundidad){
        int suma = 0; 
        ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
        ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();

        cola.encolar(arbol);
        cola.encolar(null);
        boolean ok = false;
        int nivel = 0;

        while((!cola.esVacia()) && !ok){
            ab = cola.desencolar();
            if(ab != null){
                if(nivel == profundidad){
                    suma += ab.getDato();
                }
                if(ab.tieneHijoIzquierdo()){
                    cola.encolar(ab.getHijoIzquierdo());
                }
                if(ab.tieneHijoDerecho()){
                    cola.encolar(ab.getHijoDercho());
                }
            }else if(!cola.esVacia()){
                cola.encolar(null);
                nivel++;
            }

            if(nivel > profundidad){
                ok = true;
            }
        }
        if(!ok){
            return -1;
        }else{
            return suma;
        }
    }
}