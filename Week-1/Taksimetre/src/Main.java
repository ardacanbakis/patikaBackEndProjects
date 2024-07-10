// a simple calculator for taxi fare
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int km;
        double priceKm = 2.20, startPrice = 10,total;


        System.out.println("Baslangic ucreti 10Tl'dir.Minimum odenmesi gereken tutar 20TL'dir. ");
        Scanner input = new Scanner(System.in);
        System.out.println("Gidelecek mesafeyi Km cinsiden giriniz");
        km = input.nextInt();

        total = startPrice + (km * priceKm);
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam odenecek ucret:" + total);
    }
}
