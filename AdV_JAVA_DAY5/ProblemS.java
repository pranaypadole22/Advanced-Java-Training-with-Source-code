package AdV_JAVA_DAY5;

import java.util.Scanner;

//WAP to check whether a given number is happy or not.
public class ProblemS {
    public static boolean isHappy(int n){
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum=sum+d*d;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        if(isHappy(num)){
            System.out.println(num+" is Happy Number");
        }else{
            System.out.println(num+" is not Happy Number");
        }
    }
}
