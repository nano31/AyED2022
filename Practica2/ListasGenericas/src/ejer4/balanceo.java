package ejer4;

import tp02.ejercicio3.PilaGenerica;

public class balanceo {
    
    PilaGenerica<Character> pila = new PilaGenerica<Character>();
    
    public static boolean esApertura(char c){
        if ((c == '{') || (c == '[') || (c == '(')){
            return true;
        }else{
            return false;
        }
    }


    public static boolean esBalanceado(String cad){
        return true;
    }   
    
    
    public static void main(String[] args){
        String cad = "{([])([])}"; //este es un string balanceado
        String cad2 = "{[(])}"; //este no es un string balanceado
    }


}
