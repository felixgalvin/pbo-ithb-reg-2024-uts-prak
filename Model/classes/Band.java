package Model.classes;

import Model.enums.Genre;

public class Band extends Artist{
    private int numberOfMember;

    public Band(String name, Genre genre, double performanceFee, int numberOfMember) {
        super(name, genre, performanceFee);
        this.numberOfMember = numberOfMember;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    @Override
    public String toString() {
        return super.toString() + "Number of Member : " + numberOfMember + "\n";
    }
}
