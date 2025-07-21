package ticketReservation;

public abstract class TicketBase {
    public Integer ticketId;
    public Integer userId;
    public Integer busId;
    public Integer seatNumber;
    public abstract Double calculatePrice();
    public abstract void printDetails();
//    public void test(){

    }

