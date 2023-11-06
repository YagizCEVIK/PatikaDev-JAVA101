package PowwRecursive;
import java.util.Scanner;

public class PowwRecursive {
    static int  pow(int t, int u) {
        int deger = 1;
        if(u == 0){
            return 1;
        }else{
            return t * pow(t,u-1);
        }

    }
    public static void main(String[] args){
        System.out.print("Taban değerini giriniz: ");
        Scanner inp = new Scanner(System.in);
        int taban = inp.nextInt();
        System.out.print("Üst değerini giriniz: ");
        int ust = inp.nextInt();
        System.out.print(pow(taban,ust));
    }
}
