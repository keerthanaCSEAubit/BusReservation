package ticketReservation;

import java.util.*;

public class Ticket extends TicketBase {
    Double price;
    Map<Double, Bus> ticketBusMap = new HashMap<>();

    public Ticket() {
        this.price = price;
    }
        public void pricesForDefaultBus(List<Bus> busData){
            for(Bus bus:busData){
                Integer busId=bus.getBusId();
                if(busId==1){
                    ticketBusMap.put(300.0, bus);
                }
                else if(busId==11){
                    ticketBusMap.put(400.0, bus);
                }
                else if(busId==12){
                    ticketBusMap.put(500.0, bus);
                }

            }
        }

    public void priceAddition(List<Bus> busData){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price per seat: ");
        Double price = scanner.nextDouble();
        for(Bus bus:busData) {
            ticketBusMap.put(price, bus);
        }

    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public Ticket(double price) {
        this.price = price;
    }
    public Ticket(Integer ticketId,Integer userId,Integer busId,Integer seatNumber){
        this.ticketId=ticketId;
        this.userId=userId;
        this.busId=busId;
        this.seatNumber=seatNumber;

    }

    @Override
    public String toString() {
        return "ticketReservation.Ticket{" +
                "price=" + price +
                '}';
    }

    public Double calculatePrice(Integer seatCountFromUser, Map<Double, Bus> ticketBusMap, Integer busNumberFromUser, List<Bus> busData) {
        for (Map.Entry<Double, Bus> entry : ticketBusMap.entrySet()) {
            Double pricePerSeat = entry.getKey();
            Bus buses = entry.getValue();
            Double price;
            for (Bus bus : busData) {
                Integer busId = bus.getBusId();
                if (busId.equals(busNumberFromUser)) {
                    price = seatCountFromUser * pricePerSeat;
//                    System.out.println(price);
                    return price;
                }
            }
        }return null;
    }

    public  void printDetails(){
        System.out.println();

    }
}

interface Printable{
    public void printDetails();
}
