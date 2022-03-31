package ejer1;

import tp02.ejercicio1.*; 
import java.util.Scanner;


public class ImprimirListaInversa{

    public static void imprimirInverso(ListaDeEnterosEnlazada l, int cantEnLista){
        /**cantEnLista tendra la cantidad de elementos que posee la lista */
        if(cantEnLista > 0){
            System.out.printl(l.elemento(cantEnLista));/**cantEnLista indica la pos donde se encuentra el elem a imprimir */
            cantEnLista--;
            imprimirInverso(l, cantEnLista);
        }
        
    }


    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        lista.comenzar();
        int nro;
        
        /**carga de la lista */
        int i = 1;
        do{
            System.out.printl("Ingrese un nro: ");
            nro = in.nextInt();
            lista.agregarEn(nro,i);
            i++;
        }while(nro != 0);

        imprimirInverso(lista, lista.tamanio());
        
    }

}