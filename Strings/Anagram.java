package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="vishnu";
        String s1="nuisvh";
        char[] s2=s.toLowerCase().toCharArray();
        char[] s3=s1.toLowerCase().toCharArray();
        Arrays.sort(s2);
        Arrays.sort(s3);
       if( Arrays.equals(s2,s3)){
        System.out.println("Anagram");
       }else{
        System.out.println("not Anagram");
       }
       System.out.println(isAnagram(s, s1));
    }
    static boolean isAnagram(String s,String s1){
        int [] arr=new int[26];
        for(char c:s.toLowerCase().toCharArray()){
            arr[c-'a']++;
        }
        for(char c:s1.toLowerCase().toCharArray()){
            arr[c-'a']--;
        }
        for(int count:arr){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
