package ticketReservation;

import ticketReservation.*;

import java.util.List;
import java.util.Scanner;


public class Bus implements Reservable {
    Integer busId;
    //    String userId;
    String orgin;
    String destination;
    String date;
    Integer totalSeats;
    Integer availableSeats;

    public Bus() {
        this.busId = busId;
        this.orgin = orgin;
        this.destination = destination;
        this.date = date;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    public Bus(Integer busId, String orgin, String destination, String date, Integer totalSeats) {
        this.busId = busId;
        this.orgin = orgin;
        this.destination = destination;
        this.date = date;
        this.totalSeats = totalSeats;
        //this.availableSeats = availableSeats;
    }

    public Bus(Integer busId, String orgin, String destination, String date, Integer totalSeats, Integer availableSeats) {
        this.busId = busId;
        this.orgin = orgin;
        this.destination = destination;
        this.date = date;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }


    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }


    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", orgin='" + orgin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", totalSeats=" + totalSeats +
                '}';
    }
//    public void busIterarion(List<Bus> busData){
//        for (Bus bus:busData){
//            Bus busValues=bus;
//        }
//    }

    @Override
    public boolean checkAvailability(Integer seatCountFromUser, Integer busId, List<Bus> busData) {
        for (Bus bus : busData) {
            Integer availableSeats = bus.getAvailableSeats();
            if ((bus.getBusId().equals(busId) && seatCountFromUser <= bus.getTotalSeats())) {
                System.out.println(seatCountFromUser + " seats are available");
                return true;
            } else {
                System.out.println("No available seats");
                return false;
            }
        }
        return false;
    }

    @Override
    public void reserveSeat(Integer seatCountFromUser, List<Bus> busData, Integer busId) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to reserve your seats? Y/N ");
        String choice = scanner.next();
        for (Bus bus : busData) {
            if (choice.equalsIgnoreCase("Y")) {
                int available = bus.getAvailableSeats();
                bus.setAvailableSeats(available - seatCountFromUser);
                System.out.println("Your seats are booked");
                return;
            } else {
                releaseSeat(busData, busId);
            }

        }
    }

    @Override
    public boolean releaseSeat(List<Bus> busData, Integer busId) {
        System.out.println("Do you want to cancel the seats? Y/N");
        Scanner scanner = new Scanner(System.in);
        String releaseChoice = scanner.nextLine();
        if (releaseChoice.equalsIgnoreCase("Y")) {
            System.out.println("Your seats for the bus " + busId + "has been cancelled");
        }
        return false;
    }


}

interface Reservable {
    public boolean checkAvailability(Integer seatCountFromUser, Integer busId, List<Bus> busData);

    public void reserveSeat(Integer seatCountFromUser, List<Bus> busData, Integer busId);

    public boolean releaseSeat(List<Bus> busData, Integer busId);

}
