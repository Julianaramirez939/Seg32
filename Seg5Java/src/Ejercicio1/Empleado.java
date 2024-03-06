package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    public String nombre;
    public String apellido;
    public String genero;
    public LocalDate fechaNacimiento;
    public LocalDate fechaIngreso;
    public double salarioBasico;

    public Empleado(String nombre, String apellido, String genero, LocalDate fechaNacimiento, LocalDate fechaIngreso, double salarioBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.salarioBasico = salarioBasico;
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int calcularAntiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salarioBasico) / 12;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                "\nGénero: " + genero +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nFecha de ingreso: " + fechaIngreso +
                "\nSalario básico: " + salarioBasico;
    }
}