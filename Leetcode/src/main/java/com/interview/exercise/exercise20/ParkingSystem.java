package com.interview.exercise.exercise20;

public class ParkingSystem {
    int[] parkingSlots = new int[4];
    int[] parked = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        parkingSlots[1] = big;
        parkingSlots[2] = medium;
        parkingSlots[3] = small;
    }

    public boolean addCar(int carType) {
        if (parked[carType] < parkingSlots[carType]) {
            parked[carType]++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
