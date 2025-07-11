package ADV_JAVA_DAY3;

import java.util.HashSet;
import java.util.Iterator;

//To print intersection of two sets.
//Hashset- is used to store unique elements.
public class Array4 {
    public static void main(String[] args) {
        HashSet<Integer>list=new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(40);
        HashSet<Integer>list2=new HashSet<>();
        list2.add(1);
        list2.add(2);
        list2.add(9);
        list2.add(89);
        list.retainAll(list2);
        System.out.println(list);
        System.out.println("---------------------------------------------------------");
        for (Integer n1:list) {
            System.out.println(n1);
        }
        System.out.println("---------------------------------------------------------");
        Iterator<Integer>itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
