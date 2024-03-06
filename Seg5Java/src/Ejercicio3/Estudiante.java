package Ejercicio3;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    public String getInfo(){
        return "Estudiante: " +nombre+ ",Edad: "+edad+ ",Curso: " +curso;
    }
}
