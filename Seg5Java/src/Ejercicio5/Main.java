package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TurnoDAO turnoDAO = new TurnoDAO();
        turnoDAO.agregarTurno(new Turno("09:00", "12:00", "Turno normal"));
        turnoDAO.agregarTurno(new Turno("1:00", "1:00", "Turno extra"));

        int opcion;
        do {

            System.out.println("Menú");
            System.out.println("1. Agregar Turno");
            System.out.println("2. Mostrar Turnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese la hora de inicio: ");
                    String horaInicio = scanner.next();
                    System.out.print("Ingrese la hora de fin: ");
                    String horaFin = scanner.next();
                    scanner.nextLine();
                    System.out.print("Ingrese la descripción del turno: ");
                    String descripcion = scanner.nextLine();
                    Turno nuevoTurno = new Turno(horaInicio, horaFin, descripcion);
                    turnoDAO.agregarTurno(nuevoTurno);
                    break;

                case 2:

                    turnoDAO.mostrarTurnos();
                    break;

                case 0:

                    System.out.println("Ninguna de las opciones");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}