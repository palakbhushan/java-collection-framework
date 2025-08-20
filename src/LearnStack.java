import java.util.*;

public class LearnStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("-------------------------------\n\n");

        System.out.println("stack: " + stack);
        System.out.println("stack peak: " + stack.peek());

        System.out.println("-------------------------------\n\n");
        stack.pop();
        System.out.println("stack: " + stack);
        System.out.println("stack peak: " + stack.peek());

    }
}