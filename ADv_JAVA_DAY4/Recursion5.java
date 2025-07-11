package ADv_JAVA_DAY4;

import java.util.HashMap;
import java.util.Map;

//To find nth fibonacci term using memorization
public class Recursion5 {
    private Map<Integer,Long>memo=new HashMap<>();
    public long fibonacci(int n){
        if(n<=1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        long result=fibonacci(n-1)+fibonacci(n-2);
        memo.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        Recursion5 r=new Recursion5();
        System.out.println(r.fibonacci(6));
    }
}
