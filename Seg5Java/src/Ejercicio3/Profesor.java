package Ejercicio3;

public class Profesor {
    private String nombre;
    private String materia;
    private int edad;

    public Profesor(String nombre, String materia, int edad) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
    }
    public String getInfo(){
        return "Nombre: "+nombre+ ",Materia: "+materia+ "Edad: "+edad;
    }
}
