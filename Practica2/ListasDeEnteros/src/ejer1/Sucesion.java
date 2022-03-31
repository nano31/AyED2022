package ejer1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class Sucesion{

    public static Integer calcular(int num){
        if (num > 1){ /** controla que el nro sea mayor estricto que 1 antes de arrancar */
            
            if (num % 2 == 0){
                num = num/2;
            }else if (num % 2 != 0){
                num = 3*num+1;
            }
        }

        return num;
    }

    public ListaDeEnterosEnlazada calcularSucesion(int n){
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        if (n > 1){
           lista = calcularSucesion(calcular(n)); 
        }else if (n < 1){
            lista = new ListaDeEnterosEnlazada();
        }
        lista.agregarInicio(n);
        return lista;

    }

    public static void main(String[] args){
        int nro;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un nro: ");
        nro = in.nextInt();

        calcularSucesion(nro);
    }
}