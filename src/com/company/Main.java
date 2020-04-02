package com.company;

public class Main {

    public static void main(String[] args) {
        PassengerPlane airliner1 = new PassengerPlane("1111", 80000, 40000,
                18000, 0, 260);
        Freighter freighter1 = new Freighter("2222", 640, 285, 300);


        airliner1.boarding();
        airliner1.boarding(50);
        airliner1.boarding();
        airliner1.boarding(57);
        airliner1.boarding();
        airliner1.boarding(100);
        airliner1.boarding(53);
        airliner1.boarding(47);
        airliner1.boarding(3);

        freighter1.load(30);
        freighter1.load(20);
        freighter1.load(40);
        freighter1.load(20);
        freighter1.unload(30);
        freighter1.unload(35);
    }
}

