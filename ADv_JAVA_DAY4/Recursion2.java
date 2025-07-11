
package ADv_JAVA_DAY4;
// WAP to print a reverse string using recursion.
public class Recursion2 {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
