package ADV_JAVA_DAY3;

import java.util.ArrayList;

//array contains 1 to n elements then find missing no.'s in array.
public class Array7 {
    public static void main(String[] args) {
        int arr[]={2,9,4,5,1,8,6};
        int n=9;
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int num:arr) {
            list.add(num);
           }
        for (int i = 1; i <=n ; i++) {
            if(!list.contains(i)){
                System.out.println(i);

            }
        }
    }
}
