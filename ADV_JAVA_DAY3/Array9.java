package ADV_JAVA_DAY3;
//Remove duplicate elements from Array.(hint:use HASHSET to store unique elements).
import java.util.HashSet;

public class Array9 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,1,5,8,9,1,2,3,3,5,8,99,87,78,85};
        HashSet<Integer>set=new HashSet<>();
        for (int num:arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}
