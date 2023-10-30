package VucutKitleEndeksi;

import java.util.Scanner;
public class VucutKitleEndeksi {
        public static void main(String[] args){
            double kilo, boy,indeks;
            Scanner inp = new Scanner(System.in);
            System.out.println("Lütfen kilonuzu giriniz : ");
            kilo = inp.nextDouble();
            System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
            boy = inp.nextDouble();
            indeks = kilo / (boy * boy);
            System.out.println("Vücut Kitle İndeksiniz : " + indeks );

        }
}
