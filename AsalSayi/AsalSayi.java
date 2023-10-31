package AsalSayi;
public class AsalSayi {
    public static void main(String[] args)
    {
        String yazi ="";
        int deger = 100 ;
        for(int i = 1; i<=100;i++)
        {
            int bolunenlerintoplami = 0;
            for(int k = 1; k<=i; k++)
            {
                if(i % k == 0)
                {
                    bolunenlerintoplami += k;
                }
            }
                if(bolunenlerintoplami == i+1)
                {
                    yazi += " " + i;
                }
        }
        System.out.println(yazi);
    }
}

