package ADV_JAVA_DAY2;
import java.util.Arrays;
import java.util.Collections;
//WAFJ which accept twwo string as a parameter and checks strings are anagrams of each other or not.
public class String2 {
    public static void checkAna(String s1,String s2){
        char[] CA1=s1.toCharArray();
        char[] CA2=s2.toCharArray();
        Arrays.sort(CA1);
        Arrays.sort(CA2);
        String newS1=new String(CA1);
        String newS2=new String(CA2);

        if(newS1.equals(newS2)){
             System.out.println("Anagrams");
        }else{
    System.out.println("Not Anagrams");
}
    }
    public static void main(String[] args) {
        checkAna("army","mary");
    }
}
