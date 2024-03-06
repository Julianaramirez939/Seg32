package Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class EmpleadoDAO {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void visualizarInformacion() {
        System.out.println("Información de empleados: ");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }

    public void modificarSalario(int indice, double nuevoSalario) {
        empleados.get(indice).salarioBasico = nuevoSalario;
        System.out.println("Salario actualizado");
    }

    public void calcularEdad(int indice) {
        int edad = empleados.get(indice).calcularEdad();
        System.out.println("Edad del empleado: " + edad + " años.");
    }

    public void calcularAntiguedad(int indice) {
        int antiguedad = empleados.get(indice).calcularAntiguedad();
        System.out.println("Antigüedad del empleado: " + antiguedad + " años.");
    }

    public void calcularPrestaciones(int indice) {
        double prestaciones = empleados.get(indice).calcularPrestaciones();
        System.out.println("Prestaciones del empleado: $" + prestaciones);
    }


    public void ejecutarModificarSalario(Scanner scanner) {
        System.out.println("Modificar salario del empleado:");
        System.out.print("Ingrese el índice del empleado: ");
        int indice = scanner.nextInt();
        System.out.print("Ingrese el nuevo salario: ");
        double nuevoSalario = scanner.nextDouble();
        modificarSalario(indice, nuevoSalario);
    }

    public void ejecutarCalcularEdad(Scanner scanner) {
        System.out.println("Calcular edad del empleado:");
        System.out.print("Ingrese el índice del empleado: ");
        int indice = scanner.nextInt();
        calcularEdad(indice);
    }

    public void ejecutarCalcularAntiguedad(Scanner scanner) {
        System.out.println("Calcular antigüedad del empleado:");
        System.out.print("Ingrese el índice del empleado: ");
        int indice = scanner.nextInt();
        calcularAntiguedad(indice);
    }

    public void ejecutarCalcularPrestaciones(Scanner scanner) {
        System.out.println("Calcular prestaciones del empleado:");
        System.out.print("Ingrese el índice del empleado: ");
        int indice = scanner.nextInt();
        calcularPrestaciones(indice);
    }
}
