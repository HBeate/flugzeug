package com.company;

public class Freighter extends Airplane {
    private double cargo;

    public Freighter(String identification, int maximumWeight, int emptyWeight, int fuelCapacity) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.cargo = cargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public double load() {
        this.cargo += 10;
        return cargo;
    }

    public double unload() {
        this.cargo -= 10;
        return 0;

    }
}
