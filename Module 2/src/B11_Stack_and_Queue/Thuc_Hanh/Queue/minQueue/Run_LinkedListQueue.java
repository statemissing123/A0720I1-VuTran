package B11_Stack_and_Queue.Thuc_Hanh.Queue.minQueue;

import B11_Stack_and_Queue.Thuc_Hanh.Queue.minQueue.MyLinkedListQueue;

public class Run_LinkedListQueue {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
