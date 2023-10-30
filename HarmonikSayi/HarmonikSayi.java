package HarmonikSayi;
import  java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int number;

        double result = 0.0;
        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        number = inp.nextInt();
        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println(result);


    }
}
