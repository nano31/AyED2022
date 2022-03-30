package ejer1;

import tp02.ejercicio1.*; 
import java.util.Scanner;


public class ImprimirListaInversa{

    public static void imprimirInverso(ListaDeEnterosEnlazada l){
        int tam = l.tamanio();
        if (!l.fin()){
            l.elemento(tam);
            tam--;
            imprimirInverso(l);
        }else{
            System.out.println(l.elemento(tam));
        }
    }


    public static void main (String[] args){
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        lista.comenzar();

        


    }

}