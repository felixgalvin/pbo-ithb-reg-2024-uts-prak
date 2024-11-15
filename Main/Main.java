package Main;

import java.sql.Date;

import Model.classes.Band;
import Model.classes.PerformanceSchedule;
import Model.classes.SoloArtist;
import Model.classes.Stage;
import Model.classes.Ticket;
import Model.classes.Vendor;
import Model.enums.Genre;
import Model.enums.TicketType;
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        // data dummy
        Stage stage1 = new Stage("GBK", 300, "Jl. Kopo");
        Stage stage2 = new Stage("Stadion Bung Karno", 500, "Jl. Merdeka");

        Vendor vendor1 = new Vendor("Enrico", "Sound System", 2000000);
        Vendor vendor2 = new Vendor("Magnify", "Multimedia Team", 5000000);

        SoloArtist solo = new SoloArtist("Andre", Genre.CLASSICAL, 5000000, "Kalvin");
        SoloArtist solo2 = new SoloArtist("Taulany", Genre.JAZZ_AND_BLUES, 6000000, "Memet");
        Band band = new Band("Dewa19", Genre.POP, 7000000, 5);
        Band band2 = new Band("Fanky", Genre.ROCK, 8000000, 6);

        PerformanceSchedule schedule1 = new PerformanceSchedule(Date.valueOf("2024-10-01"), Date.valueOf("2024-12-01"), vendor1, stage1, solo);
        PerformanceSchedule schedule2 = new PerformanceSchedule(Date.valueOf("2024-09-01"), Date.valueOf("2024-10-01"), vendor1, stage1, solo2);
        PerformanceSchedule schedule3 = new PerformanceSchedule(Date.valueOf("2024-11-01"), Date.valueOf("2024-13-01"), vendor2, stage2, band);
        PerformanceSchedule schedule4 = new PerformanceSchedule(Date.valueOf("2024-03-01"), Date.valueOf("2024-05-01"), vendor2, stage2, band2);

        Ticket regular = new Ticket(TicketType.REGULAR, 150000, "80", schedule1);
        Ticket vip = new Ticket(TicketType.VIP, 350000, "30", schedule2);
        Ticket invitation = new Ticket(TicketType.INVITATION, 10000, "60", schedule3);
        Ticket invitation2 = new Ticket(TicketType.INVITATION, 10000, "70", schedule4);

        // asumsi dijumlah semua
        regular.calculatePayment(regular.getTicketPrice(), vendor1.getVendorFee(), solo.getPerformanceFee());
        vip.calculatePayment(regular.getTicketPrice(), vendor1.getVendorFee(), solo.getPerformanceFee()); 
        invitation.calculatePayment(regular.getTicketPrice(), vendor1.getVendorFee(), solo.getPerformanceFee());

        System.out.println(Controller.generateRevenueReport(regular.calculatePayment(regular.getTicketPrice(), vendor1.getVendorFee(), solo.getPerformanceFee()), vip.calculatePayment(regular.getTicketPrice(), vendor1.getVendorFee(), solo.getPerformanceFee()), invitation.calculatePayment(regular.getTicketPrice(), vendor1.getVendorFee(), solo.getPerformanceFee())));
    }
} 