package Model.classes;

import java.sql.Date;

public class PerformanceSchedule {
    private Date startTime;
    private Date endTime;
    private Vendor vendor;
    private Stage stage;
    private Artist artist;

    public PerformanceSchedule(Date startTime, Date endTime, Vendor vendor, Stage stage, Artist artist) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.vendor = vendor;
        this.stage = stage;
        this.artist = artist;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Start : " + startTime + ", End : " + endTime + "\nVendor : " + vendor + "\nStage : " + stage + "\n Artist : " + artist + "\n";
    }
}
