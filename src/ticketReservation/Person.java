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
    Double id;
    String name;
    String email;
    String phoneNumber;

    public abstract void getDetails();
}
