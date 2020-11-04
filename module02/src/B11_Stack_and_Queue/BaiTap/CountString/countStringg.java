package B11_Stack_and_Queue.BaiTap.CountString;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countStringg {
    public static void main(String[] args) {
        System.out.println("Mời nhập từ: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        String hoTen = "Trần Lê Viết Vũ Trần Lê Viết Viết ";
        String[] arr = input.split(" ");
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (String elm : arr) {
            if (map.containsKey(elm)) {
                map.put(elm, map.get(elm) + 1);
            } else {
                map.put(elm, 1);
            }
        }
        for (String string : map.keySet()) {
            System.out.println("Từ: "+string +" Value: " +map.get(string));
        }
    }
}
