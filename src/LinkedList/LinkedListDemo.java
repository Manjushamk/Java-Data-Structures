package LinkedList;

import java.util.HashMap;

public class LinkedListDemo{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.traverseList();

        System.out.println("Person List \n");
        List<Person> personList = new LinkedList<Person>();
        Person person = new Person("Manju",26);
        personList.insert(person);
        personList.insert(new Person("Yashwanth",21));
        personList.insert(new Person("Karthik",27));
        personList.insert(new Person("Harshi",22));

        personList.remove(person);

        personList.traverseList();

    }
}