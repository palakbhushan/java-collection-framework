import java.util.*;
public  class LearnMap {
    public static void main(String[] args) {

        //key value
        //unique keys, else override
        // HashMap - unordered
        //TreeMap - ordered


//        Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"One");
        map.put(2,"Two");
        map.put(1,"One");

        System.out.println("map " + map);

        if(!map.containsKey(1)){
            map.put(1,"One again");
        }

        System.out.println("map " + map);

        map.put(1,"iiii");

        System.out.println("map " + map);

        //iterate
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }

        for(String val :  map.values()){
            System.out.println("value " + val);
        }

        for(Integer key : map.keySet()){
            System.out.println("key " + key);
        }

        System.out.println(map.containsValue("one"));
        System.out.println(map.containsKey(2));

        map.remove(2);
        System.out.println(map);


    }
}