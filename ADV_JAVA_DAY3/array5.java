package ADV_JAVA_DAY3;
//Initialize array with 0 values then move all zeroes at the end of the array.
public class array5 {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,3,6,4};
       int i=0;
        for (int num:arr) {
            if (num!=0){
                arr[i++]=num;
            }
            while(i<arr.length){
                arr[i++]=0;
            }
//            for (int num:arr) {
//                System.out.println(" "+num);
//            }

        }
    }
}
