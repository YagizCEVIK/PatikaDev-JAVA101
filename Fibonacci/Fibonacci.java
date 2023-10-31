package Fibonacci;

public class Fibonacci {
    public static void main(String[] args)
    {
        int deger1 = 0, deger2 = 1;
        int z = 0;
        while(z <= 8){
            System.out.println(deger1 +" + "+deger2+" = "+ deger2);
            int sum = deger1 + deger2;
            deger1 = deger2;
            deger2 = sum;
            z++;
        }
    }
}
