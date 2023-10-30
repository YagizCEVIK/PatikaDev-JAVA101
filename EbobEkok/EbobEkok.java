package EbobEkok;

import java.util.Scanner;
public class EbobEkok {
        public static void main(String[] args){
            int n1, n2,i = 1, ebob =0,ekok;
            Scanner inp = new Scanner(System.in);
            System.out.println("İlk değeri giriniz: ");
            n1 = inp.nextInt();
            System.out.println("İkinci değeri giriniz: ");
            n2 = inp.nextInt();
            while(i <= n1 || i<= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob: " + ebob);

            ekok = (n1*n2)/ebob;
            System.out.println("ekok: "+ ekok);

        }
}
