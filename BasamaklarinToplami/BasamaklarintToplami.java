package BasamaklarinToplami;

import java.util.Scanner;
public class BasamaklarintToplami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = scanner.nextInt();
        int tot = 0;

        while (sayi != 0) {
            tot = tot + sayi % 10;
            sayi = sayi / 10;
        }

        System.out.println("Basamakların toplamı: " + tot);
    }
}
