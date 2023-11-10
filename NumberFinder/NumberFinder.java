package NumberFinder;
import java.util.Arrays;
import java.util.Scanner;
public class NumberFinder
{
    public static void main(String[] args)
    {
        int deger = (int) (Math.random()*101);
        int hak = 5;
        int[] hataligirisler = new int[5];
        int i = 0 ;

        Scanner scan = new Scanner(System.in);
        while(hak>0)
        {
            System.out.println("Lütfen tahmininizi giriniz : ");
            int guess = scan.nextInt();
            if(guess>=  0 && guess<100)
            {
                if (guess == deger)
                {
                    System.out.println("Tahmininiz doğru. ");
                    break;
                }else
                {
                    System.out.println("Tahmininiz hatalı.");
                    if(guess < deger)
                    {
                        System.out.println("Verilen sayıdan daha büyük bir sayı.");
                    }else
                    {
                        System.out.println("Verilen sayıdan daha küçük bir sayı.");
                    }
                    hataligirisler[i] = guess;
                    i++;
                    hak--;
                    System.out.println("Kalan hakkınız : "+ hak);
                }
            }else
            {
                System.out.println("0 ile 100 arasında bir değer giriniz. ");
                hataligirisler[i] = guess;
                i++;
                hak--;
                System.out.println("Kalan hakkınız : "+ hak);
            }
        }
        if(hak == 0)
        {
            System.out.println("Oyunu kaybettiniz. ");
            System.out.println("Doğru sayı : "+ deger);
            System.out.println("Tahminleriniz : "+ Arrays.toString(hataligirisler));
        }
    }
}
