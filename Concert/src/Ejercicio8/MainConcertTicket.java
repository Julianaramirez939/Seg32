package Ejercicio8;

import javax.swing.JOptionPane;

public class MainConcertTicket {
    public static void main(String[] args) {

        Concert concert = new Concert(50, 30, 50,30);


        Ticket ticketGeneral = new Ticket(1, "General", 50, false);
        Ticket ticketVIP = new Ticket(101, "Vip", 100, false);

        int option = Integer.parseInt(JOptionPane.showInputDialog("Select an option:\n1. See available tickets\n2. Buy tickets\n3. Verify entry of tickets"));

        switch (option) {
            case 1:

                concert.checkAvailability();
                JOptionPane.showMessageDialog(null, "Option 1: See available tickets");
                break;
            case 2:

                String zoneType = JOptionPane.showInputDialog("Enter the zone (GENERAL or VIP):");
                int quantityBuys = Integer.parseInt(JOptionPane.showInputDialog("Number of tickets:"));


                Ticket ticketToSell = new Ticket(1, zoneType, 50, true);


                concert.sellTicket(ticketToSell, quantityBuys);
                JOptionPane.showMessageDialog(null, "Option 2: Buy tickets");
                break;
            case 3:

                int entryCode = Integer.parseInt(JOptionPane.showInputDialog("Enter the ticket code:"));


                ticketGeneral.income(entryCode);
                JOptionPane.showMessageDialog(null, "Option 3: Verify entry of tickets");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option");
        }
    }
}