// basic java application to calculate body mass index. @ArdaCanbakis 
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {

        // User input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        // Calculate
        double vucutKitleIndeksi = kilo / (boy * boy);

        // Output
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);
    }
}
