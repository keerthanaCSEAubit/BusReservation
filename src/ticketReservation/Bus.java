package ticketReservation;

import ticketReservation.BusTicketReservation;

import java.util.Scanner;


public class Bus implements Reservable {
    Integer busId;
//    String userId;
    String orgin;
    String destination;
    String date;
    Integer totalSeats;
    Integer availableSeats;
    public Bus(){
        this.busId=busId;
        this.orgin=orgin;
        this.destination=destination;
        this.date=date;
        this.totalSeats=totalSeats;
        this.availableSeats=availableSeats;
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


    public String toString() {
        return "ticketReservation.Bus{" +
                "busId=" + busId +
                ", orgin='" + orgin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                '}';
    }
    @Override
    public boolean checkAvailability(Integer seatCountFromUser){
        if(seatCountFromUser<=getAvailableSeats()){
            System.out.println(seatCountFromUser+ "seats are available");
            return true;

        }
        System.out.println("No available seats");
        return false;
    }
    @Override
    public void reserveSeat(Integer seatCountFromUser){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to reserve your seats? Y/N ");
        String choice=scanner.next();
        if(choice.equals("Y")) {
            availableSeats = availableSeats - seatCountFromUser;
            System.out.println("Your seats are booked");
        }
        else{
            System.out.println("Do you want to cancel the seats? Y/N");
            String releaseChoice=scanner.nextLine();
            if(releaseChoice.equals("Y")){
                releaseSeat();
            }
        }
    }

    @Override
    public void releaseSeat() {


    }
}
interface Reservable{
     public boolean checkAvailability(Integer seatCountFromUser);
     public void reserveSeat(Integer seatCountFromUser);
     public void releaseSeat();

}
