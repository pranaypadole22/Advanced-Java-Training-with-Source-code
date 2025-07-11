package day_1_JAVA;

import java.util.Scanner;
//Check 1st number is divisible by 2 or not without using mod operator.
public class DivisibleChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        int c=num1/num2;
        if (c*num2==num1){
            System.out.println(num1+"is divisible by"+num2);
        }else{
            System.out.println("Not divisible");
        }
    }
}
//print its reverse number