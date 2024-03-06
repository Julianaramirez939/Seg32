package Ejercicio3;
import java.util.List;
import java.util.ArrayList;

public class Train {
    private int numero;
    private String ruta;
    private List<Wagon> listaVagones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public List<Wagon> getListaVagones() {
        return listaVagones;
    }

    public void setListaVagones(List<Wagon> listaVagones) {
        this.listaVagones = listaVagones;
    }

    public Train() {
        this.listaVagones = new ArrayList<>();

    }
    public Wagon obtenerWagon(String tipo) {

        return null;


}}
