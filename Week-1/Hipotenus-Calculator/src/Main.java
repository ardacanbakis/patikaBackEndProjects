import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // creating variables

        int a, b;
        double c;

        //Getting input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("a kenari uzunlugu:");
        a = input.nextInt();
        System.out.println("b kenari uzunlugu");
        b = input.nextInt();

        c =  Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus :" + c);

    }
}