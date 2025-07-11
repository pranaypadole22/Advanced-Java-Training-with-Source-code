package ADV_JAVA_DAY2;
//WAF which  accept main and subString as parameter and count how many times that substring occured in the main string.
public class String10 {
    public static  void match(String main,String subS){
        int count=0;
        for (int i = 0; i <(main.length()-subS.length()) ; i++) {
           if(main.substring(i,i+subS.length()).equals(subS)){
               count++;
           }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
       match("this is test is ","is");
    }
}
