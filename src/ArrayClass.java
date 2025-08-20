import java.util.*;
public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = {1,2,33,2,4,67,22,13,3,4,5};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


//        Arrays.fill(arr,0);
//        System.out.println(Arrays.toString(arr));

        for(int i: arr)
            System.out.println(i);

    }
}