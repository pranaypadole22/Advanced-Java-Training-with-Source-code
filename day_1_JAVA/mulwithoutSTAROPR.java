package day_1_JAVA;
//WAP to accept two number from user and print multiplication of that two number without using * operator.

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;

public class mulwithoutSTAROPR {
    public static void main(String[] args) {
        //follow repetitive addititon.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  1st number: ");
        int num1=sc.nextInt();

        System.out.println("Enter the  2nd number: ");
        int num2=sc.nextInt();
        int result=0;
        for(int i=1;i<=num2;i++){
            result=result+num1;
        }
        System.out.println("Multiplication of two numbers are: "+result);
    }
}
