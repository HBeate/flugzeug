package com.company;

public class Main {

    public static void main(String[] args) {
	PassengerPlane airliner1 = new PassengerPlane("1111", 80000 ,40000,
            18000, 0, 260);
	Freighter freighter1 = new Freighter("2222", 640000, 285000,300000);
        airliner1.boarding();
        airliner1.boarding(50);
        airliner1.boarding();
        airliner1.boarding(57);
        airliner1.boarding();
        airliner1.boarding(100);
        airliner1.boarding(53);
        airliner1.boarding(47);
        airliner1.boarding(3
        );
    }

}
