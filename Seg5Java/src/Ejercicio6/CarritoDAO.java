package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class CarritoDAO {
    private List<Libro> libros;
    private List<Pelicula> peliculas;
    private float totalVentas;

    public CarritoDAO() {
        this.libros = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.totalVentas = 0;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void registrarVenta(Libro libro) {
        totalVentas += libro.getPrecio();
        libros.remove(libro);
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros Disponibles: ");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("------------------------------------------");
    }

    public void mostrarTotalVentas() {
        System.out.println("Total de Ventas: $" + totalVentas);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void registrarVenta(Pelicula pelicula) {
        totalVentas += pelicula.getPrecio();
        peliculas.remove(pelicula);
    }

    public void mostrarPeliculasDisponibles() {
        System.out.println("Películas Disponibles: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("________");
    }
}