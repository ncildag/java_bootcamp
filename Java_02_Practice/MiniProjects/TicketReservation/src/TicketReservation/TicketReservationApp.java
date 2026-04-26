package TicketReservation;

import java.util.Scanner;

public class TicketReservationApp {

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        //------Creation of bus object from Bus Class with plate and number of seats params.
        Bus bus = new Bus("ZH999001", 33);

        Ticket ticket;
        Scanner scanner = new Scanner(System.in);

        int select; //use 0 to exit.
        do {
            System.out.println("Welcome to ticket reservation system.");
            System.out.println("Name and surname:");
            String name = scanner.nextLine();

            System.out.println("Age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Distance:");
            double distance = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Trip type (1: One way and 2:Going and return:");
            int type = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Seat no:");
            System.out.println("Odd numbers price is 20% more than even numbers.");
            System.out.println(bus.getSeats());
            String seat = scanner.next(); //seat number should be one piece - next enough.

            //Check if seat is reserved.
            boolean isReserved = !bus.getSeats().contains(seat);

            if (distance > 0 && age > 0 && (type == 1 || type == 2) && !isReserved) {
                ticket = new Ticket(distance,type,seat,bus);
                ticket.setPrice(age);
                ticket.getBus().getSeats().remove(seat);
                ticket.printTicket(name);
            } else {
                System.out.println("Dear passenger this seat is already booked or not exist in the selected bus type.");

            }

            System.out.println("To reset please give a number, to exit please type 0.");
            select = scanner.nextInt();
            scanner.nextLine();


        }while(select != 0);
        System.out.println("Have a good day!");

    }

}
