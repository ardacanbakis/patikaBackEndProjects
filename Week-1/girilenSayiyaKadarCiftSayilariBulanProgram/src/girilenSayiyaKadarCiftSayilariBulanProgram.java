import java.util.Scanner;

public class girilenSayiyaKadarCiftSayilariBulanProgram {
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int userNumber = input.nextInt();

        int total = 0;
        int numberCount = 0;

        //finding numbers divisible by 3 and 4
        for (int number = 1; number <= userNumber; number++) {
            if ((number % 3 == 0) && (number % 4 == 0)) {
                //adding numbers
                total += number;
                //increase the number amount
                numberCount++;
            }
        }
        if (numberCount>0){ //maths
            double average = (double) total / numberCount;
            System.out.println("Total of the numbers : " + total);
            System.out.println("# of numbers that are divisible by 3 and 4 : " + numberCount);
            System.out.println( "Average of the numbers divisible by 3 and 4 : " + average);
        }else { //indicating to user
            System.out.println("There are no numbers exactly divisible by 3 and 4 until the number you enter.");
        }
    }
}
