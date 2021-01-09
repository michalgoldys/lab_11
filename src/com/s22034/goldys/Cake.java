package com.s22034.goldys;

public class Cake {

    private String producerName;
    private int cakeMass;
    private int productCode;

    public Cake(String producerName, int cakeMass, int productCode) {
        this.producerName = producerName;
        this.cakeMass = cakeMass;
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "producerName='" + producerName + '\'' +
                ", cakeMass=" + cakeMass +
                ", productCode=" + productCode +
                '}';
    }
}
