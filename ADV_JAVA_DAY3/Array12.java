package ADV_JAVA_DAY3;
//Find all pairs with given sum.
import java.util.HashSet;

public class Array12 {
    public static void findpair(int []arr,int target){
        HashSet<Integer>set=new HashSet<>();
        for (int n:arr) {
            int diff=target-n;
            if(set.contains(diff)){
                System.out.println(diff+" ");
            }
            set.add(n);

        }
    }
    public static void main(String[] args) {
     int[]arr={2,4,3,5,7,8,-1};
     int target=7;
     findpair(arr,target);
    }
}
