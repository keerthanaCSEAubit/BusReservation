package ticketReservation;
import ticketReservation.Bus;
import ticketReservation.BusTicketReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Gatherer;

import ticketReservation.Utils;
public abstract class Person {
    Integer personId;
    String name;
    String email;
    String phoneNumber;
    Map<String, List<Bus>> mapForBusAndPerson = new HashMap<>();
    List<Bus> busData = new ArrayList<>();
    public void addingBusData(Bus bus,String id, Integer busNumberFromUser) {

        busData.add(new Bus(1, "Salem", "Chennai","20/07/2025", 10, 10));
        busData.add(new Bus(1, "Salem", "Ulundhurpet","21/07/2025", 10, 10));
        busData.add(new Bus(1, "Salem", "ChinnaSalem","22/07/2025", 10, 10));




        for(Bus values:busData){
            Integer hashKeyData=values.getBusId();
            Integer availableSeats=values.getAvailableSeats();
            Integer totalSeats=values.getTotalSeats();
            if(hashKeyData.equals(busNumberFromUser));{
                Utils.generateId(availableSeats,totalSeats,personId);
            }


        }
//        Utils.generateHashKey();
    }
    public void addingMapData(List<Bus> busData,  Map<String, List<Bus>> mapForBusAndPerson){

    }



    public abstract void getDetails();
}
