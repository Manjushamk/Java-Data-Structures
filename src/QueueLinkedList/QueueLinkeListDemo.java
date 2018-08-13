package QueueLinkedList;

public class QueueLinkeListDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(9);

        System.out.println(myQueue.size());

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());



    }
}
