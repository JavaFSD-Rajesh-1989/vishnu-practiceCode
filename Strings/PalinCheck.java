package Strings;

public class PalinCheck {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(palinCheck(s));
    
    }
    static boolean palinCheck(String s){
       int i=0;
       int j=s.length()-1;
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}
