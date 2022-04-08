package ejer4;

import javax.sql.rowset.CachedRowSet;

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

    public static boolean esDeCierre(char c){
        if ((c == '}') || (c == ']') || (c == ')')){
            return true;
        }else{
            return false;
        }
    }

    public  boolean esBalanceado(String cad){
        char act, elem;
        for (int i = 0; i < cad.length(); i++ ){
            act = cad.charAt(i);
            if (esApertura(act)){
                pila.apilar(act);
            }else if (esDeCierre(act)){
                elem = pila.desapilar();
                
            }
        }
        return true;
    }   
    
    
    public static void main(String[] args){
        String cad = "{([])([])}"; //este es un string balanceado
        String cad2 = "{[(])}"; //este no es un string balanceado
    }


}
