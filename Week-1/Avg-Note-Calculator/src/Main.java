// a simple java program to calculate a user's average score to see if they have passed or failed an academic year.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //creating  variables
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Implemented Scanner
        Scanner input = new Scanner(System.in);

        // Get information from the user

        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        // Get avarage

        int total = (matematik + fizik + kimya + turkce + tarih + muzik);
        double outcome = total / 6.0;
        System.out.println("Ortalamaniz :" + outcome);

        // Inform user whether they have passed or failed without using else/if
        boolean sucess = outcome >= 60;

        String str = sucess? "Tebrikler sinifinizi basariyla gectiniz! :)" : "Ne yazik ki sinifta kaldiniz. :(";

        System.out.println(str);
    }
}
