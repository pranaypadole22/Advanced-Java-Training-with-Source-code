package ADV_JAVA_DAY3;

//WAP to accept 1 2D array and print the sum of diagonal element,uppertriangular elements and lower triangular elements.

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i][i];
        }
        System.out.println("Sum of diagonal elements are: "+sum);
    }
}
