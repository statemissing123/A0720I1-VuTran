package B14_Sort.Bai_Tap;

import java.util.Arrays;

public class Sort_Up {
    public static void Sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k = i - 1;
            for (; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];

            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1};
        System.out.println(Arrays.toString(array));
        Sort(array);
        System.out.println(Arrays.toString(array));
    }
}

