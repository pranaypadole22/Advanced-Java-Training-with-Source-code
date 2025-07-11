package day_1_JAVA;

import java.util.Scanner;

public class OneZeroPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // Loop for rows
            int value = (i % 2 == 0) ? 0 : 1;   // Even row → 0, Odd row → 1
            for (int j = 1; j <= i; j++) {      // Loop for columns
                System.out.print(value + " ");
            }
            System.out.println();               // Next line after each row
        }
    }
}
