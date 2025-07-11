package ADV_JAVA_DAY2;
//Custom caesar cipher Decryption.
//I/P-ABCD. shift key-3;
//O/P-DEFG
public class Decry {
    public static void check(String s1,int key){
        String s2="";
        for (int i = 0; i <s1.length() ; i++) {
            char ch=s1.charAt(i);
            if(Character.isUpperCase(ch)){
                ch=(char)(ch+key);
            }else{
                ch=(char)(ch+key);
                if(ch>90)
                    key=ch-122;
                ch=(char)(96+key);
            }
            s2=s2+ch;
        }
        System.out.println(s2);
    }
    public static void main(String[] args) {

    }
}
