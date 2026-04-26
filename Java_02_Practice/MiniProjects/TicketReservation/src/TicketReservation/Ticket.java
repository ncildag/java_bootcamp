package TicketReservation;

public class Ticket {

    private double distance;
    int typeNo;
    private String seatNo;
    private double price;
    private Bus bus;

    //-----------Constructors---------------
    public Ticket(double distance, int typeNo, String seatNo, Bus bus) {
        this.distance = distance;
        this.typeNo = typeNo;
        this.seatNo = seatNo;
        this.bus = bus;
    }


    //-------Getter -------------------

    public double getDistance() {
        return distance;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public double getPrice() {
        return price;
    }

    public Bus getBus() {
        return bus;
    }

    //-------- Setter ---------------


    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setPrice(int age){
        double total = 0;
        int seatNo = Integer.valueOf(this.seatNo);

        switch (typeNo){
            case 1:// one way
                if(seatNo %3 == 0){
                    total = this.distance * 1.2;
                }else {
                    total = this.distance * 1;
                }
                System.out.println("Total price = " + total);
                break;
            case 2:// going and return
                if(seatNo %3 == 0){
                    total = this.distance * 2.4;
                }else {
                    total = this.distance * 2;
                }
                System.out.println("Total price = " + total);
                total = total * 0.8; // 20% discount
                System.out.println("Total price with final discount= " + total);
                break;
        }

        if(age<12){
            total = total * 0.5;
            System.out.println("Total price with final under 12 year discount= " + total);
        } else if (age > 65){
            total = total * 0.7;
            System.out.println("Total price with final above 65 year discount= " + total);
        }

        this.price = total;

    }

    public void printTicket(String name){

        System.out.println("*".repeat(42));
        System.out.println("---------Ticket details---------");
        System.out.println("Dear " + name);
        System.out.println("Number of plate: " + this.bus.getNumberPlate());
        System.out.println("Distance: " + this.distance);
        System.out.println("Trip type: " + (this.typeNo == 1 ? "One - way" : "Going and return"));
        System.out.println("Seat number: " + this.seatNo);
        System.out.println("Total price: " + this.price);
        System.out.println("-------Enjoy your trip.-------");
        System.out.println("*".repeat(42));
        
    }
}
