package B11_Stack_and_Queue.Thuc_Hanh.stack_LinkedList.MyStackGeneric;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    MyGenericStack() {
        stack = new LinkedList<T>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Tran");
        stack.push("Le");
        stack.push("Viet");
        stack.push("Vu");
        System.out.println("Kich thuoc cua stack: " + stack.size());
        System.out.println("Duyet stack ");
        while (!stack.isEmpty()) {
            System.out.println(" " + stack.pop());
        }
        System.out.println(" " + stack.size());
    }

    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }


}
