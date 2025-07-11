package ADv_JAVA_DAY4;
//WAP to print nth term of fibonacci series.
public class Recursion4 {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i <n ; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
