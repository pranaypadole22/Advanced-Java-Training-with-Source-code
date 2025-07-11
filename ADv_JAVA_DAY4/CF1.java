package ADv_JAVA_DAY4;

import java.util.ArrayList;
import java.util.HashMap;

//WAP to remove duplicate elements from Array
public class CF1 {
    public static void main(String[] args) {
        int []arr={2,4,6,8,9,2,5,4,6};
        HashMap<Integer,Boolean>map=new HashMap<Integer,Boolean>();
        ArrayList<Integer>list=new ArrayList<>();
        for (int n:arr) {
            if (!map.containsKey(n)){
                map.put(n,true);
                list.add(n);
            }

        }
        System.out.println("Arrays After removing duplicates: "+list);
    }

}
