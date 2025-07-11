package ADV_JAVA_DAY2;
//WAF which accept one string and check its pallindrome or not
public class String7 {
    public  static  void pllindrome(String s1){
            StringBuffer sb=new StringBuffer(s1);
            String reverse=sb.reverse().toString();

            if(s1.equals(reverse)){
                System.out.println("Pallindrome");
            }else{
                System.out.println("Not Pallindrome");
            }
    }
    public static void main(String[] args) {
        String str="Nayan";
        String str2="Pranay";
        str2=str2.toLowerCase();
        str=str.toLowerCase();
        pllindrome(str);
        pllindrome(str2);
    }
}
