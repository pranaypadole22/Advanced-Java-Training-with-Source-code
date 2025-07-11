package AdV_JAVA_DAY5;
//WAP two merged linked list.
import java.util.*;
public class LinkedList2 {
    public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
        LinkedList<Integer> merged = new LinkedList<>();
        ListIterator<Integer> itA = a.listIterator();
        ListIterator<Integer> itB = b.listIterator();

        Integer valA = itA.hasNext() ? itA.next() : null;
        Integer valB = itB.hasNext() ? itB.next() : null;
        while (valA != null && valB != null) {
            if (valA <= valB) {
                merged.add(valA);
                valA = itA.hasNext() ? itA.next() : null;
            } else {
                merged.add(valB);
                valB = itB.hasNext() ? itB.next() : null;
            }
        }
        while (valA != null) {
            merged.add(valA);
            valA = itA.hasNext() ? itA.next() : null;
        }
        while (valB != null) {
            merged.add(valB);
            valB = itB.hasNext() ? itB.next() : null;
        }
        return merged;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        LinkedList<Integer> merged = merge(list1, list2);
        System.out.println("Merged: " + merged);
    }
}
