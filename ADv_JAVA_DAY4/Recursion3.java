package ADv_JAVA_DAY4;
//find the power of x^y using recursion
public class Recursion3 {
    public static int power(int x,int y){
        if(y==0){
            return 1;
        }
       return x*power(x,y-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
