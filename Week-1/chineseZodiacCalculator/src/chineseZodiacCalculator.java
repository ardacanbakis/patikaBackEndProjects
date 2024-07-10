// a simple java program with multi language support to inform the user about Chinese zodiac signs
// and indicate their sign using their year of birth.

import java.util.Scanner;

public class chineseZodiacCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Press 1 for English" + "\n" + "Türkçe için 2'ye basınız.");
// language selection
        int language = input.nextInt();

        switch (language) {
            case 1 :
                System.out.println("Hello and welcome to my Chinese Zodiac Calculator." +
    "What is the Chinese Zodiac?\n" + "\n" +
    "Chinese astrology is a type of astrology that has been used for 4000 thousand years and describes people with 12 different signs and symbols. The Chinese Zodiac is an animal ring in which these 12 signs are equally spaced (10 degrees wide) and has little to do with the stars.\n" + "\n" +
    "How is the Chinese Zodiac calculated?\n" + "\n" +
    "The Chinese zodiac is calculated according to the remainder of the person's birth year divided by 12.\n" + "\n" +
    "To see what is your Chinese Zodiac Sign please enter the year you were born in : ");
                break;

            case 2 :
                System.out.println("Merhaba, Çin Zodyak Hesaplayıcıma hoş geldiniz.\n" + "\n" +
    "Çin Zodyağı nedir?\n" + "\n" +
    "4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.\n" + "\n" +
    "Çin Zodyağı nasıl hesaplanır?\n" + "\n" +
    "Çin Zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.\n" + "\n" +
    "Çin Burcunuzun ne olduğunu öğrenmek için lütfen doğum yılınızı giriniz: ");
                break;

            default:
                System.out.println("Wrong input. Try again. / Hatalı giriş. Tekrar deneyin.");
        }
//user input + sign selection accordingly
            int birthYear = input.nextInt();

            String zodiacSignEn = "";
            String zodiacSignTr = "";

                if (birthYear % 12 == 0) {
                    zodiacSignEn = "Monkey";
                    zodiacSignTr = "Maymun";
                } else if (birthYear % 12 == 1) {
                    zodiacSignEn = "Rooster";
                    zodiacSignTr = "Horoz";
                } else if (birthYear % 12 == 2) {
                    zodiacSignEn = "Dog";
                    zodiacSignTr = "Köpek";
                } else if (birthYear % 12 == 3) {
                    zodiacSignEn = "Pig";
                    zodiacSignTr = "Domuz";
                } else if (birthYear % 12 == 4) {
                    zodiacSignEn = "Mouse";
                    zodiacSignTr = "Fare";
                } else if (birthYear % 12 == 5) {
                    zodiacSignEn = "Ox";
                    zodiacSignTr = "Boğa";
                } else if (birthYear % 12 == 6) {
                    zodiacSignEn = "Tiger";
                    zodiacSignTr = "Kaplan";
                } else if (birthYear % 12 == 7) {
                    zodiacSignEn = "Rabbit";
                    zodiacSignTr = "Tavşan";
                } else if (birthYear % 12 == 8) {
                    zodiacSignEn = "Dragon";
                    zodiacSignTr = "Ejderha";
                } else if (birthYear % 12 == 9) {
                    zodiacSignEn = "Snake";
                    zodiacSignTr = "Yılan";
                } else if (birthYear % 12 == 10) {
                    zodiacSignEn = "Horse";
                    zodiacSignTr = "At";
                } else if (birthYear % 12 == 11) {
                    zodiacSignEn = "Sheep";
                    zodiacSignTr = "Koyun";
                }

        switch (language) {
            case 1 :
System.out.println("Your Zodiac Sign is : " + zodiacSignEn + ". \n If you want to know the Zodiac sign of your friends or family, you can run the program again.");
break;
            case 2 :
System.out.println("Zodiac burcunuz : " + zodiacSignTr + ". \n Arkadaşlarınız veya ailenizin Zodiac burcunu öğrenmek isterseniz programı yeniden çalıştırabilirsiniz.");
break;
        }
    }
}