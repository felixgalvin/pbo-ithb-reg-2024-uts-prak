package Model.classes;

import Model.enums.TicketType;
import Model.interfaces.Payable;

public class Ticket implements Payable{
    private TicketType ticketType;
    private double ticketPrice;
    private String ticketNumber;
    private PerformanceSchedule schedule;

    public Ticket(TicketType ticketType, double ticketPrice, String ticketNumber, PerformanceSchedule schedule) {
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketNumber = ticketNumber;
        this.schedule = schedule;
    }
    
    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public PerformanceSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(PerformanceSchedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Ticket Type : " + ticketType + ", Ticket Price : " + ticketPrice + ", Ticket Number : " + ticketNumber + "\nSchedule : " + schedule;
    }

    @Override
    public void calculatePayment(double price, double performance, double vendor) {
        double total = price + performance + vendor;
        System.out.println("Total Biaya : " + total);
    }
}
