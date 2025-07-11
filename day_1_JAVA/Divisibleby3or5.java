package day_1_JAVA;

//WAP count digits in the number which are divisible by 3 or 5.

import java.util.Scanner;

public class Divisibleby3or5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        while(num!=0){
            int d=num%10;
            num=num/10;
            if(d%3==0 ||d%5==0){
                count++;
            }
        }
        System.out.println("Numbers divisible by 3 or 5 are: "+count);

    }
}
