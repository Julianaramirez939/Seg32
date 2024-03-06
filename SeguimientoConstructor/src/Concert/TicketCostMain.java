package Concert;
import java.util.Scanner;

public class TicketCostMain {
    public static void main(String[] args) {

        TicketConcert concierto = new TicketConcert(1, "general", 50, 60);

        System.out.println("Disponibilidad de entradas: " + concierto.getAvailableTickets());

        concierto.procesarOpcion();

        System.out.println("Disponibilidad de entradas: " + concierto.getAvailableTickets());


        int cantidadVenta = 60;
        if (concierto.ticketsAvailable(cantidadVenta)) {
            concierto.venderTicket(cantidadVenta);
            System.out.println("Venta exitosa de " + cantidadVenta + " boletos.");
        } else {
            System.out.println("No hay suficientes entradas disponibles para la venta de " + cantidadVenta + " boletos.");
        }
    }
}