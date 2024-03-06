package Ejercicio8;

import javax.swing.JOptionPane;

public class Concert {
    private int maximumTicketsGeneral;
    private int maximumTicketsVip;
    private int generalTicketsD;
    private int vipTicketsD;

    public int getMaximumTicketsGeneral() {
        return maximumTicketsGeneral;
    }

    public void setMaximumTicketsGeneral(int maximumTicketsGeneral) {
        this.maximumTicketsGeneral = maximumTicketsGeneral;
    }

    public int getMaximumTicketsVip() {
        return maximumTicketsVip;
    }

    public void setMaximumTicketsVip(int maximumTicketsVip) {
        this.maximumTicketsVip = maximumTicketsVip;
    }

    public int getGeneralTicketsD() {
        return generalTicketsD;
    }

    public void setGeneralTicketsD(int generalTicketsD) {
        this.generalTicketsD = generalTicketsD;
    }

    public int getVipTicketsD() {
        return vipTicketsD;
    }

    public void setVipTicketsD(int vipTicketsD) {
        this.vipTicketsD = vipTicketsD;
    }

    public Concert(int maximumTicketsGeneral, int maximumTicketsVip, int generalTicketsD, int vipTicketsD) {
        this.maximumTicketsGeneral = maximumTicketsGeneral;
        this.maximumTicketsVip = maximumTicketsVip;
        this.generalTicketsD = generalTicketsD;
        this.vipTicketsD = vipTicketsD;
    }

    public void checkAvailability() {
        JOptionPane.showMessageDialog(null, "Tickets available:\nGeneral: " + getGeneralTicketsD() + "\nVip: " + getVipTicketsD());
    }

    public void sellTicket(Ticket ticket, int quantity) {
        switch (ticket.getZoneType()) {
            case "General":
                if (getGeneralTicketsD() >= quantity) {
                    generalTicketsD -= quantity;
                    JOptionPane.showMessageDialog(null, "Sale made:\n" + quantity + " general tickets.");
                } else {
                    JOptionPane.showMessageDialog(null, "No tickets available.");
                }
                break;
            case "Vip":
                if (getVipTicketsD() >= quantity) {
                    vipTicketsD -= quantity;
                    JOptionPane.showMessageDialog(null, "Sale made:\n" + quantity + " VIP tickets.");
                } else {
                    JOptionPane.showMessageDialog(null, "No tickets available.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid zone");
        }
    }
}
