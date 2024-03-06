package Ejercicio3;
import java.util.List;
import java.util.ArrayList;
public class Wagon {
    private String tipo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(List<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public Wagon() {
        this.listaAsientos = new ArrayList<>();

    }
    public Asiento obtenerAsiento(int numero) {

        return null;
    }
}
