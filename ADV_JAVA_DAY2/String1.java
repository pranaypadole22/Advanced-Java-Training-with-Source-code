package ADV_JAVA_DAY2;
//WAP print the combination of given string as follows
//I/P-Hello
//o/p-elloH
public class String1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        for (int i = 0; i <= s1.length()-1; i++) {
            char st = s1.charAt(0);
             s1 = s1.substring(1);
            s1 = s1 + st;
            System.out.println(s1);
       }
    }

}
