package MukemmelSayi;
import java.util.Scanner;
public class MukemmelSayi
{
    public static void main(String[] args)
    {
        int sayi, tamtot = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = inp.nextInt();
        for(int i = 1; i<sayi;i++ )
        {
          if(sayi % i == 0)
          {
              tamtot += i;
          }
        }
        if(tamtot == sayi)
        {
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else
        {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
