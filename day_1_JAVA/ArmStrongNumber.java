package day_1_JAVA;
import java.util.Scanner;
//A number is Armstrong if the sum of its digits raised to the power of total digits is equal to the number itself.
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        String s1=String.valueOf(num);
        int l=s1.length();
        int sum=0;
        int temp=num;
        while (num != 0) {
            int d=num%10;
            num=num/10;
            sum=sum+(int)Math.pow(d,l);
        }
        if(temp==sum){
            System.out.println("ArmStrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
