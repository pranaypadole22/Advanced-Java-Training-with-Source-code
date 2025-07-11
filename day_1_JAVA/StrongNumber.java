package day_1_JAVA;

import java.util.Scanner;
//A Strong Number is a number for which the sum of the factorials of its digits is equal to the original number.
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num!=0){
            int d=num%10;
            num=num/10;
            int fact=1;
            for (int i = 1; i <=d ; i++) {
                fact=fact*i;
            }
            sum=sum+fact;
        }
        if(temp==sum){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a strong number");
        }

    }
}
