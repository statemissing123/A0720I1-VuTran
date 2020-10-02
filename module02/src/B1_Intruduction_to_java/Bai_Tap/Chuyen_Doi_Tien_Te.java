package B1_Intruduction_to_java.Bai_Tap;

import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short rate = 23000;
        System.out.print("Nhập số tiền USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println("Số tiền VND là: " + vnd);
    }

}
