package ticketReservation;

import java.util.Scanner;

public class BusTicketReservation {
    public  void main(String[] args){
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("BUS TICKET RESERVATION");
        System.out.println("LOGIN AS: ");
        System.out.println("1). ADMIN");
        System.out.println("2). USER");
        int userSelectionForLogin = mainScanner.nextInt();
        while(true){
            switch(userSelectionForLogin) {
                case 1: {
                    System.out.println("Enter the password: ");
                    Scanner scanner = new Scanner(System.in);
                    String password = scanner.nextLine();
                    if (password.equals("12qwaszx")) {
                        System.out.println("1). Add Bus: ");
                        System.out.println("2). Remove Bus: ");
                        System.out.println("3). View All Users: ");
                    } else {
                        System.out.println("Enter the correct password!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the destination: ");
                    Scanner scanner = new Scanner(System.in);
                    String destinationFromUser = scanner.nextLine();
                    System.out.println("Enter the date: ");
                    String dateFromUser = scanner.nextLine();
                    System.out.println("Enter the number of Seats :");
                    Integer seatCountFromuser = scanner.nextInt();
                    System.out.println("Enter the Bus Number: ");
                    Integer busNumberFromUser=scanner.nextInt();
                    break;
                }
            }
        }
    }
}
