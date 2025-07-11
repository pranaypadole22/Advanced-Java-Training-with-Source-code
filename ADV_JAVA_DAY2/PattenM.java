package ADV_JAVA_DAY2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenM {
    public static  void check(String s1,String s2){
        Pattern pattern=Pattern.compile(s2);
        Matcher matcher=pattern.matcher(s1);
        int count=0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        check("This is test is is is is is is","is");
    }
}
