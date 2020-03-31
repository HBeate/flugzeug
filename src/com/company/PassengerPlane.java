package com.company;

public class PassengerPlane extends Airplane {
    private int amountOfPassengers;
    private int maximumPassengers;

    public PassengerPlane(String identification, int maximumWeight, int emptyWeight, int fuelCapacity, int amountOfPassengers, int maximumPassengers) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.amountOfPassengers = amountOfPassengers;
        this.maximumPassengers = maximumPassengers;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        this.maximumPassengers = maximumPassengers;
    }


    // Methods
    // 1 Person boarded
    public void boarding() {
        this.amountOfPassengers += +1;
        System.out.println(" 1 person boarding: " + this.amountOfPassengers + " people on board");
    }

    // man kann Integer mitgeben
    public int boarding(int numberOfGroup) {
        int seatsTaken = this.amountOfPassengers;
        int maxSeats = this.maximumPassengers;
        if (seatsTaken + numberOfGroup <= maxSeats) {
            seatsTaken += numberOfGroup;
            System.out.println(numberOfGroup + " people boarding: " + seatsTaken + " people on board");
        } else if(seatsTaken == maxSeats)  {
            System.out.println("All seats are taken.");
        }else{

            int seatsAvaliable = maxSeats - seatsTaken;
            System.out.println("Only " + seatsAvaliable + " more passangers can board the plain.");
        }
        this.amountOfPassengers = seatsTaken;
        return this.amountOfPassengers;
    }
}