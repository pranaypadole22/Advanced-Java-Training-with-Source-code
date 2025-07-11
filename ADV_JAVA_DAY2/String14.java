package ADV_JAVA_DAY2;

public class String14 {
    public static  void check(String str){
        boolean found=false;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("1st non repaeated character is: "+ch);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }

    }

    public static void main(String[] args) {
        check("pranay");
    }
}
