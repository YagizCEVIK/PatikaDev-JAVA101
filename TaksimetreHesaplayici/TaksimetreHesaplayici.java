package TaksimetreHesaplayici;

import java.util.Scanner;
public class TaksimetreHesaplayici {

        public static void main(String[] args) {
            double yol, cost;
            Scanner inp = new Scanner(System.in);
            System.out.println("Kaç km yol aldınız : ");
            yol = inp.nextDouble();
            cost = (10+(2.2*yol)<20) ? 20 : 10+(2.2*yol);
            System.out.println("Taksimetre ücreti : " + cost);

        }

    }

