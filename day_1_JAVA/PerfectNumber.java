package day_1_JAVA;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;
//Check number is perfect number or not.
//A number is perfect if the sum of all its divisors (except itself) equals the number.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=num/2; i++) {
          if(num%i==0){
              sum=sum+i;
          }
        }
        if(num==sum){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not perfect");
        }
    }
}
