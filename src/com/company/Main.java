package com.company;

public class Main {

    public static void main(String[] args) {
        PassengerPlane airliner1 = new PassengerPlane("1111", 80000, 40000,
                18000, 0, 260, 8000);
        Freighter freighter1 = new Freighter("2222", 640, 285, 300,
                250);


        airliner1.boarding();
        airliner1.boarding();
        airliner1.boarding(57);
        airliner1.boarding();
        airliner1.boarding(201);
        airliner1.boarding(200);
        airliner1.fuel(250);
        airliner1.getPassengers();

        freighter1.load(30);
        freighter1.load(40);
        freighter1.load(25);
        freighter1.unload(30);
        freighter1.unload(45);
        freighter1.fuel(400);
        freighter1.fuel(300);
    }
}

