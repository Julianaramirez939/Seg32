package Ejercicio6;

public class Pelicula {
    private String titulo;
    private String protagonista;
    private String director;
    private float precio;

    public Pelicula(String titulo, String protagonista, String director, float precio) {
        this.titulo = titulo;
        this.protagonista = protagonista;
        this.director = director;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", protagonista='" + protagonista + '\'' +
                ", director='" + director + '\'' +
                ", precio=" + precio +
                '}';
    }
}
