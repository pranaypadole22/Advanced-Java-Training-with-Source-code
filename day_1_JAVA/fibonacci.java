package day_1_JAVA;
import java.util.Scanner;
//print n terms of fibonacci series
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your range: ");
        int n=sc.nextInt();
        int a=1;
        int  b=0;
        int c=0;
        while(n>=1){
            System.out.print(" "+c);
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}
