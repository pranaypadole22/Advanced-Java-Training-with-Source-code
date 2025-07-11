package ADV_JAVA_DAY3;
//print symmetric matrix or not.
import java.util.*;
public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Matrix is not square, so it cannot be symmetric.");
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        sc.close();
    }
    }
//WAP to accept 1 2D array and print the sum of diagonal element,uppertriangular elements and lower triangular elements.
//WAP to rotate array by d places.
