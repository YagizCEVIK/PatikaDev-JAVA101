package NotHesapliyici;

import java.util.Scanner;

public class NotHesaplayici {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notu: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notu: ");
        fiz = inp.nextInt();

        System.out.println("Kimya Notu: ");
        kim = inp.nextInt();

        System.out.println("Türkçe Notu : ");
        tur = inp.nextInt();

        System.out.println("Tarih Notu: ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notu: ");
        muzik = inp.nextInt();

        double totalvalue, ortalama;
        totalvalue = mat+fiz+kim+tur+tarih+muzik;
        ortalama = totalvalue/6;
        System.out.println("Derslerin ortalaması: " + ortalama );

        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);


    }
}
