package ejer1;

import tp02.ejercicio1.*;
import java.util.Scanner;


public class Sucesion{

    public static Integer calcular(){
        if (n > 1){ /** controla que el nro sea mayor estricto que 1 antes de arrancar */
            
            if (n % 2 == 0){
                n = n/2;
            }else if (n % 2 != 0){
                n = 3*n+1;
            }
        }

        return n;
    }

    public ListaDeEnterosEnlazada calcularSucesion(int n){
        ListaDeEnterosEnlazada lista;
        if (n > 1){
           lista = calcularSucesion(calcular(n)); 
        }else if (n < 1){
            l = new ListaDeEnterosEnlazada();
        }
        lista.agregarInicio();

    }

    public static void main(String[] args){
        int nro;
        System.out.println("Ingrese un nro: ");
        nro = in.nextInt();

        calcularSucesion(nro);
    }
}