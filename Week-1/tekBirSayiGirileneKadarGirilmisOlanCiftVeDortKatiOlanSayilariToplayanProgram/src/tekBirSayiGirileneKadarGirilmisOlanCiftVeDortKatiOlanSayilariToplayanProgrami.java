// a simple java program that sums up the numbers that are even and dividable by 4 entered by user until an odd number is given

import java.util.Scanner;

public class tekBirSayiGirileneKadarGirilmisOlanCiftVeDortKatiOlanSayilariToplayanProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userNumber ;
        int total = 0 ;

        do {
            System.out.println("Input an even number : ");
            userNumber = input.nextInt();

            if(userNumber % 4 == 0) {
            total += userNumber;
            }
        }while (userNumber % 2 == 0) ;

        System.out.println(" Total of the numbers that are even and dividable by 4 : " + total);

    }
}
