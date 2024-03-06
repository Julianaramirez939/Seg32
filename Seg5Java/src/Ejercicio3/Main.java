package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro ("El principito", "Antoine de Sanint-Exupery",45);
        Estudiante estudiante = new Estudiante ("Martha",13,"Literatura");
        Profesor profesor = new Profesor ("Darwin","Literatura",36);

        System.out.println(libro.getInfo());
        System.out.println(estudiante.getInfo());
        System.out.println(profesor.getInfo());
    }

}
