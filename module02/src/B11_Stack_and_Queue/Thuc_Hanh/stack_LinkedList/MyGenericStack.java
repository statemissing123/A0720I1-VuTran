package B11_Stack_and_Queue.Thuc_Hanh.stack_LinkedList;

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
            return true
        }
        return false;
    }

    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push();
    }

}
