
package Ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private String nombre;
    private String direccion;
    private List<Carro> carros;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.carros = new ArrayList<>();
    }

    public void agregarCarro(Carro carro) {
        carros.add(carro);
        System.out.println("Carro agregado al inventario.");
    }

    public void eliminarCarro(int cantidad) {
        carros.removeIf(carro -> carros.indexOf(carro) < cantidad);
        System.out.println("Carros eliminados del inventario.");
    }

    public String getInfo() {
        return "Nombre: " + nombre + "\nDirección: " + direccion +
                "\nCantidad de carros disponibles: " + carros.size();
    }

    public boolean venderCarro(int cantidad) {
        if (cantidad > 0 && cantidad <= carros.size()) {
            System.out.println("Venta realizada con éxito.");
            return true;
        } else {
            System.out.println("No hay suficientes carros disponibles para vender.");
            return false;
        }
    }

    public void mostrarCarros() {
        System.out.println("Cantidad de carros disponibles: " + carros.size());
        System.out.println("Detalles de los carros:");

        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}