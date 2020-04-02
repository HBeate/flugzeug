package com.company;

public class Freighter extends Airplane {
    private double cargo;
    double cargoKg = this.cargo;

    public Freighter(String identification, int maximumWeight, int emptyWeight, int fuelCapacity) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.cargo = cargo;
    }

    public double load(double newCargo) {
        double weight = super.getWeight();
        double loadedPlane = (weight + cargo);


        if ((loadedPlane + newCargo) <= this.getMaximumWeight()) {
            System.out.print("Total cargo: " + cargoKg + ". Cargo to add: " + newCargo);
            cargoKg += newCargo;
            System.out.println(". Makes " + cargoKg);
            cargo = cargoKg;
            return cargo;
        } else {
            System.out.println("Too much cargo. There is only " + (getMaximumWeight() - loadedPlane)
                    + " more cargo possible");
        }
        return cargo;
    }

    public double unload(double unloadCargo) {
        if (cargoKg >= unloadCargo) {
            cargoKg -= unloadCargo;
            System.out.println("Cargo taken off " + unloadCargo + ". Total cargo in plane: " + cargoKg);
        } else {
            System.out.println("Cargo to unload: " + unloadCargo + " is larger than cargo loaded: " + cargoKg);
        }
        cargoKg = cargo;
        return cargo;
    }
}
