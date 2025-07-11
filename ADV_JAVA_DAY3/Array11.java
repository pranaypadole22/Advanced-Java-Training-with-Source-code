package ADV_JAVA_DAY3;

import java.util.ArrayList;

//Check two array are equal or not.
public class Array11 {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={1,2,3,5,6,8};
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for (int n:arr1) {
            list1.add(n);
        }
        for (int n:arr2) {
            list2.add(n);
        }
        if(list1.equals(list2)){
            System.out.println("Both arrays are equal");
        }else{
            System.out.println("Both arrays are different");
        }
    }
}
