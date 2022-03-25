/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

/**
 *
 * @author zompi
 */
public class Ej4 {
    public static void main (String[] args){
        int a = 1, b = 2;
        Integer c = 3, d = 4;
        
        swap1(a,b);
        swap2(c,d);
        
        System.out.println("a = "+a+" b = "+b);
        System.out.println("c = "+c+" d = "+d);
    }
    
    public static void swap1(int x, int y){
        if (x < y){
            int tmp = x;
            x = y;
            y = tmp;
        }
    }
    
    public static void swap2(Integer x, Integer y){
        if (x < y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        
    }
}
