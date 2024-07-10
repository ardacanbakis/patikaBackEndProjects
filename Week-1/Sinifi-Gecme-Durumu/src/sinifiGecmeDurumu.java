// a simple java program to calculate avarage score.

import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();

        // Girilen ders notları 0 ile 100 arasında değilse ortalamaya katılmasın
        if (matematik >= 0 && matematik <= 100 &&
                fizik >= 0 && fizik <= 100 &&
                turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 &&
                muzik >= 0 && muzik <= 100) {

            double average = (matematik + fizik + turkce + kimya + muzik) / 5;

            if (average <= 55) {
                System.out.println("Kaldınız");
            } else {
                System.out.println("Geçtiniz");
            }

        } else {
            System.out.println("Notlar 0 ile 100 arasında girilmelidir.");
        }
    }
}
