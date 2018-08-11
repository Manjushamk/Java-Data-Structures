package StackArray;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        System.out.println(myStack.peek());
        myStack.push(5);
        myStack.push(7);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        myStack.push(55);
        myStack.push(11);
        myStack.push(9);
        myStack.push(21);
        System.out.println(myStack.size());
    }
}
