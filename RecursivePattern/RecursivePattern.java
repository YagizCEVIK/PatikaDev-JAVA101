package RecursivePattern;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class RecursivePattern {
    static void pattern(int n, int a, int artis) {
        System.out.print(n + " ");
        if (n < 0)
            pattern(n - artis, a, -artis);
        else if (n != a || artis < 0)
            pattern(n + artis, a, artis);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = scan.nextInt();
        System.out.print("Çıktısı : ");
        pattern(number, number, -5);
    }
}


