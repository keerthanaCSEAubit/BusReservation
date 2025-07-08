package ticketReservation;
import ticketReservation.BusTicketReservation;
import ticketReservation.Bus;
import ticketReservation.Person;
public class Utils {
    public static String generateHashKey(Integer busId,Integer personId ){
        String hashKey=busId+"#"+personId;
        return hashKey;
    }
    public static String generateId(Integer availableSeats, Integer totalSeats, Integer personId){
        Integer id=availableSeats/totalSeats;
        return generateHashKey(id, personId);
    }
}
