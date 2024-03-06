package Ejercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ProductoPredecedero extends Producto {
    protected int fechaVencimiento;

    private List<Producto> listaProductos;

    public ProductoPredecedero() {
        super("Agua", "Agua en botella", 12, 4);
        this.fechaVencimiento = 120224;
        this.listaProductos = new ArrayList<>();
    }

    public ProductoPredecedero(String nombre, String descripcion, int precio, int stock, int fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
        this.listaProductos = new ArrayList<>();
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }



    public void modificarStock(String nombreProducto, int nuevoStock) {
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.setStock(nuevoStock);
                break;
            }
        }
    }

    public void eliminarProducto(String nombreProducto) {
        listaProductos.removeIf(producto -> producto.getNombre().equals(nombreProducto));
    }


    public void imprimirFechaVencimiento() {
        System.out.println("Fecha de vencimiento: " + getFechaVencimiento());
    }
    public void imprimirListaProductos() {
        System.out.println("Lista de productos:");
        for (Producto producto : listaProductos) {
            imprimirListaProductos(producto);
        }
    }}

