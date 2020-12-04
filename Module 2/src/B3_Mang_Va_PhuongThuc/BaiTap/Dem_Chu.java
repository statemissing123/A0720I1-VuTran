package B3_Mang_Va_PhuongThuc.BaiTap;

import java.util.Scanner;

public class Dem_Chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn: ");
        String string = scanner.nextLine();
        System.out.println("Nhập ký tự muốn đếm: ");
        char charact = scanner.next().charAt(0);
        int count =0;
        for (int i=0; i<string.length(); i++){
            if(string.charAt(i)==charact){
                count++;
            }
        }
        System.out.println("ký tự " + charact + " đã có " + count + " lần trong chuỗi.");
    }
}
