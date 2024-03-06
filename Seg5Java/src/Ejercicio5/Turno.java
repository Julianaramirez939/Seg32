package Ejercicio5;

public class Turno {
    private String HoraIncio;
    private String HoraFin;
    private String descripcion;

    public Turno(String horaIncio, String horaFin, String descripcion) {
        HoraIncio = horaIncio;
        HoraFin = horaFin;
        this.descripcion = descripcion;
    }

    public String getHoraIncio() {
        return HoraIncio;
    }

    public void setHoraIncio(String horaIncio) {
        HoraIncio = horaIncio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
