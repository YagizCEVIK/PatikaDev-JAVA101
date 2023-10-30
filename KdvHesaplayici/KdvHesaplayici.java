package KdvHesaplayici;
import java.util.Scanner;
public class KdvHesaplayici {
    public class Main {
        public static void main(String[] args){
            double kdvsiz, kdvli;
            Scanner inp = new Scanner(System.in);
            System.out.println("Ürünün kdvsiz fiyatını giriniz: ");
            kdvsiz = inp.nextDouble();
            kdvli = (kdvsiz<1000) ? kdvsiz*0.18+kdvsiz : kdvsiz*0.08+kdvsiz;
            System.out.println("Ürünün kdvli fiyatı: " + kdvli);
        }
    }
}
