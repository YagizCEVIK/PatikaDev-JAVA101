package UcgendeAlan;
import java.util.Scanner;

public class UcgendeAlan {
        public static void main(String[] args){
            Scanner inp = new Scanner(System.in);
            double ilkKenar, ikinciKenar, hipotenus, alan, u ;
            System.out.println("İlk kenar uzunluğu: ");
            ilkKenar = inp.nextDouble();

            System.out.println("İkinci kenar uzunluğu: ");
            ikinciKenar = inp.nextDouble();

            System.out.println("Hipotenüs uzunluğu");
            hipotenus = inp.nextDouble();

            u = (ilkKenar+ikinciKenar+hipotenus)/2;

            alan = Math.sqrt(u*(u- ilkKenar)* (u- ikinciKenar ) * (u - hipotenus));
            System.out.println("Üçgenin alanı: " + alan);

        }


    }

