package ADv_JAVA_DAY4;
import  java.util.*;
public class BackTracking1 {
    public  static List<List<Integer>>susbsets(int []nums){
        List<List<Integer>>result=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    private static void backtrack(int index,int[]nums,List<Integer>current,List<List<Integer>>result){
        result.add(new ArrayList<>(current));//Add current subset
        for(int i=index;i<nums.length;i++){
            current.add(nums[i] );
            backtrack(i+1,nums,current,result);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        int[]nums={1,2,3};
        List<List<Integer>>allsubsets=susbsets(nums);
        System.out.println("All Subsets: ");
        for (List<Integer>Subset:allsubsets){
            System.out.print(Subset+" ");
        }
    }
}

