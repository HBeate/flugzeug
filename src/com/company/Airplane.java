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

    public double getMaximumWeight() {
        return maximumWeight;
    }

    //Methods
    public double getWeight() {
        double weight = this.emptyWeight + this.fuelCapacity;
        return weight;
    }

    public void fuel(double fuelLevel) {
        if (fuelLevel < this.fuelCapacity) {
            System.out.println("The fuel level is at: " + fuelLevel + ". Maximum is " + this.fuelCapacity + ".");
        }

    }


}
