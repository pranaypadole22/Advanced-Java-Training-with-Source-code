package ADV_JAVA_DAY2;
//WAF which takes string as a parameter which contains - value move all hyphens at the beginning of the string
public class String11 {
public static  void move(String s1){
    String res="";
    for (int i = 0; i <s1.length() ; i++) {
        if(s1.charAt(i)=='-'){
            res=s1.charAt(i)+res;
        }else{
            res=res+s1.charAt(i);
        }
        System.out.println(res);
    }


}

    public static void main(String[] args) {

    }
}
