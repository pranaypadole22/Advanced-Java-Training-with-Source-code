package ADV_JAVA_DAY2;
//WAP to remove all vowel charater from the string.

public class String13 {
    public static void replaceVowels(String s1){
        String str=s1.replaceAll("[aeiouAEIOU]","");
        System.out.println(str);
    }

    public static void main(String[] args) {
        replaceVowels("Pranay");
    }
}
