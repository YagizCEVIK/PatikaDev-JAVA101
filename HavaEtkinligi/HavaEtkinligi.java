package HavaEtkinligi;

import java.util.Scanner;
public class HavaEtkinligi {

        public static void main(String[]args){
            double sicaklik;
            Scanner inp = new Scanner(System.in);
            System.out.println("Sıcaklık değerini giriniz");
            sicaklik = inp.nextDouble();
            if(sicaklik<5){
                System.out.println("Kayak yapmalısın.");
            } else if ((5<=sicaklik)&&(sicaklik<=15)) {
                System.out.println("Sinemaya gitmelisin");
            } else if ((15<sicaklik) && (sicaklik<=25)) {
                System.out.println("Pikniğe gitmelisin");
            }else if(25<sicaklik){
                System.out.println("Yüzmeye gitmelisin.");

            }

        }
}
