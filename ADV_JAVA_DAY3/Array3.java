package ADV_JAVA_DAY3;

import java.util.Scanner;

//To find second largest element in the array.
public class Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2;
        if(max==arr[0]){
            max2=arr[1];
        }else{
            max2=arr[0];
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max2&&arr[i]<max){
                max2=arr[i];
            }
        }
        System.out.println("Second Greater= "+max2);

    }
}
