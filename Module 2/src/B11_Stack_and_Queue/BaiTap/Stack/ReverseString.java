package B11_Stack_and_Queue.BaiTap.Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String hoTen = "ũV tếiV êL nầrT";
        System.out.println("Chuỗi Ban Đầu: " + hoTen);
        Stack stack = new Stack();
        for (int i = 0; i < hoTen.length(); i++) {
            stack.add(hoTen.charAt(i));
        }
        String Reverse_hoTen = "";
        while (!stack.empty()) {
            Reverse_hoTen += stack.pop();
        }
        System.out.println("Tên sau khi đảo: " + Reverse_hoTen);
    }
}
