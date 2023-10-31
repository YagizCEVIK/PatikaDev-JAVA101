package MinMaxBulma;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MinMaxBulma {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        Integer number = inp.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=number;i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            int data = inp.nextInt();
            list.add(data);
        }
        int buyuks = list.get(0);
        for(int i = 1; i< number; i++){
            if(buyuks < list.get(i)){
                buyuks = list.get(i);
            }
        }
        int kucuks = list.get(0);
        for(int i = 1 ; i< number; i++){
            if(list.get(i)< kucuks){
                kucuks = list.get(i);
            }
        }
        System.out.println("En büyük sayı: " + buyuks);
        System.out.println("En küçük sayı: " + kucuks);
    }
}