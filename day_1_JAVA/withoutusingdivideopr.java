package day_1_JAVA;

import java.util.Scanner;

//wap to accept 2 numbers from user and divide 1st by 2nd print the ans without using divide operator.\.
public class withoutusingdivideopr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        int count=0;
        while(num1>=num2){
            count++;
            num1=num1-num2;
        }
        System.out.println("Division Result: "+count);
    }
}

