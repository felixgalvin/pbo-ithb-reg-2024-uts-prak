package Model.classes;

import Model.enums.Genre;

public class SoloArtist extends Artist {
    private String assistantName;

    public SoloArtist(String name, Genre genre, double performanceFee, String assistantName) {
        super(name, genre, performanceFee);
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    @Override
    public String toString() {
        return super.toString() + "Assistant Name : " + assistantName + "\n";
    }
}