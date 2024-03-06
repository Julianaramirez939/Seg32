package Ejercicio3;
import java.util.List;
import java.util.ArrayList;

public class Client extends Person{
    private List<Ticket> historialCompras;

    public Client(String name, String id, String address) {
        super(name, id, address);
        this.historialCompras = new ArrayList<>();
    }

    public List<Ticket> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(List<Ticket> historialCompras) {
        this.historialCompras = historialCompras;
    }

    public void agregarCompra(Ticket ticket) {
        historialCompras.add(ticket);
    }
}
