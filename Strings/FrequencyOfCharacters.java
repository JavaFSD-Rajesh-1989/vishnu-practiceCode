package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="vishnu";
        charfreq(str);
        FrequencyOfChar(str);
        
    }
    public static void charfreq(String s){
        int [] arr=new int[26];

       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            arr[ch-'a']++;
        }
         else if(ch>='A' && ch<='Z'){
            arr[ch-'A']++;
        }
    }
       for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            System.out.println("Frequency of char '" + (char)(i + 'a') + "': " + arr[i]);
        }
    }
}
static void FrequencyOfChar( String s){
    Map<Character,Integer> map=new HashMap<>();
   for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
      if(Character.isLetter(c)){
         map.put(c,map.getOrDefault(c,0)+1);
      }
   }
    for(Map.Entry<Character,Integer> entry:map.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}