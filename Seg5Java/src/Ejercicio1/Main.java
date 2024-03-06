package Ejercicio1;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        empleadoDAO.agregarEmpleado(new Empleado("Martha", "Ramirez", "Femenino", LocalDate.of(1958, 5, 15), LocalDate.of(2010, 3, 20), 30000));
        empleadoDAO.agregarEmpleado(new Empleado("Monica", "Mazo", "Femenino", LocalDate.of(1985, 8, 25), LocalDate.of(2015, 7, 10), 70000));

        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. información del empleado");
            System.out.println("2. Modificar salario del empleado");
            System.out.println("3. Calcular edad del empleado");
            System.out.println("4. Calcular antigüedad del empleado");
            System.out.println("5. Calcular prestaciones del empleado");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    empleadoDAO.visualizarInformacion();
                    break;
                case 2:
                    empleadoDAO.ejecutarModificarSalario(scanner);
                    break;
                case 3:
                    empleadoDAO.ejecutarCalcularEdad(scanner);
                    break;
                case 4:
                    empleadoDAO.ejecutarCalcularAntiguedad(scanner);
                    break;
                case 5:
                    empleadoDAO.ejecutarCalcularPrestaciones(scanner);
                    break;
                case 0:
                    System.out.println("_____________");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
