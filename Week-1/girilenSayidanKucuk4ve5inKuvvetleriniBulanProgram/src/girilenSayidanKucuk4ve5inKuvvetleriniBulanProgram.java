import java.util.Scanner;

public class girilenSayidanKucuk4ve5inKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        System.out.println("Please input a number : ");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        System.out.println("Power of 4 until " + userNumber + " :");
        for (int i = 1; i <= userNumber; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Power of 5 until " + userNumber + " :");
        for (int i = 1; i <= userNumber; i *= 5) {
            System.out.println(i);
        }
    }
}

