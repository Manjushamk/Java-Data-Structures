package QueueLinkedList;

public class Queue<T extends Comparable<T>>{
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public int size(){
        return size;
    }

    public void enqueue(T data){
        this.size++;
        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<T>(data);
        this.lastNode.setNextNode(null);

        if(isEmpty()){
            this.firstNode = this.lastNode;
        }else{
            oldLastNode.setNextNode(lastNode);
        }
    }

    public T dequeue(){
        if(isEmpty()){
            this.lastNode = null;
            return null;
        }else{
            this.size--;
            T dequeData = this.firstNode.getData();
            this.firstNode = this.firstNode.getNextNode();
            return dequeData;
        }

    }
}
