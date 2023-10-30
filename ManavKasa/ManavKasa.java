package ManavKasa;
import java.util.Scanner;

public class ManavKasa {
        public static void main(String[] args){
            double armut, elma, domates, muz, patlican, armutk, elmak, domatesk, muzk, patlicank,total;
            Scanner inp = new Scanner(System.in);
            System.out.println("Armut Kaç Kilo ?");
            armutk = inp.nextDouble();
            System.out.println("Elma Kaç Kilo ?");
            elmak = inp.nextDouble();
            System.out.println("Domates Kaç Kilo ?");
            domatesk = inp.nextDouble();
            System.out.println("Muz Kaç Kilo ?");
            muzk = inp.nextDouble();
            System.out.println("Patlıcan Kaç Kilo ?");
            patlicank = inp.nextDouble();
            armut = 2.14;
            elma = 3.67;
            domates = 1.11;
            muz = 0.95;
            patlican = 5;
            total = (armut*armutk)+ (domates*domatesk)+(muz*muzk)+ (elma*elmak) + (patlican*patlicank);
            System.out.println("Toplam alışverişin tutarı: "+ total);

        }
}
