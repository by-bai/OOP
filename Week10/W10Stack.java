import java.util.Stack;

public class W10Stack {
    public static void main(String[] args) {
        //expandable array --> ArrayList
        // Python           Java
        // list             ArrayList/LinkedList
        // list             Stack
        // dict             HashMap/TreeMap
        
        //Stack<String> stack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3); 

        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
    }
}