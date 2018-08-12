package StackLinkedList;

public class Stack<T extends Comparable<T>> {
    private Node<T> top;
    private int count;

    public void push(T data){
        this.count++;
        if(this.top == null){
            this.top = new Node<T>(data);
        }else{
            Node<T> oldNode = this.top;
            this.top = new Node<T>(data);
            this.top.setNextNode(oldNode);
        }
    }

    public T pop(){
        if(this.top != null){
            T nodeData = this.top.getData();
            Node<T> oldNode = this.top;
            this.top = oldNode.getNextNode();
            oldNode = null;
            return nodeData;
        }
        return null;
    }

    public int size(){
        return count;
    }


    public T peek(){
        return top.getData();
    }

    public boolean isempty(){
        return this.top == null;
    }
}
