package UceDordeBolunenSayiOrtalamasi;
import java.util.Scanner;

public class UceDordeBolunenSayiOrtalamasi {
        public static void main(String[] args) {
            int sondeger, degiskent, i, degiskens;
            degiskens = 0;
            degiskent = 0;
            i = 1;
            Scanner inp = new Scanner(System.in);
            System.out.println("Son değeri giriniz: ");
            sondeger = inp.nextInt();
            while (i <= sondeger) {
                if (i % 3 == 0 || i % 4 == 0) {
                    degiskent += i;
                    degiskens++;
                }
                i++;
            }
            System.out.println((double) degiskent/degiskens);
        }
}
