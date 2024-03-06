package Ejercicio8;

import javax.swing.JOptionPane;

public class Ticket {

   private int ticketNumber;
   private String zoneType;
   private int cost;
   private boolean soldState;

   public Ticket(int ticketNumber, String zoneType, int cost, boolean soldState) {
      this.ticketNumber = ticketNumber;
      this.zoneType = zoneType;
      this.cost = cost;
      this.soldState = soldState;

      if ("General".equals(zoneType)) {
         this.cost = 50;
      } else if ("Vip".equals(zoneType)) {
         this.cost = 100;
      }
   }

   public int getTicketNumber() {
      return ticketNumber;
   }

   public void setTicketNumber(int ticketNumber) {
      this.ticketNumber = ticketNumber;
   }

   public String getZoneType() {
      return zoneType;
   }

   public void setZoneType(String zoneType) {
      this.zoneType = zoneType;
   }

   public int getCost() {
      return cost;
   }

   public void setCost(int cost) {
      this.cost = cost;
   }

   public boolean isSoldState() {
      return soldState;
   }

   public void setSoldState(boolean soldState) {
      this.soldState = soldState;
   }

   public void sellTicket(int entryCode) {
      this.soldState = true;
      JOptionPane.showMessageDialog(null, "Ticket sold:\nTicket number: " + getTicketNumber() +
              "\nZone type: " + getZoneType() + "\nCost: $" + getCost() +
              "\nEntry Code: " + entryCode);
   }

   public void income(int code) {
      if (soldState && code == ticketNumber) {
         JOptionPane.showMessageDialog(null, "Ticket " + getTicketNumber() + " income");
      } else {
         JOptionPane.showMessageDialog(null, "The ticket is not entered or the code is incorrect.");
      }
   }
}
