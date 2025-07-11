package ADV_JAVA_DAY2;
//WAF to accept two string and swap that two string without using third object
//n1=10,n2=20;
//n1=n1+n2;   //30
//n2=n1-n2   //10
//n1=n1-n2  //20
public class String6 {
    public static void swap(String s1,String s2){
        System.out.println("Before Swap: ");
        System.out.println("S1: "+s1);
        System.out.println("S2: "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("After Swap: ");
        System.out.println("S1:"+s1);
        System.out.println("S2:"+s2);

    }
    public static void main(String[] args) {
        swap("Pranay","Padole");
    }
}
