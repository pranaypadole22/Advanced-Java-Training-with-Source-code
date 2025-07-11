package ADV_JAVA_DAY3;
//reverse an array without using additional array.(Swapping Required).
public class Array6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int num:arr) {
            System.out.println(" "+num);

        }
    }
}
