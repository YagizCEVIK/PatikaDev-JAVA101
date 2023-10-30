package BasitHesapMakinesi;
import java.util.Scanner;

public class BasitHesapMakinesi {
        public static void main(String[] args){
            int n1, n2, select;
            Scanner veri = new Scanner(System.in);
            System.out.println("İlk sayıyı giriniz: ");
            n1 = veri.nextInt();
            System.out.println("İkinci sayıyı giriniz: ");
            n2 = veri.nextInt();
            System.out.println("1 - Toplam \n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
            select = veri.nextInt();
            switch(select){
                case 1:
                    System.out.println("Toplama: " + (n1+n2));
                    break;
                case 2:
                    System.out.println("Çıkartma: "+ (n1-n2));
                    break;
                case 3:
                    System.out.println("Çarpma: "+ (n1*n2));
                    break;
                case 4:
                    System.out.println("Bölme: "+ (n1/n2));
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
            }
        }
}
