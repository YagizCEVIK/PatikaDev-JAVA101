package DordunKatiOlanDegerler;
import java.util.Scanner;

public class DordunKatiOlanDegerler {
        public static void main(String[] args) {
            int sayi, tot = 0;
            Scanner inp = new Scanner(System.in);
            do {
                System.out.println("Sayı değerini giriniz: ");
                sayi = inp.nextInt();
                if (sayi % 4 == 0) {
                    tot += sayi;
                    System.out.println("Dördün katı olan değerler toplamı : " + tot);
                }
            } while (sayi % 2 == 0);
            System.out.println("Dördün katı olan değerler toplamı : " + tot);

        }
}
