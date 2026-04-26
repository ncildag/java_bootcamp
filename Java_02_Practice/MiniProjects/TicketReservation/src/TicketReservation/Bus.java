package TicketReservation;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    //------------------Fields----------------------
    private String numberPlate;
    private int numberOfSeat;
    private List<String> seats = new ArrayList<>();


    //-----------------Constructor-------------------
    public Bus(String numberPlate, int numberOfSeat) {
        this.numberPlate = numberPlate;
        this.numberOfSeat = numberOfSeat;
        for (int i = 1; i < numberOfSeat; i++) {
            this.seats.add(String.valueOf(i));
            //alternative --> this.seats.add(i+"");
        }
    }

    //---------------getter - setter ------------------
    public String getNumberPlate() {
        return numberPlate;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public List<String> getSeats() {
        return seats;
    }
}
