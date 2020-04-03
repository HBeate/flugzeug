package com.company;

public class Freighter extends Airplane {
    private double cargo;

    public Freighter(String identification, int maximumWeight, int emptyWeight, int fuelCapacity, int fuel) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
    }

    public void load(double newCargo) {
        double weight = super.getWeight();
        double loadedPlane = (weight + cargo);

        if ((loadedPlane + newCargo) <= this.getMaximumWeight()) {
            System.out.print("Total cargo: " + cargo + ". Cargo to add: " + newCargo);
            cargo += newCargo;
            System.out.println(". Makes " + cargo);
        } else {
            System.out.println("Too much cargo. There is only " + (getMaximumWeight() - loadedPlane)
                    + " more cargo possible");
        }
    }

    public double unload(double unloadCargo) {
        if (cargo >= unloadCargo) {
            cargo -= unloadCargo;
            System.out.println("Cargo taken off " + unloadCargo + ". Total cargo in plane: " + cargo);
        } else {
            System.out.println("Cargo to unload: " + unloadCargo + " is larger than cargo loaded: " + cargo);
        }

        return cargo;
    }
}
