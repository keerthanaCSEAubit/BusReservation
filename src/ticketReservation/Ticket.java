package ticketReservation;

public class Ticket extends TicketBase {
    double price;
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
    public Double calculatePrice(){
        return null;
    }
    public  void printDetails(){

    }
}

interface Printable{
    public void printDetails();
}
