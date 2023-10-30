package DairedeAlan;

import java.util.Scanner;
public class DairedeAlan {
        public  static void main(String[] args){
            double alan, pi , r, a;
            pi = 3.14;
            Scanner inp = new Scanner(System.in);
            System.out.println("Yarıçap değeri: ");
            r = inp.nextDouble();
            System.out.println("Merkez açısının ölçüsü: ");
            a = inp.nextDouble();
            alan = (pi * (r * r) * a) / 360;
            System.out.println("Dairenin alanı " + alan );


        }
}
