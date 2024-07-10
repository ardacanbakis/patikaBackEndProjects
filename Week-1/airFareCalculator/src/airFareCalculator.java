// a simple java program to calculate air fare depending on user's selection
import java.util.Scanner;

public class airFareCalculator {
    public static void main(String[] args) {

        //variables
        double pricePerKm = 0.1;
        double distance;
        int age;
        int travelType;
        double ticketPrice;
        double ageDiscount = 1;
        double travelTypeDiscount = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance you want to travel in KMs : ");
        distance = scanner.nextDouble();

        System.out.print("Please enter your age : ");
        age = scanner.nextInt();

        System.out.println("Please indicate your travel type. 1 = One-Way | 2 = Round trip");
        travelType = scanner.nextInt();

        //calculating price
        ticketPrice = pricePerKm * distance;

        if ((distance < 1) || (age < 1) || (travelType != 1 && travelType != 2)) {
            System.out.println("Wrong input, please try again.");
        }

        // Age discount
        if (age < 12) {
            ageDiscount = 0.5;
        } else if (age < 25) {
            ageDiscount = 0.9;
        } else if (age > 65) {
            ageDiscount = 0.7;
        }
        // apply %20 off if round trip
        if (travelType == 2) {
            ticketPrice = ticketPrice * 2; //*  by 2 cause round trip
            travelTypeDiscount = 0.8;
        }

        //calculate final price
        double finalTicketPrice = ticketPrice * ageDiscount * travelTypeDiscount;

        System.out.println
                ("Distance to be travelled : " + distance + "KM" + "\n" +
                        "Your age : " + age + "\n" +
                        "Ticket price : " + ticketPrice + "$" + "\n" +
                        "Total discount : " + (ticketPrice - finalTicketPrice) + "$" + "\n" +
                        "Ticket price after discounts : " + finalTicketPrice + "$");
    }
}
