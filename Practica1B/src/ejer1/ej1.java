/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author zompi
 */
public class ej1 {
    
    public static void main(String[] args){
        int a = 3, b = 5;
        
        System.out.println("Imprimir con For: ");
        imprimirConFor(a,b);
        
        System.out.println("Imprimir con While: ");
        imprimirConWhile(a,b);
        
        System.out.println("Imprimir sin iteración: ");
        imprimirSinIteracion(a,b);
    }
    
    public static void imprimirConFor(int a, int b){
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
    
    public static void imprimirConWhile(int a, int b){
        int i = a;
        while (i <= b){
            System.out.println(i);
            i++;
        }
    }
    
    public static void imprimirSinIteracion(int a, int b){
        int i = a;
        if (i <= b){
            System.out.println(i);
            i++;
            imprimirSinIteracion(i,b);   
        }
    }
}
