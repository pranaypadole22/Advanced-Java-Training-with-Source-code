package ADV_JAVA_DAY3;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,69,78,96};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
        }
    }

