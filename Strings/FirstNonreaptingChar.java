package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonreaptingChar {
    public static void main(String[] args) {
        String s="swiss";
      char c=nonRepeatingChar(s);
      System.out.println("non reapeating char : "+c);
    }
    public static char nonRepeatingChar(String s){
        Map<Character,Integer> charCount=new HashMap<>();
        for(char c:s.toCharArray()){
          charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> ch:charCount.entrySet()){
           System.out.println(ch.getKey()+" :  "+ch.getValue());
        }
        for(int i=0;i<s.length();i++){
            if(charCount.get(s.charAt(i))==1){
               return s.charAt(i);
            }
        }
        return '\0';
    }
}
