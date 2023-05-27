package ej4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new TreeSet<>();
        Set<Integer> estrellas = new TreeSet<>();
        Map<Integer, Integer> registroNumeros = new HashMap<>();
        Map<Integer, Integer> registroEstrellas = new HashMap<>();

        // Pedir al usuario que introduzca los 5 números del último sorteo
        System.out.println("Introduce los 5 números del último sorteo del Euromillón:");
        for (int i = 0; i < 5; i++) {
            int numero = pedirNumero(scanner);
            numeros.add(numero);
            incrementarRegistro(registroNumeros, numero);
        }

        // Pedir al usuario que introduzca las 2 estrellas del último sorteo
        System.out.println("Introduce las 2 estrellas del último sorteo del Euromillón:");
        for (int i = 0; i < 2; i++) {
            int estrella = pedirNumero(scanner);
            estrellas.add(estrella);
            incrementarRegistro(registroEstrellas, estrella);
        }

        // Mostrar el registro de números
        System.out.println("Registro de números:");
        for (int numero : numeros) {
            int veces = registroNumeros.get(numero);
            System.out.println(numero + ": " + veces + " veces");
        }

        // Mostrar el registro de estrellas
        System.out.println("Registro de estrellas:");
        for (int estrella : estrellas) {
            int veces = registroEstrellas.get(estrella);
            System.out.println(estrella + ": " + veces + " veces");
        }
    }

    private static int pedirNumero(Scanner scanner) {
        while (true) {
            System.out.print("Introduce un número: ");
            try {
                int numero = Integer.parseInt(scanner.nextLine());
                if (numero >= 1 && numero <= 50) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre 1 y 50.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Introduce un número válido.");
            }
        }
    }

    private static void incrementarRegistro(Map<Integer, Integer> registro, int numero) {
        registro.put(numero, registro.getOrDefault(numero, 0) + 1);
    }
}

