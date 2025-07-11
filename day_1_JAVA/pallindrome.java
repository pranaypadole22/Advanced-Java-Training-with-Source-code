package day_1_JAVA;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while (num!=0){
            int rem=num%10;
            num=num/10;
            rev=rem+rev*10;

        }
        if(temp==rev){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
//print prime digits of number