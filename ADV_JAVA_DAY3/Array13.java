package ADV_JAVA_DAY3;

import java.util.HashSet;

//print frequency of each array  unique element count.
public class Array13 {
    public static void findfrequency(int []arr){
        HashSet<Integer>set=new HashSet<>();
        boolean flag[]=new boolean[arr.length];
        int count=1;
        for (int i = 0; i < arr.length ; i++) {
            if (flag[i])
                continue;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    flag[j]=true;
                }
            }
            System.out.println(arr[i]+"-->"+count);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,3,4,5,6,6};
       findfrequency(arr);
    }

}
