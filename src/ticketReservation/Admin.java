package ticketReservation;
import ticketReservation.Bus;

import javax.swing.*;
import java.util.*;

public class Admin extends Person{
    Map<String, Object> personAndBusDetails = new HashMap();
    List<Bus> busData =new ArrayList<>();
    public void addBus(List<Bus> busData) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bus ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Origin: ");
        String origin = sc.next();
        System.out.print("Enter Destination: ");
        String destination = sc.next();
        System.out.print("Enter Date: ");
        String date = sc.next();
        System.out.print("Enter Total Seats: ");
        int totalSeats = sc.nextInt();
        Bus bus = new Bus(id, origin, destination, date, totalSeats);
        busData.add(bus);
        System.out.println("Bus Added Successfully.");
    }

    public void removeBus(List<Bus> busData, int busId) {
        for(int i=0; i<busData.size(); i++) {
            Bus bus = busData.get(i);
            if (bus.getBusId() == busId) {
                busData.remove(i);
                i--;
                return;
            }
        }
        System.out.println("Invalid Bus Number");
        }




    public void getDetails() {
        System.out.println("Admin Details: ");
    }

}
