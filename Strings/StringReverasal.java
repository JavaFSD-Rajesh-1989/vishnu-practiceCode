package Strings;

import java.util.Arrays;

public class StringReverasal {
    public static void main(String[] args) {
        String s="Sunny day";
       reverse(s);

    }
    static void reverse(String s){
       char[] c=s.toCharArray();
    int start=0;
    int end=c.length-1;
    while(start<end){
        char temp=c[start];
        c[start]=c[end];
        c[end]=c[temp];
        start++;
        end--;
    }

  
    System.out.println(Arrays.toString(c));
    }
    
}
