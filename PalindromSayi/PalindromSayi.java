package PalindromSayi;
import java.util.Scanner;

public class PalindromSayi {
    static boolean palindrom(int number){
        int temp = number, reversenumber = 0, lastnumber;
        while(temp != 0){
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }
        if(number == reversenumber){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Sorgulanmak istenen değeri giriniz: ");
        int input = inp.nextInt();
        if(palindrom(input)== true){
            System.out.println("Verilen sayı palindrom sayıdır.");
        }else{
            System.out.println("Verilen sayı palindrom değildir.");
        }
    }
}