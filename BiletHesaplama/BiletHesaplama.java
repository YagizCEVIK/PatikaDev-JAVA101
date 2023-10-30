package BiletHesaplama;
import java.util.Scanner;

public class BiletHesaplama {
        public static void main(String[] args){
            double km,age,travel, odenecek = 0;

            Scanner inp = new Scanner(System.in);

            System.out.println("Mesafeyi km türünden giriniz :");
            km = inp.nextInt();

            System.out.println("Yaşınızı giriniz :");
            age = inp.nextInt();

            System.out.println("Yolculuk tipini giriniz (\"1\" => Tek Yön ,\"2\" => Gidiş Dönüş ):");
            travel = inp.nextInt();

            if(1 <= km && 1 <= age && travel == 1 || travel == 2)  {
                if(age<12){
                    if(travel == 1){
                        odenecek = (km*0.10)/2;
                    }else{
                        odenecek = ((km*0.10)/2)*0.8*2;
                    }
                } else if (12<=age && age<=24) {
                    if(travel == 1){
                        odenecek = (km*0.10)*0.9;
                    }else{
                        odenecek = (km*0.10)*0.9*0.8*2;
                    }
                } else if (65<=age) {
                    if(travel == 1){
                        odenecek = (km*0.10)*0.7;
                    }else{
                        odenecek = (km*0.10)*0.7*0.8*2;
                    }
                } else if (24<age && age<65) {
                    if(travel == 1){
                        odenecek = (km*0.10);
                    }else{
                        odenecek = (km*0.10)*0.8*2;
                    }

                }
                System.out.println("Toplam Tutar = "+ odenecek+ "TL");

            }else{
                System.out.println("Hatalı Veri Girdiniz !");
            }


        }
}
