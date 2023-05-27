package ej4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> numeros = new TreeSet<>();
		TreeSet<Integer> estrellas = new TreeSet<>();
		HashMap<Integer, Integer> registroNumeros = new HashMap<>();
		HashMap<Integer, Integer> registroEstrellas = new HashMap<>();
		// Pedir al usuario que introduzca los 5 números del último sorteo
		System.out.println("Introduce los 5 números del último sorteo del Euromillón:");
		for (int i = 0; i < 5; i++) {
			int numero = sc.nextInt();
			if (numero >= 1 && numero <= 50) {
				numeros.add(numero);
				incrementarRegistro(registroNumeros, numero);
			} else {
				System.out.println("El número debe estar entre 1 y 50.");
				i--;
			}

		}

		// Pedir al usuario que introduzca las 2 estrellas del último sorteo
		System.out.println("Introduce las 2 estrellas del último sorteo del Euromillón:");
		for (int i = 0; i < 2; i++) {
			int estrella = sc.nextInt();
			if (estrella >= 1 && estrella <= 50) {
				estrellas.add(estrella);
				incrementarRegistro(registroEstrellas, estrella);
			} else {
				System.out.println("El número debe estar entre 1 y 50.");
				i--;
			}

		}

		// Muestra el registro de números
		System.out.println("Registro de números:");
		for (int numero : numeros) {
			int veces = registroNumeros.get(numero);
			System.out.println(numero + ": " + veces + " veces");
		}

		// Muestra el registro de estrellas
		System.out.println("Registro de estrellas:");
		for (int estrella : estrellas) {
			int veces = registroEstrellas.get(estrella);
			System.out.println(estrella + ": " + veces + " veces");
		}
	}

	private static void incrementarRegistro(HashMap<Integer, Integer> registro, int numero) {
		registro.put(numero, registro.getOrDefault(numero, 0) + 1);
	}
}
