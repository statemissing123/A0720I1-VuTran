package B11_Stack_and_Queue.BaiTap.Queue;

import java.util.Queue;

public class Run_myQueue {
    public static void main(String[] args) {
        myQueue myQueues = new myQueue();
//        System.out.println(myQueues.deQueue());//null
//        myQueues.enQueue(1);
//        System.out.println(myQueues.deQueue().data);
//        myQueues.displayQueue();
//        myQueues.enQueue(1);
//        System.out.println(myQueues.deQueue().data);
        myQueues.enQueue(2);
        myQueues.enQueue(3);
        myQueues.enQueue(4);
        myQueues.enQueue(5);
        myQueues.deQueue();
        myQueues.deQueue();
        myQueues.displayQueue();
    }
}
