package ADv_JAVA_DAY4;
//Recursion always required base case.
//WAP to find factorial of given number using recursion.
public class Recursion1 {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*fact(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(fact(7));
    }

}
