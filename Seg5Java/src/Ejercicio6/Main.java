package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoDAO carrito = new CarritoDAO();

        int opcion;
        do {

            System.out.println("Menú");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Película");
            System.out.println("3. Registrar Venta de Libro");
            System.out.println("4. Registrar Venta de Película");
            System.out.println("5. Mostrar Libros Disponibles");
            System.out.println("6. Mostrar Películas Disponibles");
            System.out.println("7. Mostrar Total de Ventas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una de las opciones: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.next();
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.next();
                    System.out.print("Ingrese el precio del libro: ");
                    float precioLibro = scanner.nextFloat();
                    Libro nuevoLibro = new Libro(autorLibro, tituloLibro, precioLibro);
                    carrito.agregarLibro(nuevoLibro);
                    break;

                case 2:

                    System.out.print("Ingrese el título de la película: ");
                    String tituloPelicula = scanner.next();
                    System.out.print("Ingrese el protagonista de la película: ");
                    String protagonistaPelicula = scanner.next();
                    System.out.print("Ingrese el director de la película: ");
                    String directorPelicula = scanner.next();
                    System.out.print("Ingrese el precio de la película: ");
                    float precioPelicula = scanner.nextFloat();
                    Pelicula nuevaPelicula = new Pelicula(tituloPelicula, protagonistaPelicula, directorPelicula, precioPelicula);
                    carrito.agregarPelicula(nuevaPelicula);
                    break;

                case 3:

                    carrito.mostrarLibrosDisponibles();
                    System.out.print("Ingrese el índice del libro a vender: ");
                    int indiceLibro = scanner.nextInt();
                    if (indiceLibro >= 0 && indiceLibro < carrito.getLibros().size()) {
                        carrito.registrarVenta(carrito.getLibros().get(indiceLibro));
                        System.out.println("Venta registrada con éxito.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:

                    carrito.mostrarPeliculasDisponibles();
                    System.out.print("Ingrese el índice de la película a vender: ");
                    int indicePelicula = scanner.nextInt();
                    if (indicePelicula >= 0 && indicePelicula < carrito.getPeliculas().size()) {
                        carrito.registrarVenta(carrito.getPeliculas().get(indicePelicula));
                        System.out.println("Venta registrada con éxito.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:

                    carrito.mostrarLibrosDisponibles();
                    break;

                case 6:

                    carrito.mostrarPeliculasDisponibles();
                    break;

                case 7:

                    carrito.mostrarTotalVentas();
                    break;

                case 0:

                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}


