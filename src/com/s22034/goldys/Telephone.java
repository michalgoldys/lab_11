package com.s22034.goldys;

public class Telephone {

    private String communicationInterface;
    private String colour;

    public Telephone(String communicationInterface, String colour) {
        this.communicationInterface = communicationInterface;
        this.colour = colour;
    }

    public void call(String number){
        System.out.println(number);
    }

    public void showHistoryCalls(){
        System.out.println(
                "No calls even"
        );
    }

    public String getCommunicationInterface() {
        return communicationInterface;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "communicationInterface='" + communicationInterface + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
