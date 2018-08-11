package LinkedList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListUtilDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Manju");
        list.add("Yashwanth");
        list.add("Karthik");
        list.add("Harshi");

        for (String s:list) {
            System.out.println(s);
        }
    }
}
