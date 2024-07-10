// basic java application to calculate total of a grocery shopping. @ArdaCanbakis

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        // Fruit & Prices
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        // Get quanity from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kg Armut? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Kaç kg Elma? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Kaç kg Domates? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Kaç kg Muz? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Kaç kg Patlıcan? : ");
        double patlicanKilo = scanner.nextDouble();

        // Calculate
        double toplamTutar = (armutFiyati * armutKilo) +
                (elmaFiyati * elmaKilo) +
                (domatesFiyati * domatesKilo) +
                (muzFiyati * muzKilo) +
                (patlicanFiyati * patlicanKilo);

        // Print total
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
