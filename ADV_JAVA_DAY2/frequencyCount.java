package ADV_JAVA_DAY2;
public class frequencyCount {
    public static void frequency(String s1){
        for (int i = 0; i <s1.length() ; i++) {
            char ch=s1.charAt(i);
            int count=0;
            boolean alreadyCounted=false;
            for (int j = 0; j <i; j++) {
                if (s1.charAt(j)==ch){
                    alreadyCounted=true;
                    break;
                }
            }
           if(!alreadyCounted){
               for (int k = 0; k <s1.length() ; k++) {
                    if(s1.charAt(k)==ch){
                        count++;
                    }
               }
               System.out.println(ch + " --> " + count);
           }
        }
    }
    public static void main(String[] args) {
        frequency("pranay");
    }
}
