package ejer4;

import tp02.ejercicio3.*;

public class Ejer4 {
	
	PilaGenerica<Character> pila = new PilaGenerica<Character>();
	
	public static Character StringPop(StringBuffer str) {
		if (str.length() == 0) {
			return Character.MIN_VALUE;
		}
		Character c = str.charAt(0);
		str.deleteCharAt(0);
		return c;
	}
	
	public static boolean evaluar (char apertura, char cierre) {
		switch (apertura) {
		case '[': return cierre == ']';
			
		case '(': return cierre == ')';
			
		case '{': return cierre == '}';
			
		default: return false;
			
		}
	}
	
	public boolean esApertura(char caracter) {
		return ((caracter == '{') || (caracter == '[') || (caracter == '('));
	}
	
	public boolean esBalanceado(StringBuffer str) {
		
		if (str.isEmpty()){
			return true;
		}
		
		boolean balanceado = true;
		
		while(balanceado) {
			char car = StringPop(str);
			if(esApertura(str.charAt(0))) {
				pila.apilar(car);
				esBalanceado(str);
			}else if (!pila.vacia()) {
					char aper = pila.desapilar(); 
					balanceado = evaluar(aper, car);
				
			}
		}
		
		return balanceado;
	}
	
	public static void main (String[] args) {
		StringBuffer cad;
		Ejer4 f = new Ejer4();
		
		
		if (f.esBalanceado(cad = new StringBuffer("{()[()]}"))) {
			System.out.println("Balanceado");
		}else {
			System.out.println("Desbalanceado");
		}
		
	}
	
	
	
	
}
