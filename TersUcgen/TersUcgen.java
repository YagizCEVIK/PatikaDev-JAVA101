package TersUcgen;

import java.util.Scanner;
public class TersUcgen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen basamak sayısını girin: ");
        int basamak = scanner.nextInt();

        for (int i = basamak; i >= 1; i--)
        {
            for (int j = 0; j < (basamak - i); j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
