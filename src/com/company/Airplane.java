package com.company;

public class Airplane {
    private String identification;
    private double maximumWeight;
    private double emptyWeight;
    private double fuelCapacity;

    public Airplane(String identification, int maximumWeight, int emptyWeight, int fuelCapacity) {
        this.identification = identification;
        this.maximumWeight = maximumWeight;
        this.emptyWeight = emptyWeight;
        this.fuelCapacity = fuelCapacity;
    }

    public String getIdentification() {
        return identification;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }
//Methods
    public double getWeight() {
      double weight = this.emptyWeight + this.fuelCapacity;
        return weight;
    }

    public double fuel() {
        double fuel = this.fuelCapacity;
        return fuel;
    }


}
