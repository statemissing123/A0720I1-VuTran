package B2_VongLap_Java.Bai_Tap.Thuc_Hanh;

public class SoNguyen_ToDuoi100 {
    public static void main(String[] args) {
        int num=2;
        while (num<100){
            boolean check = true;
            int count = 2;
            while (count <= Math.sqrt(num)) {
                if (num % count == 0) {
                    check = false;
                    break;
                }
                count++;
            }
            if (check) {
                System.out.print(num + "\t");
            }
            num++;
        }
    }
}
