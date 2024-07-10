// a simple java program to arrange numbers from small to big

import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int x, y, z;

        Scanner numbers = new Scanner(System.in);
        System.out.println("Bu program gireceğiniz 3 sayıyı büyükten küçüğe sıralamak için tasarlanmıştır.");
        System.out.println("1.sayi : ");
        x = numbers.nextInt();

        System.out.println("2. sayi : ");
        y = numbers.nextInt();

        System.out.println("3. sayi : ");
        z = numbers.nextInt();

        if ((x > y) && (x > z)) {
            if (y > z) {
                System.out.println(z + "<" + y + "<" + x);
            } else {
                System.out.println(y + "<" + z + "<" + x);
            }

        }else if ((y>x) && (y>z)) {
            if (z > x) {
                System.out.println(x + "<" + z + "<" + y);
            } else {
                System.out.println(z + "<" + x + "<" + y);
            }
        }else if ((z > x) && (z>y)){
            if (x>y) {
                System.out.println(y + "<" + x + "<" + z);
            }
            else {
                System.out.println(x + "<" + y + "<" + z);
            }
        }
    }
}
