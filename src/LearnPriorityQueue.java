import java.util.*;
public class  LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(3);
        queue.offer(10);
        queue.offer(2);
        queue.offer(4);

        // min heap -- small element at peak
        System.out.println("min heap queue: " + queue + " peak: " + queue.peek());
        queue.poll();
        System.out.println("min heap queue: " + queue + " peak: " + queue.peek());

        System.out.println("-------------------------------\n\n");
        PriorityQueue<Integer> maxHeapQueue = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeapQueue.offer(3);
        maxHeapQueue.offer(10);
        maxHeapQueue.offer(2);
        maxHeapQueue.offer(4);

        // max heap -- largest element at peak
        System.out.println("max heap queue: " + maxHeapQueue + " peak: " + maxHeapQueue.peek());
        System.out.println("max heap queue poll: " + maxHeapQueue.poll());
        System.out.println("max heap queue: " + maxHeapQueue + " peak: " + maxHeapQueue.peek());
    }
}