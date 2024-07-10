// basic java application for a simple calculator using switch. @ArdaCanbakis
import java.util.Scanner;

public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        int n1, n2, result;

        Scanner input = new Scanner(System.in) ;
        System.out.println(" Bir sayı giriniz : ");
        n1 = input.nextInt();
        System.out.println(" Bir sayı daha giriniz");
        n2 = input.nextInt();

        System.out.println(": ");
        System.out.println( "1 - Toplama\n2- Çıkarma\n3 - Çarpma \n4 - Bölme");

        int selection = input.nextInt();


        switch (selection) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Hata: 0 ile bölemezsiniz! :) ");
                    return;
            }
            default:
            System.out.println("Hatali giriş yaptınız");
            return;

        }

        System.out.println("Sonuç : " + result);
    }
}
