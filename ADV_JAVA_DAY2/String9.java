package ADV_JAVA_DAY2;
//To Arrange the word of string in ascending order.
public class String9 {
    public static void main(String[] args) {
        String str="This is test";
        String str1[]=str.split(" ");
        for (int i = 1; i < str1.length ; i++) {
            for (int j = 0; j <str1.length-1 ; j++) {
               if(str1[j].compareTo(str1[j+1])>0){
                   String temp=str1[j];
                   str1[j]=str1[j+1];
                   str1[j+1]=temp;
               }
            }
        }
        for (int i = 0; i < str1.length ; i++) {
            System.out.println(str1[i]);
        }
    }
}
