package BST;

public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> myBST= new BinarySearchTree<>();

        myBST.insert(20);
        myBST.insert(6);
        myBST.insert(25);
        myBST.insert(55);
        myBST.insert(56);
        myBST.insert(2);
        myBST.insert(7);
        myBST.insert(51);
        myBST.insert(75);
        myBST.insert(1);

         myBST.traverse();

//        System.out.println("Hi Now searching");
//        System.out.println(myBST.search(51));

        myBST.delete(20);

        myBST.traverse();
    }

}
