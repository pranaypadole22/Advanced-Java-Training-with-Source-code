package ADv_JAVA_DAY4;
import java.util.HashSet;
import java.util.Set;
//WAP to check 2 sets are disjoint or not.
public class CF2 {
    public static void main(String[] args) {
        int []arr1={1,2,3};
        int[]arr2={4,5,6};
        boolean isDisjoint=true;
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for (Integer num1:arr1) {
            set1.add(num1);
        }
        for (Integer num2:arr2) {
            set1.add(num2);
        }
        for (Integer num3:set1) {
            if(set2.contains(num3)){
                isDisjoint=false;
                break;
            }
        }
        if (isDisjoint){
            System.out.println("Sets are disjoint");
        }else{
            System.out.println("Not disjoint");
        }
    }
}
