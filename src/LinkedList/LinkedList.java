package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> root;
    private int sizeofList;

    @Override
    public void insert(T data) {
        ++this.sizeofList;
        if(root == null){
            this.root = new Node<T>(data);
        }
        else insertAtBeginning(data);
    }

    private void insertAtBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertAtEnd(T data, Node<T> node){
        if(node.getNextNode() != null){
            insertAtEnd(data,node.getNextNode());
        }else{
            Node<T> newNode = new Node<T>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if(this.root == null){
            return;
        }
        --this.sizeofList;
        if(this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        }
        else{
            remove(data,root,root.getNextNode());
        }
    }

    private void remove(T data, Node<T> previousNode, Node actualNode) {
        while(actualNode != null){
            if (actualNode.getData().compareTo(data) == 0){
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeofList;
    }

    @Override
    public void traverseList() {
        if (this.root == null) return;
        Node<T> actualNode = this.root;
        while(actualNode != null){
            System.out.print(actualNode +"->" );
            actualNode = actualNode.getNextNode();
        }
    }

}
