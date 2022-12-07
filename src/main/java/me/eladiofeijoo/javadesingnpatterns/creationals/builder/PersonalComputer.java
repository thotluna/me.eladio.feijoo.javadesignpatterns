package me.eladiofeijoo.javadesingnpatterns.creationals.builder;

public class PersonalComputer {
    private String motherBoard;
    private int ram;
    private String cpu;
    private String graphicCard;
    private String soundCard;
    private int hardDisk;

    private PersonalComputer(){}

    public PersonalComputer(String motherBoard, int ram, String cpu, String graphicCard, String soundCard, int hardDisk) {
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.cpu = cpu;
        this.graphicCard = graphicCard;
        this.soundCard = soundCard;
        this.hardDisk = hardDisk;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(String soundCard) {
        this.soundCard = soundCard;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "motherBoard='" + motherBoard + '\'' +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", soundCard='" + soundCard + '\'' +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
