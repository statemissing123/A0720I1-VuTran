package B3_Mang_Va_PhuongThuc.BaiTap;

import java.util.Scanner;

public class Gop_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1;
        System.out.println("Số phần tử muốn có trong mảng 1: ");
        int size_arr1 = scanner.nextInt();
        arr1 = new int[size_arr1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + (i + 1));
            arr1[i] = scanner.nextInt();
        }


        int[] arr2;
        System.out.println("Số phần tử muốn có trong mảng 2: ");
        int size_arr2 = scanner.nextInt();
        arr2 = new int[size_arr2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập gía trị phần tử thứ " + (i + 1));
            arr2[i] = scanner.nextInt();
        }


        System.out.println("Mảng thứ nhất là: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println("----------------------------");
        System.out.println("Mảng thứ 2 là: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println("----------------");
        int[] arr3;
        arr3 = new int[size_arr1 + size_arr2];
        System.out.println("Mảng được gộp là: ");
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i-arr1.length];
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }
    }
}
