package AdV_JAVA_DAY5;
import java.util.Arrays;
import java.util.Stack;
//WAP to find next greater in array using stack
//I/P-[4,5,2,25]
//O/P-[5,25,25,-1]
public class StackCF2 {
    public static int[] nextGreater(int[]arr){
        int n= arr.length;
        int [] result=new int[n];
        Stack<Integer>stack=new Stack<>();
        for (int i = n-1; i >0 ; i--) {
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return  result;
    }
    public static void main(String[] args) {
        int[]arr={4,5,2,25};
        int [] result=nextGreater(arr);
        System.out.println("ARRAY: "+ Arrays.toString(arr));
        System.out.println("Next greater elements:"+Arrays.toString(result));
    }
}
