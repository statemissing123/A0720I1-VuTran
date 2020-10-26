package B11_Stack_and_Queue.BaiTap.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MyStackk {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        int[] intArr = {1, 2, 3, 4};
        for (int i = 0; i < intArr.length; i++) {
            intStack.push(intArr[i]);
            System.out.print(intArr[i]+ "\t");
        }
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = intStack.pop();
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(+intArr[i] + "\t");
        }
    }
}
