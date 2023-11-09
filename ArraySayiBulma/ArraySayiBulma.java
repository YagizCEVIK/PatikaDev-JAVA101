
package ArraySayiBulma;
import java.util.Scanner;

public class ArraySayiBulma {
    public static void main(String[] args) {
        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(java.util.Arrays.toString(list));
        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        int number = scan.nextInt();
        int minDiff = Integer.MAX_VALUE;
        int closestSmaller = number;
        int closestLarger = number;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < number && number - list[i] < minDiff) {
                minDiff = number - list[i];
                closestSmaller = list[i];
            }
        }
        minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > number && list[i] - number < minDiff) {
                minDiff = list[i] - number;
                closestLarger = list[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+ closestLarger);
    }
}


