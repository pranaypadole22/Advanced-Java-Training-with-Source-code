package AdV_JAVA_DAY5;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: "+list);
        Collections.reverse(list);
        System.out.println("Reversed LinkedList");
        System.out.println(list);

    }
}
