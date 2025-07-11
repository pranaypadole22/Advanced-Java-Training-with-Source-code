package ADV_JAVA_DAY2;
//WAF which accept one string and print each character with frequency count.
public class String5 {
    public static  void Occuewnce(String s1){
        char []ch=s1.toCharArray();
        boolean[]b=new boolean[s1.length()];//ffftfffftf- t-true f-false
        for (int i = 0; i < ch.length; i++) {
            if(b[i])continue;                       //Skip already counted character.
            int c=1;
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    b[j]=true;                      //Mark character as counted
                }
            }
            System.out.println(ch[i]+": "+c);
        }
    }
    public static void main(String[] args) {
        Occuewnce("Pranay");
    }
}
