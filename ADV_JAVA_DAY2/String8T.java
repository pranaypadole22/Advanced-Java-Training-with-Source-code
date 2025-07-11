package ADV_JAVA_DAY2;
import java.util.StringTokenizer;
//StringTOKENIZER.
public class String8T {
    public static void main(String[] args) {
        String s1="This is test";
        StringTokenizer st=new StringTokenizer(s1);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
