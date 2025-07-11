package day_1_JAVA;

public class TrianglePattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){//for deciding row
            for(int k=4;k>=i;k--){//for printing space
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){//for printing star
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
