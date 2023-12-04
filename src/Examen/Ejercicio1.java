package Examen;

/*
 * Define en una clase llamada Ejercicio1 un método estático que acepte un String y, sin usar sentencias re-
 * petitivas, retorne otro String como resultado de sustituir en el primero todos los caracteres por asteris-
 * cos, excepto el primero y el último.
 */

public class Ejercicio1 {
	public static void main(String[] args) {
	        String frase = "A la vibora vibora de la mar, de la mar";
	        String resultado = sustituirCaracteres(frase);
	        System.out.println(resultado);
	    }
	public static String sustituirCaracteres(String frase) {
        if (frase == null || frase.length() < 2) {
            return frase;
        }
        char primerCaracter = frase.charAt(0);
        char ultimoCaracter = frase.charAt(frase.length() - 1);

        String resultado = primerCaracter + "*".repeat(frase.length() - 2) + ultimoCaracter;

        return resultado;
    }
 }