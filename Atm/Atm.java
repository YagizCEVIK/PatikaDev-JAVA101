package Atm;

import java.util.Scanner;
public class Atm {
        public static void main(String[] args){
            String kullanici, sifre ;
            boolean cikis = false;
            Integer ytutar, ctutar, tutar,hak ;
            tutar = 0;
            hak = 3; // hak değişkenine bir başlangıç değeri atandı
            Scanner inp = new Scanner(System.in);

            while(hak > 0) {
                System.out.println("Kullanıcı adı giriniz: ");
                kullanici = inp.nextLine();

                System.out.println("Şifre giriniz: ");
                sifre = inp.nextLine();
                if(kullanici.equals("yagiz") && sifre.equals("yagiz123")) {
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    while (!cikis) {
                        System.out.println(" 1 - Para yatırma \n 2 - Para çekme \n 3 - Bakiye Sorgula \n 4 - Çıkış yap");
                        Integer in2 = inp.nextInt();
                        switch (in2) {
                            case (1):
                                System.out.println("Yatırılmak istenen para tutarı giriniz: ");
                                ytutar = inp.nextInt();
                                tutar += ytutar;
                                System.out.println("Bakiyeniz: " + tutar);
                                break;

                            case (2):
                                System.out.println("Çekilmek istenen tutarı giriniz: ");
                                ctutar = inp.nextInt();
                                tutar -= ctutar;
                                System.out.println("Bakiyeniz: " + tutar);
                                break;

                            case (3):
                                System.out.println("Bakiyeniz: " + tutar);
                                break;
                            case (4):
                                cikis = true;
                                System.out.println("Tekrar görüşmek üzere.");
                                break;
                        }
                    }
                    break; // Add this line to exit the outer loop
                } else if(hak > 1) { // Check if hak > 1 before decrementing
                    hak--; // kullanıcı adı ve şifre yanlışsa hak bir azaltılır
                    System.out.println("Tekrar deneyiniz. Kalan hakkınız: " + hak);
                } else {
                    System.out.println("Hesabınız bloke olmuştur banka ile iletşime geçiniz.");
                    hak--;
                }
            }
        }
}
