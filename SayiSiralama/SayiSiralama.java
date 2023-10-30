package SayiSiralama;
import java.util.Scanner;

public class SayiSiralama {

        public static void main(String[] args){
            double fnumber, snumber, tnumber;
            Scanner inp = new Scanner(System.in);
            System.out.println("İlk sayıyı giriniz: ");
            fnumber = inp.nextDouble();
            System.out.println("İkinci sayıyı giriniz: ");
            snumber = inp.nextDouble();
            System.out.println("Üçüncü sayıyı giriniz");
            tnumber = inp.nextDouble();
            if(fnumber>snumber && fnumber>tnumber){
                if(snumber>tnumber){
                    System.out.println(tnumber + "<"+ snumber + "<" + fnumber);
                }else{
                    System.out.println(snumber+ "<"+ tnumber+ "<"+fnumber);
                }
            } else if (snumber>fnumber && snumber>tnumber) {
                if(fnumber>tnumber){
                    System.out.println(tnumber+ "<"+ fnumber+"<"+snumber);
                }else{
                    System.out.println(fnumber + "<" + tnumber + "<" + snumber);
                }

            } else if (tnumber>fnumber && tnumber>snumber) {
                if(fnumber>snumber){
                    System.out.println(snumber+ "<"+ fnumber+ "<"+tnumber);
                }else{
                    System.out.print(fnumber + "<"+ snumber + "<" + tnumber);
                }
            }
        }

    }
