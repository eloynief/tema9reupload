package ej2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<>();

		String nombre;
		while (true) {
			System.out.print("Introduce un nombre (o 'fin' para terminar): ");
			nombre = scanner.nextLine();

			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}

			if (!nombres.contains(nombre)) {
				nombres.add(nombre);
			} else {
				System.out.println("El nombre ya existe en la colección. Introduce otro nombre.");
			}
		}

		System.out.println("Colección de nombres:");
		for (String n : nombres) {
			System.out.println(n);
		}
	}
}
