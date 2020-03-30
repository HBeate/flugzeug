package com.company;

public class Airplane {
    private String identification;
    private int maximumWeight;
    private int emptyWeight;
    private int fuelCapacity;

    public Airplane(String identification, int maximumWeight, int emptyWeight, int fuelCapacity) {
        this.identification = identification;
        this.maximumWeight = maximumWeight;
        this.emptyWeight = emptyWeight;
        this.fuelCapacity = fuelCapacity;

    }

    public String getIdentification() {
        return identification;
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }


}
