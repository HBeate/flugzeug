package com.company;

public class PassengerPlane extends Airplane {
    private int amountOfPassengers;
    private int maximumPassengers;

    public PassengerPlane(String identification, int maximumWeight, int emptyWeight, int fuelCapacity,
                          int amountOfPassengers, int maximumPassengers, int fuel) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.amountOfPassengers = amountOfPassengers;
        this.maximumPassengers = maximumPassengers;
    }

    // Methods
    // 1 Person boarded
    public void boarding() {
        boarding(1);
        /*
        this.amountOfPassengers++;
        System.out.println(" 1 person boarding: " + this.amountOfPassengers + " people on board");*/
    }

    // man kann Integer mitgeben
    public int boarding(int numberOfGroup) {
        int seatsTaken = this.amountOfPassengers;
        int maxSeats = this.maximumPassengers;
        if (seatsTaken + numberOfGroup <= maxSeats) {
            seatsTaken += numberOfGroup;
            System.out.println(numberOfGroup + " people boarding: " + seatsTaken + " people on board");
        } else {

            int seatsAvaliable = maxSeats - seatsTaken;
            System.out.println("Only " + seatsAvaliable + " more passangers can board the plain.");
        }
        if (seatsTaken == maxSeats) {
            System.out.println("All seats are taken.");
        }
        this.amountOfPassengers = seatsTaken;
        return this.amountOfPassengers;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public double getPassengers() {
        System.out.println("There are " + this.amountOfPassengers + " passengers.");
        return this.amountOfPassengers;
    }
}