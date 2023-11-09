package ArrayOrder;
import java.util.*;
public class ArrayOrder {
    public static void main(String[] args){
        String yazi = " ";
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int i = inp.nextInt();
        int[] array1 = new int[i];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int k = 0; k < i; k++) {
            System.out.print(k+1 + ". Elemanı :");
            int j = inp.nextInt();
                array1[k] = j;
        }

        Arrays.sort(array1);
        System.out.println("Sıralama : " + Arrays.toString(array1).substring(1,Arrays.toString(array1).length()-1));
    }
}
