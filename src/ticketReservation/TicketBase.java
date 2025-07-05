package ticketReservation;

public abstract class TicketBase {
    Integer ticketId;
    Integer userId;
    Integer busId;
    Integer seatNumber;
    public abstract Double calculatePrice();
    public abstract void printDetails();
}
