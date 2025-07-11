package day_1_JAVA;

public class Pluspattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for(int j=1;j<=5;j++){
                if(j==3||i==3){
                    System.out.print(" *");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
//patterns
//1
//2 3
//4 5 6
//7 8 9 10

//1
// 0 0
//1 1 1
//0 0 0 0
//1 1 1 1 1

//WAP count digits in the number which are divisible by 3 or 5.
//WAP to accept two number from user and print multiplication of that two number without using * operator.
//WAp to accept any decimal number from user and print its binary equivalent.
