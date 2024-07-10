// a simple java program to calculate tax prices of items and show the user all the prices individually.

// for Scanner to work
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(" Seçmiş olduğunuz ürünün detaylı ücret hesaplaması için lütfen liste fiyatını giriniz. ");

        // Requesting input from user
        Scanner input = new Scanner(System.in);


        // Creating  variables

        double price , totalprice , KDVrate;
        price = input.nextDouble();

            // Creating condition for "KDVrate" without using else/if
                boolean highprice = price >= 1000 ;
                KDVrate = highprice ? 0.08 : 0.18;

                // Calculating total price /w tax

                 totalprice = price + (price * KDVrate);
                 double KDVamount = price * KDVrate;

            // Print out the final price details

        System.out.println("KDV'siz Fiyat: " + price + "TL'dir.");
        System.out.println("KDV'li Fiyat: " + totalprice + "TL'dir.");
        System.out.println("KDV Tutarı: " + KDVamount + "TL'dir.");
        System.out.println("Bu ekonomik şartlarda eğer alım gücünüz var ise fiyatlar daha da yükselmeden ihtiyacınız olan ürünü almanızı tavsiye eder, iyi günler dileriz. :)");
    }
}

