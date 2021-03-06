package ejer1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class Sucesion{

    public static int calcularSucesion(int num){
       
    	if (num > 1){ /** controla que el nro sea mayor estricto que 1 antes de arrancar */    
            if (num % 2 == 0){
                num = num/2;
               // System.out.println("Resultado: "+ num);
                calcularSucesion(num);
            }else if (num % 2 != 0){
                num = 3*num+1;
                //System.out.println("Resultado: "+ num);
            	calcularSucesion(num);
            }
        }
        return num;
    }
    
    public ListaDeEnterosEnlazada armarLista(int num){
        ListaDeEnterosEnlazada l;
        if (num > 1) {
            l = armarLista(calcularSucesion(num));
        }else{
            l = new ListaDeEnterosEnlazada();
        }
        l.agregarInicio(num);
        return l;
    }

    public static void main(String[] args){
        Sucesion f = new Sucesion();
        int nro;
        Scanner in = new Scanner(System.in);        
        
        System.out.println("Ingrese un nro: ");
        nro = in.nextInt();
        
        ListaDeEnterosEnlazada l = f.armarLista(nro);
        
    }
}