package SayiBulma;
import java.util.Scanner;

public class SayiBulma {

        public static void main(String[] args) {
            int degisken, i = 1;

            Scanner inp = new Scanner(System.in);
            System.out.println("Değer giriniz: ");
            degisken = inp.nextInt();
            while (i < degisken) {
                if (i % 4 == 0) {
                    System.out.println(i + " değeri 4'ün katı ");
                } else if (i % 5 == 0) {
                    System.out.println(i + " değeri 5'in katı");
                }
                i++;
            }
        }
}
