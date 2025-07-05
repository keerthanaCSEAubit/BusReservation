package ticketReservation;

public class Ticket {
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

    @Override
    public String toString() {
        return "ticketReservation.Ticket{" +
                "price=" + price +
                '}';
    }
}
