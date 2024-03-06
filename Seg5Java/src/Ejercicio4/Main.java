package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Concesionario concesionario = new Concesionario("Yamaha", "Medellin");

        int opcion;
        do {

            System.out.println("Menú");
            System.out.println("1. Agregar Carro");
            System.out.println("2. Eliminar Carro");
            System.out.println("3. Mostrar Información del Concesionario");
            System.out.println("4. Vender Carro");
            System.out.println("5. Mostrar Carros Disponibles");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese la marca del carro: ");
                    String marca = scanner.next();
                    System.out.print("Ingrese el modelo del carro: ");
                    String modelo = scanner.next();
                    Carro nuevoCarro = new Carro(marca, modelo);
                    concesionario.agregarCarro(nuevoCarro);
                    break;

                case 2:

                    System.out.print("Ingrese la cantidad de carros a eliminar: ");
                    int cantidadEliminar = scanner.nextInt();
                    concesionario.eliminarCarro(cantidadEliminar);
                    break;

                case 3:

                    System.out.println(concesionario.getInfo());
                    break;

                case 4:

                    System.out.print("Ingrese la cantidad de carros a vender: ");
                    int cantidadVender = scanner.nextInt();
                    concesionario.venderCarro(cantidadVender);
                    break;

                case 5:

                    concesionario.mostrarCarros();
                    break;

                case 0:

                    System.out.println("Ninguna de las opciones.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}