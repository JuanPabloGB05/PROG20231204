package Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * En una clase llamada Ejercicio2 pon a prueba el método anterior pasándole palabras extraídas de líneas 
 * leídas por teclado, entendiendo por palabra cualquier secuencia de caracteres que no contenta espacios 
 * en blanco. El usuario podrá introducir tantas líneas como quiera hasta finalizar el programa pulsando 
 * ctrl+z.
 */

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.print("> ");
		while (!(linea = in.readLine()).equalsIgnoreCase("ctrl+z"))
			System.out.print(primeroQueNoSeRepite(linea) + "\n> ");
			

	}
	
	static char primeroQueNoSeRepite(String s) {
		int i = 0;
		while (i < s.length() && (i != s.indexOf(s.charAt(i)) || i != s.lastIndexOf(s.charAt(i))))
			i++;
		return s.charAt(i);
	}
	
}
