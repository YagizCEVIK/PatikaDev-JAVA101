package Boks;

import java.io.PrintStream;
import java.sql.SQLSyntaxErrorException;
import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Ring(Fighter f1, Fighter f2, int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    double artis = 1;
    void run(){
        if (isCheck()){
            do {

                    System.out.println("======== YENİ ROUND ===========");
                if(artis == 1) {
                    Random rastgele = new Random();
                    int sayi = rastgele.nextInt(2);
                    if (sayi == 0) {
                        System.out.println("Kazanan %50 şansla" + f1.name + " olacak");
                        artis += 1;
                    } else if (sayi == 1) {
                        System.out.println("Kazanan  %50 şansla"+ f2.name + " olacak");
                        artis += 1;
                    }
                }

                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                } while (f1.health > 0 && f2.health > 0);


        }else{
            System.out.println("Sporcuların sikletleri uymuyor. ");
        }
    }
    boolean isCheck(){
        return((f1.weight <= maxWeight && f1.weight>= minWeight )&& (f2.weight<= maxWeight&&f2.weight>=minWeight));
    }
    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}

