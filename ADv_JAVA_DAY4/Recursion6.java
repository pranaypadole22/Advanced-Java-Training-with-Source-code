package ADv_JAVA_DAY4;
//find the sum of digits of given number using recursion.
public class Recursion6 {
    public static int sumDigits(int n){
        if (n==0){//Base_Case....
            return 0;
        }
        int rem =n%10;
         return rem+sumDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(5040));
    }

}
