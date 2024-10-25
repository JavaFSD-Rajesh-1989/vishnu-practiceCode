import java.util.HashMap;
import java.util.Map;

public class OccerenceOfCharacter {
    public static void main(String[] args) {
        String s = "vishnu sunny not cool";
        s = s.toLowerCase();

        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                arr[currentChar - 'a']++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) ('a' + i) + " " + arr[i]);
            }
        }
        OccerenceOfChar(s);
        
    }
    static void OccerenceOfChar(String s){
        Map<Character,Integer> m=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
