// a simple java program indicating whether a year is a leap year or not.

import java.util.Scanner;

public class artikYilHesaplayici {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" ------------------------------------" + "\n" +
                "Hello, this is a leap year calculator. " + "\n" +
                "To find out whether a year is leap year or not, please input the year :");

        int year = input.nextInt();

        if ((year % 4 == 0 && year %100 !=0) || (year % 400 ==0)) {
            System.out.println(year + " is a leap year ! ");
        }else {
            System.out.println(year + " is not a leap year ! ");
        }
    }
}
