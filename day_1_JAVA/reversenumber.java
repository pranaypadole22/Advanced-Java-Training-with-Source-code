package day_1_JAVA;

import java.util.Scanner;

public class reversenumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int rem=num%10;
            num=num/10;
             rev=rem+rev*10;
        }
        System.out.println("The reverse of "+ num +" is "+rev);
    }
}
//WAP to accept any number from user and check number is the armstrong number is not.(1*1*1+5*5*5+3*3*3).power