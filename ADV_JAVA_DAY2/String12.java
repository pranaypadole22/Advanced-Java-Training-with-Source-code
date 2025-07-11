package ADV_JAVA_DAY2;
//WAFP to remove a specific character from string
public class String12 {
    public static  void check(String str,String s1,String s2){
         str=str.replace(s1,s2);
        System.out.println(str);
    }

    public static void main(String[] args) {
        check("Pranay","a","s");
    }
}
//find 1st non repeated character from input string.

