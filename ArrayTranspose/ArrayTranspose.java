package ArrayTranspose;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayTranspose {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Column girin : ");
        int n = scan.nextInt();
        System.out.println("Row girin : ");
        int j = scan.nextInt();
        int[][] list = new int[n][j];
        for (int k = 0; k < n; k++) {
            for (int y = 0; y < j; y++) {
                System.out.println("Değer girin : ");
                int number = scan.nextInt();
                list[k][y] = number;
            }
        }
        System.out.println("Matris : ");
        for (int[] row : list) {
            System.out.println(Arrays.toString(row));
        }
        int[][] listTranspoze = new int[j][n];
        for (int k = 0; k < n; k++) {
            for (int y = 0; y < j; y++) {
                listTranspoze[y][k] = list[k][y];
            }
        }
        for(int[] row : listTranspoze){
            System.out.println(Arrays.toString(row));
        }
    }
}
