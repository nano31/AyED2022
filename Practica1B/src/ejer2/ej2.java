/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;
import java.util.Scanner;
/**
 *
 * @author zompi
 */
public class ej2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] arreglo;
        int n;
        
        System.out.println("Ingrese un numero: ");
        n = in.nextInt();
        arreglo = new int[n];
        
        devolverArreglo(n, arreglo);
        imprimirArreglo(n,arreglo);
    }
    
    public static void devolverArreglo(int n, int[] arreglo) {
        for (int i = 0; i < n; i++) {
            arreglo[i] = n*(i+1);
        }
    }
    
    public static void imprimirArreglo(int n,int[] arreglo){
        for (int i = 0; i < n; i++) {
            System.out.println("Pos "+i+" = "+ arreglo[i]);
        }
    }
}
