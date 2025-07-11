package day_1_JAVA;

import java.util.Scanner;

public class primedigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        boolean flag=true;
        while(num!=0){
            int rem=num%10;
            num=num/10;
            for (int i=2;i<=rem/2;i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
           if(flag){
               System.out.print(rem);
           }
        }
    }

}
