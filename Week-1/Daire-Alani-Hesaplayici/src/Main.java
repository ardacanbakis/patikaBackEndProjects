// a simple java project to calculate a cirle's area

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int r;
        double pi = 3.14;

        System.out.println("Dairenin yari capini yaziniz:");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Daire alani :" + alan);
        System.out.println("Daire cevresi:" + cevre);
    }
}
