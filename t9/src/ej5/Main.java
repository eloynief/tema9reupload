package ej5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productos = new HashMap<>();

        int opcion;
        do {
            opcion = mostrarMenu(scanner);
            switch (opcion) {
                case 1:
                    altaProducto(scanner, productos);
                    break;
                case 2:
                    bajaProducto(scanner, productos);
                    break;
                case 4:
                    listarExistencias(productos);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Introduce un número válido.");
            }
        } while (opcion != 0);
    }

    private static int mostrarMenu(Scanner scanner) {
        System.out.println("PRODUCTOS");
        System.out.println("1. Alta de producto");
        System.out.println("2. Baja de producto");
        System.out.println("4. Listar existencias");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void altaProducto(Scanner scanner, Map<String, Double> productos) {
        System.out.print("Introduce el nombre del producto: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya existe.");
        } else {
            System.out.print("Introduce el precio del producto: ");
            try {
                double precio = Double.parseDouble(scanner.nextLine());
                productos.put(nombre, precio);
                System.out.println("Producto añadido correctamente.");
            } catch (NumberFormatException e) {
                System.out.println("Precio inválido. Introduce un número válido.");
            }
        }
    }

    private static void bajaProducto(Scanner scanner, Map<String, Double> productos) {
        System.out.print("Introduce el nombre del producto: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    private static void listarExistencias(Map<String, Double> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("Existencias de productos:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String nombre = entry.getKey();
                double precio = entry.getValue();
                System.out.println(nombre + ": " + precio + " €");
            }
        }
    }
}
