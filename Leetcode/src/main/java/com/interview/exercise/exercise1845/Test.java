package com.interview.exercise.exercise1845;

import java.util.PriorityQueue;
import java.util.TreeSet;

class SeatManager {
    // Marker to point to unreserved seats.
    int marker;

    // Min heap to store all unreserved seats.
    PriorityQueue<Integer> availableSeats;

    public SeatManager(int n) {
        // Set marker to the first unreserved seat.
        marker = 1;
        // Initialize the min heap.
        availableSeats = new PriorityQueue<>();
    }

    public int reserve() {
        // If min-heap has any element in it, then,
        // get the smallest-numbered unreserved seat from the min heap.
        if (!availableSeats.isEmpty()) {
            int seatNumber = availableSeats.poll();
            return seatNumber;
        }

        // Otherwise, the marker points to the smallest-numbered seat.
        int seatNumber = marker;
        marker++;
        return seatNumber;
    }

    public void unreserve(int seatNumber) {
        // Push unreserved seat in the min heap.
        availableSeats.offer(seatNumber);
    }
}

public class Test {

    public static void main(String args[]){
        SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
        seatManager.reserve();    // All seats are available, so return the lowest numbered seat, which is 1.
        seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        seatManager.unreserve(2); // Unreserve seat 2, so now the available seats are [2,3,4,5].
        seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        seatManager.reserve();    // The available seats are [3,4,5], so return the lowest of them, which is 3.
        seatManager.reserve();    // The available seats are [4,5], so return the lowest of them, which is 4.
        seatManager.reserve();    // The only available seat is seat 5, so return 5.
        seatManager.unreserve(5); // Unreserve seat 5, so now the available seats are [5].

    }
}
