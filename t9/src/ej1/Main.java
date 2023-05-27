package ej1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	 public static void main(String[] args) {
	        Set<Integer> numeros = new TreeSet<>();

	        while (numeros.size() < 20) {
	            int numeroAleatorio = generarNumeroAleatorio();
	            numeros.add(numeroAleatorio);
	        }

	        System.out.println("Colección de números ordenados:");
	        for (int numero : numeros) {
	            System.out.println(numero);
	        }
	    }
	 	
	    private static int generarNumeroAleatorio() {
	        int random= (int) (Math.random()*100);
	        return random;
	    }
}
