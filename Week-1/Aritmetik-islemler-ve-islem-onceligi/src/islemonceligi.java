import java.util.Scanner;

public class islemonceligi {
    public static void main(String[] args) {

        System.out.println( " a+b*c-b işlem önceliği ve artimetik işlemler");
    // Get input from user //


        Scanner scanner = new Scanner(System.in);

        System.out.println("a rakamını girip Enter tuşuna basın.");
        double a = scanner.nextDouble();

        System.out.println("b rakamını girip Enter tuşuna basın.");
        double b = scanner.nextDouble();

        System.out.println("c rakamını girip Enter tuşuna basın.");
        double c = scanner.nextDouble();

    //solve the equation//

        double answer = a+b*c-b;

        System.out.println( " a+b*c-b işleminin sonucu  " + answer );


    }
}
