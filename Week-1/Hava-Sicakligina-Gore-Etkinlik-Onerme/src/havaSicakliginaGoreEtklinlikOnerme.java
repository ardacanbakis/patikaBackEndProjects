// a simple java program to advice on doable activities depending on the weather

import java.util.Scanner;

public class havaSicakliginaGoreEtklinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        heat = input.nextInt();

        if (heat <5){
            System.out.println("Hava soguk, tam da kayag'a gitme zamani!");
            // bu else if 5-25 araligi verilmediginde hata aliyor. ???
        } else if (heat >= 5 && heat <=25) {
            if (15 > heat) {
                System.out.println(" Hmm hava biraz sert, sinema'ya  gitmeye ne dersin.");
            }
            else if (15 <= heat&& heat <= 25){
            System.out.println("Hava muhteşem! Piknik zamanı!");}
        } else if (heat > 25) {
            System.out.println("Bu kadar sıcak havada anca yüzülür. Doğru plaja!");
        }


    }

}
