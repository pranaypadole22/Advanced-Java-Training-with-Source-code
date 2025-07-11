package ADV_JAVA_DAY3;

import java.util.HashSet;

public class Array10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,1,5,8,9,1,2,3,3,5,8,99,87,78,85};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();

        for (int num:arr) {
            if(!set1.add(num)){
                set2.add(num);
            }
        }
        for (int n:set2) {
            System.out.println(n);

        }

    }
}
