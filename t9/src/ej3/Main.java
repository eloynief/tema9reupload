package ej3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<String> nombres = new TreeSet<>();

		String nombre;
		while (true) {
			System.out.print("Introduce un nombre (o 'fin' para terminar): ");
			nombre = scanner.nextLine();

			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}

			nombres.add(nombre);
		}

		System.out.println("Colección de nombres:");
		for (String n : nombres) {
			System.out.println(n);
		}
	}
}
