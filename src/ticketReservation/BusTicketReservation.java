package ticketReservation;
import ticketReservation.*;
import java.util.*;
import java.util.stream.Gatherer;

public class BusTicketReservation {
    Map<String, List<Ticket>> mapForBusAndTicket = new HashMap<>();
    List<Bus> busData = new ArrayList<>();
    List<User> userData = new ArrayList<>();
    Map<String, Map<String, List<Ticket>>>mapForAll = new HashMap<>();
    public void addingBusData() {
        busData.add(new Bus(1, "Salem", "Chennai", "20/07/2025", 10));
        busData.add(new Bus(11, "Salem", "Ulundhurpet", "21/07/2025", 10));
        busData.add(new Bus(12, "Salem", "ChinnaSalem", "22/07/2025", 10));
    }
    public void addingUserData(){
        userData.add(new User(888888888888d,"Keerthana", "xyz@gmail.com", "1111111111"));
    }
    Admin admin = new Admin();

    public  void first(){
        addingUserData();
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("BUS TICKET RESERVATION");
        System.out.println("LOGIN AS: ");
        System.out.println("1). ADMIN");
        System.out.println("2). USER");
        int userSelectionForLogin = mainScanner.nextInt();
            switch(userSelectionForLogin) {
                case 1: {
                    System.out.println("Enter the password: ");
                    Scanner scanner = new Scanner(System.in);
                    String password = scanner.nextLine();
                    if (password.equals("12qwaszx")) {
                        while (true) {
                            System.out.println("1). Add Bus: ");
                            System.out.println("2). Remove Bus: ");
                            System.out.println("3). View All UserNames: ");
                            System.out.println("4). View All Details");
                            int adminChoice = scanner.nextInt();
                            if (adminChoice == 1) {
                                admin.addBus(busData);
                                System.out.println(busData);
                            } else if (adminChoice == 2) {
                                System.out.print("Enter Bus ID to remove: ");
                                int id = scanner.nextInt();
                                admin.removeBus(busData, id);
                                System.out.println(busData);
                            } else if (adminChoice == 3) {

                                for (User names : userData) {
                                    String userNames = names.getName();
                                    System.out.println(userNames);
                                }
                            } else if (adminChoice == 4) {
                                System.out.println(userData);
                            }
                        }
                    }
                  else{
                            System.out.println("Enter the correct password!");
                        }
                        break;
                    }

                case 2: {
                    Scanner scanner = new Scanner(System.in);
                    Double id=Math.random();
                    System.out.println("Enter your name: ");
                    String name=scanner.nextLine();
                    System.out.println("Enter your email: ");
                    String email=scanner.nextLine();
                    System.out.println("Enter your phoneNumber: ");
                    String phoneNumber=scanner.nextLine();
                    userData.add(new User(id,name,email,phoneNumber));
                    System.out.println(userData);
                    listingAllBusData(busData);

//                    System.out.println("Enter the source: (Format: SALEM)");
//                    String sourceFromUser = scanner.nextLine();
//                    System.out.println("Enter the destination: (Format: CHENNAI)");
//                    String destinationFromUser = scanner.nextLine();
//                    System.out.println("Enter the date: (Format: 20/07/2025)");
//                    String dateFromUser = scanner.nextLine();
                    System.out.println("Enter the Bus Number: ");
                    Integer busNumberFromUser=scanner.nextInt();
                    System.out.println("Enter the number of Seats :");
                    Integer seatCountFromuser = scanner.nextInt();


                    break;
                }
            }
        }

    public Map<String, Map<String, List<Ticket>>> generatingIdByData(List<Ticket> ticket, Integer busNumberFromUser, Integer personId, Map<String, List<Ticket>> mapForBusAndTicket)
    {
        List<Ticket> ticketData = new ArrayList<>();

        String hashKey=" ";
        for(Bus  values:busData) {
            Integer hashKeyData = values.getBusId();
            Integer availableSeats = values.getAvailableSeats();
            Integer totalSeats = values.getTotalSeats();
            if (hashKeyData.equals(busNumberFromUser))
            {
                hashKey=Utils.generateId(availableSeats, totalSeats, personId);
                mapForBusAndTicket.put(hashKey,ticketData );
                mapForAll.put(hashKey, mapForBusAndTicket);
            }
        } return mapForAll;
    }
    public void listingAllBusData(List<Bus> values){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listing all available Buses");
        System.out.println(values);
        System.out.println("Enter the busId");
        Integer busIdFromUser = scanner.nextInt();
    }

    public void start(){
        addingBusData();
        first();
    }

}


