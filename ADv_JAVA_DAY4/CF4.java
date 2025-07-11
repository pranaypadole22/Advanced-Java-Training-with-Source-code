package ADv_JAVA_DAY4;
import java.util.HashMap;
public class CF4 {
    public static void main(String[] args) {
        String str="helloworld is is is is  good boy";
        String input[]=str.split(" ");
        HashMap<String,Integer> freeqMap=new HashMap<>();
        for (String  s:input) {
            freeqMap.put(s,freeqMap.getOrDefault(s,0)+1);
       }
        System.out.println("Character frequencies: "+freeqMap);
    }
}
