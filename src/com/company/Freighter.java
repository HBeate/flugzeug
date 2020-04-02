package com.company;

public class Freighter extends Airplane {
    private double cargo;

    public Freighter(String identification, int maximumWeight, int emptyWeight, int fuelCapacity) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.cargo = cargo;
    }

    public double load(double newCargo) {
        double weight = super.getWeight();
        double loadedPlane = (weight + cargo);


        if ((loadedPlane + newCargo) <= this.getMaximumWeight()) {
            System.out.print("Total cargo: " + this.cargo + ". Cargo to add: " + newCargo);
            this.cargo += newCargo;
            System.out.println(". Makes " + this.cargo);
            return this.cargo;
        } else {
            System.out.println("Too much cargo. There is only " + (getMaximumWeight() - loadedPlane)
                    + " more cargo possible");
        }
        return cargo;
    }

    public double unload(double unloadCargo) {
        if (this.cargo >= unloadCargo) {
            this.cargo -= unloadCargo;
            System.out.println("Cargo taken off " + unloadCargo + ". Total cargo in plane: " + this.cargo);
        } else {
            System.out.println("Cargo to unload: " + unloadCargo + " is larger than cargo loaded: " + this.cargo);
        }
        return cargo;
    }
}
