package me.eladiofeijoo.javadesingnpatterns.builder;

public class PersonalComputerBuilder {
    private String motherBoard = "CX5601FBA-I3128";
    private int ram = 4;
    private String cpu = "1215UL";
    private String graphicCard = "RX540";
    private String soundCard = "Audigy FX PCIe 5.1";
    private int hardDisk = 250;

    public PersonalComputerBuilder() {}

    public PersonalComputerBuilder setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public PersonalComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PersonalComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public PersonalComputerBuilder setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }

    public PersonalComputerBuilder setSoundCard(String soundCard) {
        this.soundCard = soundCard;
        return this;
    }

    public PersonalComputerBuilder setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getSoundCard() {
        return soundCard;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public PersonalComputer build(){
        return new PersonalComputer(motherBoard, ram, cpu, graphicCard, soundCard, hardDisk);
    }
}
