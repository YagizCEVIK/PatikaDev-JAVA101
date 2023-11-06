package PrimeNwRecursive;
import java.util.Scanner;

public class PrimeNwRecursive {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);

    }

    public static void main(String[] args){
        System.out.print("Sayı Giriniz : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(isPrime(number, 2) == true){
            System.out.println(number+" sayısı ASALDIR !");
        }else{
            System.out.println(number+" sayısı ASAL değildir !");
        }

    }
}
