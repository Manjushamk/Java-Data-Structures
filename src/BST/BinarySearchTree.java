package BST;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    @Override
    public void insert(T data){
        if(this.root == null){
            this.root = new Node<>(data);
        }else{
            insertion(data,this.root);
        }
    }

    @Override
    public T getMin(){
        if(this.root == null) return null;
        return getMinimum(this.root);
    }

    @Override
    public T getMax(){
        if(this.root == null) return null;
        return getMaximum(this.root);
    }

    @Override
    public void traverse() {
        if(this.root == null){
            System.out.println("Tree is Empty");
        }else{
            inorderTraversal(this.root);
            System.out.println(" ");
//            preorderTraversal(this.root);
//            System.out.println(" ");
//            postorderTraversal(this.root);
        }

    }

    private void inorderTraversal(Node<T> currentNode) {
        if(currentNode.getLeft() != null){
            inorderTraversal(currentNode.getLeft());
        }

        System.out.print(" -> "+currentNode.getData());

        if(currentNode.getRight() != null){
            inorderTraversal(currentNode.getRight());
        }
    }

    private void preorderTraversal(Node<T> currentNode) {

        System.out.print(" -> "+currentNode.getData());

        if(currentNode.getLeft() != null){
            preorderTraversal(currentNode.getLeft());
        }

        if(currentNode.getRight() != null){
            preorderTraversal(currentNode.getRight());
        }
    }

    private void postorderTraversal(Node<T> currentNode) {


        if(currentNode.getLeft() != null){
            postorderTraversal(currentNode.getLeft());
        }

        if(currentNode.getRight() != null){
            postorderTraversal(currentNode.getRight());
        }

        System.out.print(" -> "+currentNode.getData());
    }


    private void insertion(T newData, Node<T> currentNode) {
        if(newData.compareTo(currentNode.getData()) < 0){
            if(currentNode.getLeft() != null){
                insertion(newData, currentNode.getLeft());

            }else{
                Node<T> newNode = new Node<>(newData);
                currentNode.setLeft(newNode);
            }
        }else{
            if(currentNode.getRight() != null){
                insertion(newData, currentNode.getRight());

            }else{
                Node<T> newNode = new Node<>(newData);
                currentNode.setRight(newNode);
            }

        }
    }

    @Override
    public void delete(T deleteData) {
        if(this.root != null){
            this.root = deleteNode(deleteData, this.root);
        }
    }

    private Node<T> deleteNode(T deleteData, Node<T> currentNode){
        //if tree is empty
        if(currentNode == null) return null;
        if(currentNode.getData().compareTo(deleteData) > 0 && currentNode.getLeft() != null){
            currentNode.setLeft(deleteNode(deleteData,currentNode.getLeft()));
        }
        if (currentNode.getData().compareTo(deleteData) < 0 && currentNode.getRight() != null){
            currentNode.setRight(deleteNode(deleteData,currentNode.getRight()));
        }
        else if(currentNode.getData().compareTo(deleteData) == 0){
            if (currentNode.getLeft() == null && currentNode.getRight() == null){
                System.out.println("Deleting leaf node.. ");
                return null;
            }
            else if (currentNode.getLeft() == null){
                System.out.println("having one child in right");
                Node<T> tempNode = currentNode.getRight();
                currentNode = null;
                return tempNode;
            }
            else if (currentNode.getRight() == null){
                System.out.println("having one child in left");
                Node<T> tempNode = currentNode.getLeft();
                currentNode = null;
                return tempNode;
            }
            else{
                System.out.println("Deleting node with two children");
                Node<T> predecessor = getPredecessor(currentNode.getLeft());
                currentNode.setData(predecessor.getData());
                currentNode.setLeft(deleteNode(predecessor.getData(), currentNode.getLeft()));
            }
        }
        else{
            System.out.println("Node not found");
        }
        return currentNode;
    }

    private Node<T> getPredecessor(Node<T> predecessor){
        if(predecessor.getRight() != null) return getPredecessor(predecessor.getRight());
        return predecessor;
    }

    /* without recursion
    @Override
    public T getMaximum() {
        if(this.root != null){
            Node<T> currentNode = this.root;
            while(currentNode.getRight() != null){
                currentNode = currentNode.getRight();
            }
            return currentNode.getData();
        }
        return null;
    }

    @Override
    public T getMinimum() {
        if(this.root != null){
            Node<T> currentNode = this.root;
            while(currentNode.getLeft() != null){
                currentNode = currentNode.getLeft();
            }
            return currentNode.getData();
        }
        return null;
    }

    */

    private T getMaximum(Node<T> currentNode) {
        if(currentNode.getRight() != null) return getMaximum(currentNode.getRight());
        return currentNode.getData();
    }

    private T getMinimum(Node<T> currentNode) {
        if(currentNode.getLeft() != null){
            return getMinimum(currentNode.getLeft());
        }
        return currentNode.getData();
    }

    @Override
    public boolean search(T searchData){
        if(this.root.getData().compareTo(searchData) == 0) return true;
        if(this.root!= null){
            return searchNodes(searchData, this.root);
        }
        return false;
    }

    private boolean searchNodes(T searchData, Node<T> currentNode){
        System.out.println(currentNode.getData());
        if (currentNode.getData().compareTo(searchData) == 0) return true;
        if(searchData.compareTo(currentNode.getData()) < 0 && currentNode.getLeft() != null){
            return searchNodes(searchData, currentNode.getLeft());
        }
        if(searchData.compareTo(currentNode.getData()) > 0 && currentNode.getRight() != null){
            return searchNodes(searchData, currentNode.getRight());
        }
        return false;
    }


}


