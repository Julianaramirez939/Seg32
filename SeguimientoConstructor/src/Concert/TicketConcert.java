package Concert;
import java.util.Scanner;

public class TicketConcert {
    private int numberTicket;
    private String zone;
    private int cost;
    private int availableTickets;
    private int nextTicketNumber;

    public TicketConcert(int numberTicket, String zone, int cost, int totalTickets) {
        this.numberTicket = numberTicket;
        this.zone = zone;
        this.cost = cost;
        this.availableTickets = totalTickets;
        this.nextTicketNumber = 1;
    }

    public TicketConcert(String zone, int totalTickets){
        this.zone = zone;
        this.availableTickets = totalTickets;
        this.nextTicketNumber = 1;
    }

    public boolean ticketsAvailable(int cantidad) {
        return cantidad <= availableTickets;
    }

    public void venderTicket(int cantidad) {
        if (ticketsAvailable(cantidad)) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Venta de entrada en zona " + zone + ". Su número de ingreso es " + nextTicketNumber);
                nextTicketNumber++;
            }

            availableTickets -= cantidad;
        } else {
            System.out.println("No hay suficientes entradas disponibles en la zona.");
        }
    }

    public void ingresarCodigo(Integer ticketNumber) {
        int intTicketNumber = (ticketNumber);

        if (intTicketNumber == 1) {
            System.out.println("¡Registrado con éxito!");
        } else if (intTicketNumber > 0 && intTicketNumber < nextTicketNumber) {
            System.out.println("Ingreso exitoso para el número de ingreso " + ticketNumber);
        } else {
            System.out.println("Este número de ingreso no es válido o ya ha sido utilizado.");
        }
    }

    public void procesarOpcion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción: disponibilidad, compra, ingreso");
        String option = scanner.nextLine();

        switch (option.toLowerCase()) {
            case "disponibilidad":
                System.out.println("Ingrese la cantidad de boletos a verificar:");
                int cantidadDisponibilidad = scanner.nextInt();
                boolean disponibles = ticketsAvailable(cantidadDisponibilidad);
                System.out.println("Boletos disponibles: " + disponibles);
                break;
            case "compra":
                System.out.println("Ingrese la cantidad de boletos a comprar:");
                int cantidadCompra = scanner.nextInt();
                venderTicket(cantidadCompra);
                break;
            case "ingreso":
                System.out.println("Ingrese el número de ingreso:");
                scanner.nextLine();
                Integer numeroIngreso = scanner.nextInt();
                ingresarCodigo(numeroIngreso);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}
