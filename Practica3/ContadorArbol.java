package tp03.ejercicio3;
import tp03.ejercicio1;
import tp02.ejercicio2.*;


public class ContadorArbol{
    private ArbolBinario<Integer> dato;

    public ContadorArbol(ArbolBinario<Integer> dato){
        this.dato = dato;
    }

    public ListaGenerica<Integer> numerosParesPostOrden(){
        ListaGenerica<Integer> lista = new ListaGenerica<Integer>();
        contarParesPostOrden(lista, dato);
        return lista;
    }

    public ListaGenerica<Integer> numerosParesInOrden(){
        ListaGenerica<Integer> lista = new ListaGenerica<Integer>();
        contarParesInorden(lista,dato);
        return lista;
    }

    private contarParesPostOrden(ListaGenerica<Integer> lista, ArbolBinario<Integer> arbol){
        if(arbol.tieneHijoIzquierdo()){
            contarParesPostOrden(lista,arbol.getHijoIzquierdo());
        }
        if(arbol.getDato() % 2 == 0){
            lista.agregarInicio(arbol.getDato());
        }

        if(arbol.tienHijoDerecho()){
            contarParesPostOrden(lista, arbol.getHijoDerecho());
        }
    }

    private contarParesInorden(ListaGenerica<Integer> lista, ArbolBinario<Integer> arbol){
        if(arbol.tieneHijoIzquierdo()){
            contarParesInorden(lista, arbol.getHijoIzquierdo());
        }
        if(arbol.tienHijoDerecho()){
            contarParesInorden(lista, arbol.getHijoDerecho());
        }
        if(arbol.getDato() % 2 == 0){
            lista.agregarInicio(arbol.getDato());
        }
    }
}