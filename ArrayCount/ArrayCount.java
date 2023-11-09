package ArrayCount;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class ArrayCount {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        Arrays.sort(list);
        int cnt =0;
        for(int i=0;i<list.length;i++){
            if(i!=0 && list[i]!=list[i-1]){
                System.out.println(list[i-1] + " sayısı " + cnt +" kere tekrar edildi.");
                cnt=1;
            }
            else{
                cnt++;
            }
        }
        System.out.println(list[list.length-1] + " sayısı " + cnt +" kere tekrar edildi.");


    }
}
