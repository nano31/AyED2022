/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5;

/**
 *
 * @author zompi
 */
public class Test {
    public static void main (String[] args){
        int[] nros = new int[]{1,2,3,4,5,6};
        String cadena = " ";
        Resultados res = new Resultados();
        
        System.out.println("Devolviendo con return");
        devolverConReturn(nros, res);
        System.out.println("Maximo: "+res.getMax()+""
                + "\nMinimo: "+res.getMin()+"\nPromedio: "+res.getPromedio());
        
        Resultados result = new Resultados();
        devolverConParametro(nros, result);
        System.out.println("Imprimo devolviendo con parametros: ");
        System.out.println("Maximo: "+result.getMax());
        System.out.println("Minimo: "+result.getMin());
        System.out.println("Promedio: "+result.getPromedio());
        
    }
    
    public static Resultados devolverConReturn(int[] nros, Resultados res){
        int min = 999, max = -1, suma = 0;
        double prom = 0;
        for (int i = 0; i < nros.length; i++) {
            if (nros[i] > max){
                max = nros[i];
            }if(nros[i] < min){
                min = nros[i];
            }
            suma += nros[i];
        }
        prom = suma/nros.length;
        res.setMax(max);
        res.setMin(min);
        res.setPromedio(prom);
        return res;
    }
    
    public static void devolverConParametro(int[] nros,Resultados r){
       r = new Resultados();
       int min = 999, max = -1, suma = 0;
       double prom = 0;
       
       for (int i = 0; i < nros.length; i++) {
    	   if (nros[i] > max) {
    		   r.setMax(max);
    	   }if(nros[i] < min) {
    		   r.setMin(min);
    	   }
    	   suma =+ nros[i];
       }
       r.setPromedio(suma/nros.length);
    }
}
