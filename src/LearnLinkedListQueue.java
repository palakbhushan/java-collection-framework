import java.util.*;

public class LearnLinkedListQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // becz linkedList implements queue

        queue.offer(12);
        queue.offer(14);
        queue.offer(123);
        queue.offer(54);
        queue.offer(32);

        System.out.println("queue: " + queue);
        System.out.println("queue peak: " + queue.peek());
        System.out.println("queue remove: " + queue.poll());
        System.out.println("queue: " + queue);
        System.out.println("queue peak: " + queue.peek());
    }
}