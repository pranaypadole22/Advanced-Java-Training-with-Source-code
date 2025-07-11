package ADv_JAVA_DAY4;

import java.util.HashMap;

//WAP to print frequency of each character in string using Map CF..
public class Recursion8 {
    public static void main(String[] args) {
        String str="helloworld";
        HashMap<Character,Integer>freeqMap=new HashMap<>();
        for (char c:str.toCharArray()) {
            freeqMap.put(c,freeqMap.getOrDefault(c,0)+1);

        }
        System.out.println("Character frequencies: "+freeqMap);
    }
}
