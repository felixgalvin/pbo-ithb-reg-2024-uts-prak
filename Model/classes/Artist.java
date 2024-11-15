package Model.classes;

import Model.enums.*;

public abstract class Artist {
    private String name;
    private Genre genre;
    private double performanceFee;

    public Artist(String name, Genre genre, double performanceFee) {
        this.name = name;
        this.genre = genre;
        this.performanceFee = performanceFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getPerformanceFee() {
        return performanceFee;
    }
    
    public void setPerformanceFee(double performanceFee) {
        this.performanceFee = performanceFee;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Genre : " + genre + ", Performance Fee : " + performanceFee + "\n";
    }
}
