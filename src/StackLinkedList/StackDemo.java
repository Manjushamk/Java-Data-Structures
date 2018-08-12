package StackLinkedList;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(5);
        myStack.push(9);
        myStack.push(8);
        myStack.push(15);

        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
