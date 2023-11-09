package ArrayNumberDuplicate;

import java.util.Arrays;

public class ArrayNumberDuplicate {
    public static void main(String[] args){
        int[] list = {3,5,10,3,2,9,10,21,1,33,10,2};
        int[] duplicate = new int[list.length];
        int startIndex =0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j <list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0 && i != j) {
                    duplicate[startIndex++] = list[i];

                    break;
                }
            }
        }
        Arrays.sort(duplicate);
        System.out.println(Arrays.toString(duplicate));

    }
}
