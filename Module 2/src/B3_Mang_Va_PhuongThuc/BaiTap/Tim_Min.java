package B3_Mang_Va_PhuongThuc.BaiTap;

import java.util.Scanner;

public class Tim_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("Nhập số phần tử muốn có trong mảng: ");
        int size_array = scanner.nextInt();
        array = new int[size_array];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }
//        System.out.println("Mảng đã nhập là: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
        int min = array[0];
        for (int i = 1 ; i< array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất là: "+ min);
    }
}
