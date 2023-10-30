package SinifGecme;

import java.util.Scanner;
public class SinifGecme {
        public static void main(String[] args){
            double mat, fiz, tur, kim,muz, total, derssayisi, ortalama;
            total = 0;
            derssayisi = 0;
            Scanner inp = new Scanner(System.in);

            System.out.println("Matematik notu: ");
            mat = inp.nextDouble();

            System.out.println("Fizik notu:");
            fiz = inp.nextDouble();

            System.out.println("Türkçe notu:");
            tur = inp.nextDouble();

            System.out.println("Kimya notu:");
            kim = inp.nextDouble();

            System.out.println("Müzik notu:");
            muz = inp.nextDouble();

            if((0<=mat) && (mat<=100)){
                total += mat;
                derssayisi++;
            }
            if((0<=tur) && (tur<=100)){
                total += tur;
                derssayisi++;
            }
            if((0<=muz) && (muz<=100)){
                total += muz;
                derssayisi++;
            }
            if((0<=kim) && (kim<=100)){
                total += kim;
                derssayisi++;
            }
            if((0<=fiz) && (fiz<=100)){
                total += fiz;
                derssayisi++;
            }
            ortalama = total/derssayisi;
            if(55<=ortalama){
                System.out.println("Derslerden geçtiniz, ortalamanız: "+ ortalama);
            }else{
                System.out.println("Derslerden kaldınız, ortalamanız: " + ortalama);
            }
        }
}
