package Ejercicio4;


public class MainProducto {
    public static void main(String[] args) {
        ProductoPredecedero productopredecedero1 = new ProductoPredecedero("Carne", "Carne de cerdo", 599, 100, 120224);
        ProductoPredecedero productopredecedero = new ProductoPredecedero("Salchicha", "Salchicha ranchera", 299, 50, 120324);


        productopredecedero1.imprimirListaProductos();
        productopredecedero.imprimirListaProductos();


        productopredecedero1.modificarStock("Carne", 20);


        productopredecedero1.imprimirListaProductos();


        productopredecedero1.eliminarProducto("Carne");


        productopredecedero1.imprimirListaProductos();
    }
}
