// a simple java program to show the assigned zodiac sign depending on the date input

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        int month;
        int day;

        Scanner date = new Scanner(System.in);

        // Kullanıcıdan doğum tarihini alma
        System.out.println("Doğdunuz ayı rakam ile yazınız: ");
        month = date.nextInt();

        System.out.println("Doğdunuz günü rakam ile yazınız: ");
        day = date.nextInt();

        date.close();

        // Burc belirleme ve ekrana yazdırma
        String burc = burcBul(month, day);
        System.out.println("Burcunuz: " + burc);
    }
            // Burç belirleme metodu
            public static String burcBul (int month, int day) {
               // bos deger vermeden calismiyor nedenini soralim.
                String burc = "";

                if ((day <= 31) && (month == 1 && day >= 22) || (month == 2 && day <= 18)) {
                burc = "Kova";
                } else if ((day <= 31) && (month == 2 && day >= 19) || (month == 3 && day <= 20)) {
                burc = "Balık";
                } else if((day <= 31) && (month == 3 && day >= 21) || (month == 4 && day <= 20)) {
                    burc = "Koç";
                } else if ((day <= 31) && (month == 4 && day >= 21) || (month == 5 && day <= 21)) {
                    burc = "Boğa";
                } else if ((day <= 31) && (month == 5 && day >= 22) || (month == 6 && day <= 21)) {
                    burc = "İkizler";
                } else if ((day <= 31) && (month == 6 && day >= 22) || (month == 7 && day <= 22)) {
                    burc = "Yengeç";
                } else if ((day <= 31) && (month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                    burc = "Aslan";
                } else if ((day <= 31) && (month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                    burc = "Başak";
                } else if ((day <= 31) && (month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                    burc = "Terazi";
                } else if ((day <= 31) && (month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                    burc = "Akrep";
                } else if ((day <= 31) && (month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                    burc = "Yay";
                } else if ((day <= 31) && (month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                    burc = "Oğlak";
                } else {
                    burc = "Geçersiz tarih. Lütfen doğum tarihinizi sırasıyla ay (1-12) ve gün (1-31) olarak girin.";
                }

                return burc;

            }
        }
