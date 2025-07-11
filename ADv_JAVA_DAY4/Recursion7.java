package ADv_JAVA_DAY4;

import java.util.HashSet;

//WAP to print union,intersection and difference of 2 two sets.
public class Recursion7 {
    public static void main(String[] args) {
        int []arr1={1,2,3};
        int []arr2={4,5,6};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for (int num1:arr1) {
            set1.add(num1);
             }
        for (int num2:arr2) {
            set1.add(num2);
        }
        //UNION
        HashSet<Integer>union=new HashSet<>(set1);
        union.addAll(set2);
        //InterSection
        HashSet<Integer>intersection=new HashSet<>(set1);
        union.retainAll(set2);
        //Diff.(set-set2)

        HashSet<Integer>diff=new HashSet<>(set1);
        diff.retainAll(set2);
    }


}
