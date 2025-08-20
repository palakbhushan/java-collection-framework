import java.util.*;
public class LearnSet {
    public static void main(String[] args) {
        // no duplicate element allowed
        // unordered

        Set<Integer> set = new HashSet<>();  // unique and unordered O(1)
//        Set<Integer> set = new TreeSet<>();  // sorted and unique (binary search tree) O(n)
//        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        System.out.println("set: " + set);

        set.remove(1);
        System.out.println("set: " + set);
        System.out.println("set contains: " + set.contains(1));
        System.out.println("set contains: " + set.contains(6));
        System.out.println("set contains: " + set.contains(7));
        System.out.println("set isEmpty: " + set.isEmpty());
        System.out.println("set size: " + set.size());

        set.clear();
        System.out.println("set clear: " + set);

    }
}