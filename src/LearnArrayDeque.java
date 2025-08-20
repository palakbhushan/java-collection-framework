import java.util.*;
public class LearnArrayDeque {
    public static void main(String[] args) {
        //doubly ended queue
        //mostly used in sliding window technique
        //opeation can pe done from both side

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.offer(4);
        arrayDeque.offer(145);
        arrayDeque.offer(2);
        arrayDeque.offer(98);

        arrayDeque.offerFirst(88); // will be head
        arrayDeque.offerLast(121); // tail

        System.out.println(arrayDeque);

        System.out.println("-------------------------------\n\n");

        System.out.println("peak " +  arrayDeque.peek());
        System.out.println("peakFirst " +  arrayDeque.peekFirst());
        System.out.println("peakLast " +  arrayDeque.peekLast());

        System.out.println("-------------------------------\n\n");
        arrayDeque.poll();
        System.out.println(arrayDeque);
        arrayDeque.pollFirst();
        System.out.println(arrayDeque);
        arrayDeque.pollLast();
        System.out.println(arrayDeque);

    }
}