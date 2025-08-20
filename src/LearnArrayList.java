import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();

        studentName.add("Palak");
        System.out.println(studentName);
        studentName.add("Karl");
        System.out.println(studentName);
        studentName.add(0,"Palak Bhushan"); // adding at particular index
        System.out.println(studentName);

        System.out.println("-------------------------------\n\n");

        ArrayList<String> teacherName = new ArrayList<>();
        teacherName.add("maice");
        System.out.println(teacherName);
        teacherName.add("Karl dec");
        System.out.println(teacherName);

        //update the elem at idx
        studentName.set(1, "Palak Sri");

        //check elem is present or not
        System.out.println(studentName.contains("Karl Bhushan"));

        studentName.addAll(teacherName); //appending one to another
        System.out.println(studentName);

        //fetching from ArrayList
        System.out.println(studentName.get(1));

        System.out.println("-------------------------------\n\n");
        //removing element
        studentName.remove(1); //removing by index
        System.out.println(studentName);

        studentName.remove(String.valueOf("Karl")); //removing by element(overloading)
        System.out.println(studentName);

        System.out.println("-------------------------------\n\n");
        //iterate
        // way 1
        for (int i = 0; i < studentName.size(); i++) {
            System.out.println(studentName.get(i));
        }

        //way 2
        for(String s: studentName){
            System.out.println(s);
        }

        Iterator<String> iterator = studentName.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next()-> " + iterator.next());
        }

        System.out.println("-------------------------------\n\n");

        studentName.clear(); //remove all ele
        System.out.println(studentName);



    }
}