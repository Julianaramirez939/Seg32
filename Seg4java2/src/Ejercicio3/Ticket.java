package Ejercicio3;

import java.util.Scanner;

public class Ticket {
    private Client client;
    private Travel travel;
    private Asiento asiento;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Ticket(Client client, Travel travel, Asiento asiento) {
        this.client = client;
        this.travel = travel;
        this.asiento = asiento;
    }

    public void reservar(Scanner scanner) {
        System.out.print("¿Desea reservar el asiento? (si/no): ");
        String opcionReserva = scanner.next();

        if ("si".equalsIgnoreCase(opcionReserva)) {
            if (asiento.getEstado() == null || asiento.getEstado().equals("disponible")) {
                asiento.reservar();
                System.out.println("Asiento reservado exitosamente.");

                // Preguntar si desea comprar el boleto después de reservar
                System.out.print("¿Desea comprar el boleto? (si/no): ");
                String opcionCompra = scanner.next();
                comprarTicket(opcionCompra);
            } else {
                System.out.println("El asiento no está disponible.");
            }
        } else {

            System.out.println("Reserva cancelada.");
        }
    }

    public void comprarTicket(String opcionCompra) {
        if ("si".equalsIgnoreCase(opcionCompra)) {
            client.agregarCompra(this);
            System.out.println("Vuelo comprado exitosamente.");
        } else {
            System.out.println("Compra cancelada.");
        }
    }
}
