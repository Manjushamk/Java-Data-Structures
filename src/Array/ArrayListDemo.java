package Array;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * Practice ArrayList
 */


public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Manju");
        list.add("Yash");
        list.add("Karthik");

        System.out.println(list.size());
        Object[] array = list.toArray();
        System.out.println(list.get(0));

        for (Object x:array
             ) {
            System.out.println(x);
        }

    }
}
