package B2_VongLap_Java.Bai_Tap.Thuc_Hanh;

import java.util.Scanner;

public class HienThi_SoNguyen_To {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Nhập số lượng số nguyên tố bạn muốn in ra(>0):");
            number = scanner.nextInt();
        }while (number<=0);
        int count=0;
        int num = 2;
        while (count<number){
            boolean check = true;
            int count_1 = 2;
            while (count_1 <= Math.sqrt(num)) {
                if (num % count_1 == 0) {
                    check = false;
                    break;
                }
                count_1++;
            }
            if (check) {
                System.out.print(num + "\t");
                count++;
            }
            num++;
        }
    }
}
