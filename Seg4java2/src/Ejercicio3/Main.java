package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client cliente = new Client("Luisa", "6844", "Bogotá");
        Train tren = new Train();
        Wagon vagon = new Wagon();
        Asiento asiento = new Asiento();
        Travel viaje = new Travel();
        viaje.setFecha("2024-03-05");
        viaje.setHoraSalida("08:00 AM");
        viaje.setHoraLlegada("12:00 PM");


        Ticket boleto = new Ticket(cliente, viaje, asiento);


        Scanner scanner = new Scanner(System.in);


        boleto.reservar(scanner);


        System.out.println("Información de la reserva:");
        System.out.println("Cliente: " + boleto.getClient().getName());
        System.out.println("Viaje: " + boleto.getTravel().getFecha());
        System.out.println("Asiento: " + boleto.getAsiento().getNumero());


        System.out.print("¿Desea comprar el boleto? (si/no): ");
        String opcionCompra = scanner.next();
        boleto.comprarTicket(opcionCompra);


        if ("si".equalsIgnoreCase(opcionCompra)) {
            System.out.println("Información de la compra:");
            System.out.println("Cliente: " + boleto.getClient().getName());
            System.out.println("Viaje: " + boleto.getTravel().getFecha());
            System.out.println("Asiento: " + boleto.getAsiento().getNumero());
            System.out.println("Vuelo comprado exitosamente.");
        } else {
            System.out.println("Compra cancelada.");
        }


        scanner.close();
    }
}