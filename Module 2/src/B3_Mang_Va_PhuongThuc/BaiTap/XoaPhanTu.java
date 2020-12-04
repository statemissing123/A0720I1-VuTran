package B3_Mang_Va_PhuongThuc.BaiTap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("Nhập số lượng phần tử: ");
        int size_arr = scanner.nextInt();
        array = new int[size_arr];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("Nhập phần tử cần xóa X: ");
        int X = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (X == array[i]) {
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
