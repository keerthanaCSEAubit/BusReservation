package ticketReservation;

import java.util.List;
import java.util.Map;

public abstract class TicketBase {
    public Integer ticketId;
    public Integer userId;
    public Integer busId;
    public Integer seatNumber;
    public abstract Double calculatePrice(Integer seatCountFromUser, Map<Double, Bus> ticketBusMap, Integer busNumberFromUser, List<Bus> busData);
    public abstract void printDetails();
//    public void test(){

    }

