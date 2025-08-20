import java.util.*;
public  class  LearnCollectionClass{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(7);
        arr.add(33);
        arr.add(2);

        System.out.println("min " + Collections.min(arr));
        System.out.println("max " + Collections.max(arr));
        System.out.println("freq " + Collections.frequency(arr, 1));

        Collections.shuffle(arr);
        System.out.println("shuffled " + arr);

        Collections.reverse(arr);
        System.out.println("reversed " + arr);

        Collections.sort(arr);
        System.out.println("sorted " + arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("sorted revserse" + arr);
    }
}