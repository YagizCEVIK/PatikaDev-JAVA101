package NinRliKombinasyonu;
import java.util.Scanner;

public class NinRliKombinasyonu {
        public static void main(String[] args) {
            int n, r, nf = 1,rf = 1,nrf = 1;
            double kombinasyon;
            Scanner inp = new Scanner(System.in);
            System.out.println("N değerini giriniz: ");
            n = inp.nextInt();

            System.out.println("R değerini giriniz: ");
            r = inp.nextInt();

            for(int i = 1; i <=n; i++){
                nf *= i;
            }
            System.out.println("N değerinin faktöriyeli : "+nf);
            for(int k = 1; k <=r; k++){
                rf *= k;

            }
            System.out.println("R değerinin faktöriyeli : "+rf);
            for(int z = 1; z<=n-r; z++){
                nrf *= z;
            }
            kombinasyon = nf/(rf*nrf);
            System.out.println("Kombinasyon : "+ kombinasyon);

        }
}
